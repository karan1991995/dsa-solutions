public class deleteArray {
    public static int[] deleteArray(int[] N, int x) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < N.length; i++) {
            int j = i;
            if(flag){
                break;
            }
            if (N[i] == x) {
                flag = true;
                while (temp < N.length) {
                    if (j == N.length - 1) {
                        N[j] = 0;
                        break;
                    }
                    N[j] = N[j + 1];
                    temp++;
                    j++;
                }
            }

        }
        return N;
    }


    public static void main(String str[]) throws Exception {
        System.out.println(deleteArray(new int[]{1, 2, 4, 5, 6}, 1));

    }

}
