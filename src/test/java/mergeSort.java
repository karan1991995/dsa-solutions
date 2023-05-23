public class mergeSort {

    public static int mergeTwoArrays(int arr[], int left, int mid, int right) {
        int res = 0;

        int leftArrayLength = mid - left + 1;
        int rightArrayLength = right - mid;
        int[] leftArr = new int[leftArrayLength];
        int[] rightArr = new int[rightArrayLength];
        for (int i = 0; i < leftArrayLength; ++i) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < rightArrayLength; ++j) {
            rightArr[j] = arr[j + mid + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
                res+=(leftArrayLength-i);
            }
            k++;
        }
        while (i < leftArrayLength) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArrayLength) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        return res;
    }

    public static int mergeSort(int arr[], int left, int right) {
        int res = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            res += mergeSort(arr, left, mid);
            res += mergeSort(arr, (mid + 1), right);
            res += mergeTwoArrays(arr, left, mid, right);

        }
        return res;
    }

    public static void main(String str[]) throws Exception {
        int[] arr = new int[]{2, 4, 1, 3, 5};
        System.out.print(mergeSort(arr, 0, 4));
        //2,1 4,1 4,3

    }
}
