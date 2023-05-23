public class printonetonusingrecursion {
    public static void printusngrecursion(int N) {
        if (N == 0) {
            return;
        }
        printusngrecursion(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String str[]) throws Exception {
        printusngrecursion(17);

    }

}
