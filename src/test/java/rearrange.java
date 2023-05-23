import java.util.Arrays;

class rearrange {

    public static void rearrange(long arr[], int n) {

        // Your code here
        int indexOfLast = n - 1;
        int insertAtIndex = 0;
        long TargetNum = arr[indexOfLast];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i];
        }
        arr[insertAtIndex] = TargetNum;
        insertAtIndex = insertAtIndex+2;

    }


    public static void main(String str[]) throws Exception {

        rearrange(new long[]{1, 2, 3, 4, 5, 6}, 6);

    }

}
