class leftIndex {
    static int leftIndex(int N, int arr[], int X) {
        int leftindex = -1;
        int low = 0;
        int high = N - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] > X) {
                high = mid - 1;

            } else if (arr[mid] < X) {
                low = mid + 1;
            } else if (arr[mid] == X) {
                leftindex = mid;
                high--;

            }
        }
        return leftindex;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(leftIndex(10, new int[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 7}, 3));
    }

}
