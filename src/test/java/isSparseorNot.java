public class isSparseorNot {
    public static boolean isSparse(int n) {
        boolean flag = true;
        while (n > 0) {
            if ((n & 1) == 1 && ((n >> 1) & 1) == 1) {
                flag = false;
                break;
            }
            n = n >> 1;
        }
        return flag;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(isSparse(3));

    }

}
