public class kthbit {
    public static boolean kthbit(int n, int k) {
        int indexcounter = 0;
        boolean flag = false;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (indexcounter == k) {
                    flag = true;
                    break;
                }

            }
            n = n >> 1;
            indexcounter++;
        }
        return flag;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(kthbit(500, 3));
    }

}
