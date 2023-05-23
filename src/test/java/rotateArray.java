import java.util.ArrayList;
import java.util.Arrays;

class rotateArray {

    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String str[]) throws Exception {

        rotateArr(new int[]{2,4,6,8,10,12,14,16,18,20}, 3, 10);

    }

}
