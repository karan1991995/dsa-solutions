import java.util.Stack;


class nextlrgstack {

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long result[] = new long[n];
        result[n - 1] = -1;
        Stack<Long> stk = new Stack<>();
        stk.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (!stk.isEmpty()) {
                if (arr[i] >= stk.peek()) {
                    stk.pop();
                } else {
                    result[i] = stk.peek();
                    break;
                }
            }
            if (result[i] == 0) {
                result[i] = -1;
            }
            stk.push(arr[i]);
        }
        return result;
    }

    public static void main(String str[]) throws Exception {
        long arr[] = new long[]{10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
        nextLargerElement(arr, arr.length);

    }

}
