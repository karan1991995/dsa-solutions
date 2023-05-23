import java.util.Stack;

class KeyValuePair {
    int key;
    long value;

    KeyValuePair(int key, long value) {
        this.key = key;
        this.value = value;
    }

}

class maxAreaRectStack {

    public static long getMaxArea(long hist[], long n) {
        // your code here
        long area = hist[0];
        Stack<KeyValuePair> stk = new Stack<>();
        stk.push(new KeyValuePair(0, hist[0]));

        for (int i = 1; i < n; i++) {
            while (!stk.isEmpty() && hist[i] < stk.peek().value) {
                stk.pop();
            }
            stk.push(new KeyValuePair(i, hist[i]));
            
        }
        return area;
    }

    public static void main(String str[]) throws Exception {
        long arr[] = new long[]{6, 2, 5, 4, 5, 1, 6};
        getMaxArea(arr, arr.length);

    }

}
