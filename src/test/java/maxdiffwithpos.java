public class maxdiffwithpos {
    public static int maxdiffwithpos(int N[]) {
        int result = 0;
        for (int i = 0; i < N.length; i++) {
            if (i == 0) {
                result = N[i + 1] - N[i];
            }
            for (int j = i + 1; j < N.length; j++) {
                int diff = N[j] - N[i];
                if (result < diff) {
                    result = diff;
                }
            }
        }
        return result;
    }

    public static void main(String str[]) throws Exception {

        System.out.println(maxdiffwithpos(new int[]{2,3,10,6,4,8}));


    }

}
