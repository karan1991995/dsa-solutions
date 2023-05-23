import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Stack;


class calculateSpanClass {

    public static int[] calculateSpan(int price[], int n) {
        // Your code here
        int span[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!stk.isEmpty() && price[stk.peek()] <= price[i]) {
                stk.pop();
            }
            span[i] = stk.isEmpty() ? i + 1 : i - stk.peek();
            stk.push(i);
        }

        return span;
    }

    public static void main(String str[]) throws Exception {
        int arr[] = new int[]{100, 80, 60, 70, 60, 75, 85};
        calculateSpan(arr, arr.length);

    }

}
