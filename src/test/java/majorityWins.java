class majorityWins {

    public static int majorityWins(int arr[], int x, int y) {
        // code here
        int countOfX = 0;
        int countOfY = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] ^ x) == 0) {
                countOfX++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] ^ y) == 0) {
                countOfY++;
            }
        }
        if (countOfX == countOfY) {
            if (x < y) {
                return x;
            } else {
                return y;
            }
        }
        return (countOfX > countOfY ? x : y);
    }

    public static void main(String str[]) throws Exception {

        System.out.println(majorityWins(new int[]{1,2,3,4,5,6,7,8}, 1, 7));

    }

}
