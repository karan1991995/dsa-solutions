public class exactlyThreeDivisors {
    public static int exactly3Divisors(int N) {
        int threedivs = 0;
        if (N < 4) {
            return 0;
        }
        for (int i = 4; i <= N; i++) {  //i=9
            for (int j = 2; j <= Math.sqrt(i); j++) {  //j=3
                if ((j * j == i) && isPrime(j)) {
                    threedivs++;
                    break;
                }
            }
        }
        return threedivs;
    }

    public static boolean isPrime(int N) {
        boolean flag = true;
        if (N <= 1) {
            return false;
        }

        if (N == 2 || N == 3) return true;

        if (N % 2 == 0 || N % 3 == 0)
            return false;

        for (int i = 5; i <= N / 2; i++) {
            if (N % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(exactly3Divisors(67));

    }

}
