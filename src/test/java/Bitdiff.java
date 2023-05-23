public class Bitdiff {
    public static int countBitsFlip(int a, int b) {
        int bitdiff = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;

        }
        while (a > 0 || b > 0) {
            if ((a & 1) != (b & 1)) {
                bitdiff++;
            }
            a = a >> 1;
            b = b >> 1;
        }
        return bitdiff;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(countBitsFlip(10, 20));

    }

}
