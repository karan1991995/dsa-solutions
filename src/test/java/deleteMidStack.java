import java.util.*;

class deleteMidStack {
    //Function to find the minimum element in sorted and rotated array.
    public static void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here

        ArrayDeque<Integer> minHeap = new ArrayDeque<>();
        ArrayDeque<Integer> maxHeap = new ArrayDeque<>();
        Stack<Integer> resultStack = new Stack<>();
        int minHeapCount = 1;
        int maxHeapCount = (sizeOfStack / 2) + 1;

        if (sizeOfStack % 2 != 0) {
            minHeapCount = 1;
            maxHeapCount = (sizeOfStack / 2) + 1;
            while (minHeapCount <= (sizeOfStack / 2)) {
                int stackelem = s.pop();
                minHeap.add(stackelem);
                minHeapCount++;
            }

            while (maxHeapCount <= sizeOfStack) {
                if (maxHeapCount == (sizeOfStack / 2) + 1) {
                    s.pop();
                    maxHeapCount++;
                    continue;
                } else {
                    int stackelem = s.pop();
                    maxHeap.add(stackelem);
                    maxHeapCount++;
                }

            }
        } else {
            minHeapCount = 1;
            maxHeapCount = (sizeOfStack / 2) + 1;
            while (minHeapCount <= (sizeOfStack / 2)) {
                int stackelem = s.pop();
                minHeap.add(stackelem);
                minHeapCount++;
            }

            while (maxHeapCount <= sizeOfStack) {
                if (maxHeapCount == (sizeOfStack / 2) + 1) {
                    s.pop();
                    maxHeapCount++;
                    continue;
                } else {
                    int stackelem = s.pop();
                    maxHeap.add(stackelem);
                    maxHeapCount++;
                }
            }
        }

        for (int elem : minHeap) {
            resultStack.push(elem);
        }

        for (int elem : maxHeap) {
            resultStack.push(elem);
        }

        for (int elem : resultStack) {
            System.out.print(elem + " ");
        }

    }

    public static void main(String str[]) throws Exception {
        int arr[] = new int[]{1, 34, 23, 17, 37, 42, 13, 39, 0, 53, 49, 6, 71};
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stk.push(arr[i]);
        }
        deleteMid(stk, stk.size());

    }

}
