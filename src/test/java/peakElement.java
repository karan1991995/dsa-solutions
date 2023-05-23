class peakElement {
    public static int peakElement(int[] arr, int n) {
        //add code here.
        int indexOfPeak = 0;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                indexOfPeak = i;
                break;
            }
        }
        return indexOfPeak;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(peakElement(new int[]{1,2,3}, 3));
    }

}
