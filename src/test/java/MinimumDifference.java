public class MinimumDifference {
    public static int MinimumDifference(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
                int absValue = arr[i] - arr[i+1];
                if (absValue < 0) {
                    absValue = -absValue;
                }
                if (min > (absValue)) {
                    min = (absValue);
                }

        }
        // code here
        return min;
    }


    public static void main(String str[]) throws Exception {
        System.out.println(MinimumDifference(new int[]{2, 4, 5, 9, 7}, 5));

    }

}
