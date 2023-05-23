import java.util.ArrayList;
import java.util.Arrays;

class sortedAndCountArr {
    //Function to find median of the array elements.
    public static boolean checkRotatedAndSorted(int arr[], int num) {

        // Your code here
        boolean flag = false;
        if (isRotated(arr, num)) {
            return true;
        }

        return flag;
    }

    public static boolean isRotated(int arr[], int num) {
        boolean flag = false;
        int sortedArr[] = Arrays.copyOf(arr, num);
        Arrays.sort(sortedArr);

        if (Arrays.equals(arr, sortedArr)) {
            return false;
        }

        // Your code here
        for (int i = 1; i < num; i++) {
            if (arr[i] != sortedArr[num - i]) {
                return false;
            }
        }

        return flag;
    }

    public static void main(String str[]) throws Exception {

        int[] inputArray = new int[]{10, 20, 30, 14};
        int num = inputArray.length;
        System.out.println(checkRotatedAndSorted(inputArray, num));

    }

}
