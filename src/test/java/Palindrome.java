import java.util.HashMap;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int original =x;
        if(x<0){
            return false;
        }
        while (x != 0 && x>0) {
            int units = x % 10;      //3
            reverse= reverse*10 +units;
            x = x / 10;             //12

        }

        if (reverse==original) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String str[]) throws Exception {
        System.out.println(isPalindrome(-1234321));

    }

}
