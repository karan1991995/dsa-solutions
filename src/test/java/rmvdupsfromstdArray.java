public class rmvdupsfromstdArray {
    public static int[] rmvdupsfromstdArray(int N[]) {
        int[] result = new int[N.length];
        int counter =0;

        for (int i = 0; i < N.length; i++) {
            if (i == N.length - 1) {
                result[counter] = N[i];
                break;
            }
            if (N[i] == N[i + 1]) {
                continue;
            } else {
                result[counter] = N[i];
                counter++;
            }
        }
        return result;
    }

    public static void main(String str[]) throws Exception {
        int[] printingarray = rmvdupsfromstdArray(new int[]{10,10,10});
        for (int i = 0; i < printingarray.length; i++) {
            System.out.println(printingarray[i]);
        }

    }

}
