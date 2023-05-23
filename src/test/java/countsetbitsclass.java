public class countsetbitsclass {
    public static int countsetbits(int n) {
        int i = 0;
        // ans store sum of set bits from 0 to n
        int ans = 0;
        // while n greater than equal to 2^i
        while ((1 << i) <= n) {
            // This k will get flipped after
            // 2^i iterations
            boolean k = false;
            // change is iterator from 2^i to 1
            int change = 1 << i;
            // This will loop from 0 to n for
            // every bit position
            for (int j = 0; j <= n; j++) {
                if (k == true)
                    ans += 1;
                else
                    ans += 0;
                if (change == 1) {
                    // When change = 1 flip the bit
                    k = !k;
                    // again set change to 2^i
                    change = 1 << i;
                } else {
                    change--;
                }
            }
            // increment the position
            i++;
        }
        return ans;
    }

    public static int shiftleft(int n, int pos) {
        int result = pos << n;
        return result;
    }


    public static double logtwo(int N) {
        double result = Math.log10(N) / Math.log10(2);
        return result;
    }

    public static void main(String str[]) throws Exception {
        //logtwo(4);
        //shiftleft(2, 1);
        countsetbits(3);
    }

}
