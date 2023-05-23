import org.apache.commons.lang3.ArrayUtils;

class safePos {

    static int safePos(int n, int k) {

        return safePosIndex(n, k) + 1;


    }

    static int safePosIndex(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (safePosIndex(n - 1, k) + k) % n;
        }

    }


    public static void main(String str[]) throws Exception {

        System.out.println(safePos(32, 32));

    }

}
