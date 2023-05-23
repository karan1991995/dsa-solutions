public class missingNumberinaArray {
    public static int missinginArray(int[] N) {
        int result1 = 0;

        for (int i = 0; i < N.length; i++) {
            result1 = result1 ^ N[i];
        }

        return result1;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(missinginArray(new int[]{4,3,3,2,4,4,4,5,5}));

    }

}
