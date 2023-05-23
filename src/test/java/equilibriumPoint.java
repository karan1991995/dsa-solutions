import java.util.HashMap;
import java.util.Map;

class equilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {
        int resultIndex = 0;
        int low = 0;
        int high = n - 1;
        long sumL = 0;
        long sumR = 0;

        if (n == 1) {
            return 1;
        }
        sumL = sumL + arr[0];
        sumR = sumR + arr[n-1];

        while (low < high) {
            if (sumL < sumR) {
                low++;
                sumL = sumL + arr[low];
            } else {
                high--;
                sumR = sumR + arr[high];
            }

            if (low == high - 2 && sumL == sumR) {
                resultIndex = low + 2;
                break;
            } else {
                resultIndex = -1;
            }
        }

        return resultIndex;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(equilibriumPoint(new long[]{20, 17, 42, 25, 32, 32, 30, 32, 37, 9, 2, 33, 31, 17, 14, 40, 9, 12, 36, 21, 8, 33, 6, 6, 10, 37, 12, 26, 21, 3}, 30));

    }

}
