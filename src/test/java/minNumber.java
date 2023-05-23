class minNumber {
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
        int minNumber = arr[high];

        for (int i = high; i >= low; i--) {
            if (minNumber < arr[i]) {
                break;
            } else {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(minNumber(new int[]{3,4,5,1,2}, 0, 4));
    }

}
