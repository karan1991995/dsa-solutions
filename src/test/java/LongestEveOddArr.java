class LongestEveOddArr {
    public static int longestEveOddArr(int N[]) {
        int result = 0;
        int arraycounter = 0;
        int[] resultarr = new int[N.length];
        boolean flag = false;
        for (int i = 0; i < N.length; i++) {
            if (N[i] % 2 == 0 && N[i + 1] % 2 != 0) {
                result++;
                resultarr[arraycounter] = result;
                arraycounter++;


            } else if (N[i] % 2 != 0 && N[i + 1] % 2 == 0) {
                result++;
                resultarr[arraycounter] = result;
                arraycounter++;

            } else if (N[i] % 2 == 0 && N[i + 1] % 2 == 0) {
                result = 0;

            } else if (N[i] % 2 != 0 && N[i + 1] % 2 != 0) {
                result = 0;

            }


        }

        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(longestEveOddArr(new int[]{1, 0, 1}));


    }

}
