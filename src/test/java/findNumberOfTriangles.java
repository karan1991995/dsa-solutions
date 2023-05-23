import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class findNumberOfTriangles {


    static int findNumberOfTriangles(int arr[], int n) {
        int count = 0;
        int i = 0;
        int j = i + 1;
        int k = j + 1;
        Arrays.sort(arr);

        while (i < n - 2 && j < n - 1 && k < n) {
            int a = arr[i];
            int b = arr[j];
            int c = arr[k];

            if ((c < a + b) || (b < a + c) || (a < b + c)) {
                count++;
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
        return count;

    }

    public static void main(String str[]) throws Exception {
        int[] arr1 = new int[]{26, 9, 27, 22, 16, 27};
        System.out.println(findNumberOfTriangles(arr1, 6));

    }
}
