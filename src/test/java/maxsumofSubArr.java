class maxSumofSubArr {
    public static int maxSumofSubArr(int N[]) {
        int resultarr[] = new int[N.length];
        int arraycounter = 0;
        int temp = 1;
        int result = 0;

        for (int i = 0; i < N.length; i++) {
            if (N[i] == 1) {
                //temp++;
                if (i == N.length - 1) {
                    break;
                }
                if (N[i] == 1 && N[i + 1] == 1) {
                    temp++;
                    resultarr[arraycounter] = temp;
                    arraycounter++;
                } else {
                    resultarr[arraycounter] = temp;
                    arraycounter++;
                    continue;
                }
            } else {
                temp = 1;
            }
        }
        for (int i = 0; i < resultarr.length; i++) {
            if (result < resultarr[i] && resultarr[i] != 1) {
                result = resultarr[i];
            }
        }
        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(maxSumofSubArr(new int[]{1,0,1}));


    }

}
