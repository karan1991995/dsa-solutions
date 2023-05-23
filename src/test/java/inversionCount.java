public class inversionCount {
    static long inversionCount(long arr[], long left, long right) {
        long mid = left + (right - left) / 2;
        long result = 0;

        if (left < right) {
            result += inversionCount(arr, left, mid);
            result += inversionCount(arr, mid + 1, right);
            result += inversionCountMerge(arr, left, mid, right);
        }

        return result;
    }

    static long inversionCountMerge(long arr[], long left, long mid, long right) {
        long res = 0;
        long leftarrlength = mid - left + 1;
        long rightarrlength = right - mid;
        long leftarr[] = new long[(int) leftarrlength];
        long rightarr[] = new long[(int) rightarrlength];
        for (int i = 0; i < leftarrlength; i++) {
            leftarr[i] = arr[(int) (i + left)];
        }
        for (int j = 0; j < rightarrlength; j++) {
            rightarr[j] = arr[(int) (j + mid + 1)];
        }
        int i = 0;
        int j = 0;

        while (i < leftarrlength && j < rightarrlength) {
            if (leftarr[i] <= rightarr[j]) {
                i++;
            } else {
                j++;
                res = leftarrlength - i;
            }
        }


        return res;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(inversionCount(new long[]{2, 4, 1, 3, 5}, 0, 4));
    }

}
