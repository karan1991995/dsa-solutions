import java.util.ArrayList;
import java.util.Arrays;

class binAddition {
    //Function to find the minimum element in sorted and rotated array.
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        String bigAlt = "";
        String smallAlt = "";
        String rem = "";
        int smallestLen;

        if (a.length() != b.length()) {
            smallestLen = Math.min(a.length(), b.length());
            rem = smallestLen < a.length() ? a.substring(0, a.length() - smallestLen) : b.substring(0, b.length() - smallestLen);
            bigAlt = smallestLen < a.length() ? a.substring(rem.length()) : b.substring(rem.length());
            smallAlt = smallestLen < a.length() ? b : a;
        } else {
            bigAlt = b;
            smallAlt = a;
            smallestLen = a.length();
        }

        int carry = 0;
        for (int i = smallestLen - 1; i >= 0; i--) {
            int ai = Integer.parseInt(String.valueOf(smallAlt.charAt(i)));
            int bi = Integer.parseInt(String.valueOf(bigAlt.charAt(i)));
            if (ai + bi + carry == 3) {
                carry = 1;
                result.append("1");
            } else if (ai + bi + carry == 2) {
                carry = 1;
                result.append("0");
            } else if (ai + bi + carry == 1) {
                carry = 0;
                result.append("1");
            } else if (ai + bi + carry == 0) {
                carry = 0;
                result.append("0");
            }
        }

        if (rem.length() > 0) {
            for (int i = rem.length() - 1; i >= 0; i--) {
                int remi = Integer.parseInt(String.valueOf(rem.charAt(i)));
                if (remi + carry == 3) {
                    carry = 1;
                    result.append("1");
                } else if (remi + carry == 2) {
                    carry = 1;
                    result.append("0");
                } else if (remi + carry == 1) {
                    carry = 0;
                    result.append("1");
                } else if (remi + carry == 0) {
                    carry = 0;
                    result.append("0");
                }
            }
        }

        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }

    public static void main(String str[]) throws Exception {
        System.out.println(addBinary("110010", "10111"));


    }


}
