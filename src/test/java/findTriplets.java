import java.util.Arrays;

public class findTriplets {


    public static boolean findTriplets(int arr[], int n) {
        int count = 0;
        int i = 0;
        int j = i + 1;
        int k = j + 1;
        boolean flag = false;

        while (i < n - 2 && j < n - 1 && k < n) {
            int a = arr[i];
            int b = arr[j];
            int c = arr[k];

            if (a + b + c == 0) {
                flag = true;
                break;
            }

            if (k == (n - 1) && (j != (n - 2))) {

                j++;
                k = j + 1;
                continue;
            }
            if (j == (n - 2) && (k == (n - 1))) {
                i++;
                j = i + 1;
                k = j + 1;
                continue;
            }
            k++;
        }
        return flag;

    }

    public static void main(String str[]) throws Exception {
        int[] arr1 = new int[]{1, 2, 3};
        System.out.println(findTriplets(arr1, 3));

    }
}
