public class sumofdigusingrecur {
    public static int sumofdigusingrecur(int N) {
        if (N == 0) {
            return 0;
        }
        return (N % 10) + sumofdigusingrecur(N / 10);
    }

    public static void main(String str[]) throws Exception {
        System.out.println(sumofdigusingrecur(172));
    }

}
