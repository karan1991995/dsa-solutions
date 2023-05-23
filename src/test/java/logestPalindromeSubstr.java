class logestPalindromeSubstr {

    public static String longestPalindrome(String s) {

        return "";
    }


    public static boolean isPalindrome(String str) {
        int high = str.length() - 1;
        int low = 0;

        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(longestPalindrome("cbbd"));

    }

}
