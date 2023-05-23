class minAdjDiff {

    static int minAdjDiff(int arr[], int n) {
        // add your code here
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                if (arr[n - 1] > temp)
                    arr[n - 1] = arr[n - 1] - temp;
                else
                    arr[n - 1] = temp - arr[n - 1];
            } else {
                int diff;
                if (arr[i] > arr[i + 1])
                    diff = arr[i] - arr[i + 1];
                else
                    diff = arr[i + 1] - arr[i];
                arr[i] = diff;
            }
        }
        int result = arr[0];
        for (int i = 0; i < n; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
        }
        return result;

    }


    public static void main(String str[]) throws Exception {

        System.out.println(minAdjDiff(new int[]{8, -8, 9, -9, 10, -11, 12}, 7));

    }

}
