public class countSetBits {
    public static int countSetBits(int N) {
        int count = 0;
        while (N > 0) {
            if (N % 2 != 0) {
                count++;
            }
            N = N / 2;
        }
        return count;
    }
    public static void main(String str[]) throws Exception {
        System.out.println(countSetBits(8));

    }

}
