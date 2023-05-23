import java.util.HashMap;
import java.util.Map;

class reverseInt {
    //Function to find the minimum element in sorted and rotated array.
    public static int reverse(int x) {
        int res = 0;
        boolean negflag = false;
        if (x < 0) {
            negflag = true;
            x = -x;
        }
        while (x > 0) {
            int rem = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10))  {
                return 0;
            }
            res = res * 10 + rem;
            x = x / 10;
        }

        if (negflag) {
            res = -res;
        }
        return res;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(reverse(1534236469));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }

}
