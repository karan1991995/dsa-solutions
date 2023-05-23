import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class kthMex {

    public static int kthMex(int n, int k, int arr[]) {
        // code here
        HashSet<Integer> myset = new HashSet();
        int checkCounter = 1;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            myset.add(arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i <= max; i++) {
            if (!myset.contains(i)) {
                if (checkCounter == k) {
                    return i;
                }
                checkCounter++;
            }

        }

        return (max + (k - checkCounter + 1));

    }

    public static void main(String str[]) throws Exception {

        System.out.println(kthMex(20, 9, new int[]{14, 13, 17, 7, 13, 5, 16, 18, 10, 17, 8, 0, 0, 17, 1, 3, 7, 16, 11, 14}));

    }

}
