class findSqrt {
    //Function to find the minimum element in sorted and rotated array.
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int result = 1;
        for (int i = 1; i <= (x / 2); i++) {
            if ((long)i * i > x) {
                return i - 1;
            } else if (i * i == x) {
                return i;
            } else{
                result = i;
            }
        }

        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(mySqrt(2147483647));


    }


}
