class CountOnesBinary {
    public static int countOnes(int arr[], int N){

        int low = 0;
        int high = N - 1;
        int lastOneIndex = 0;

        while (low <= high) {
            if (arr[high] == 1) {
                lastOneIndex = high;
                return lastOneIndex + 1;
            }
            high--;

        }

        return 0;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(countOnes(new int[]{1, 0, 0, 0, 0, 0, 0, 0}, 8));


    }

}
