import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class maxWater {
    //Function to find the minimum element in sorted and rotated array.
    static int maxWater(int height[], int n) {
        int max = 0;

        // Both the pointers are pointing at the first
        // and the last buildings respectively
        int i = 0, j = n - 1;

        // While the water can be stored between
        // the currently chosen buildings
        while (i < j) {

            // Update maximum water so far and increment i
            if (height[i] < height[j]) {
                max = Math.max(max, (j - i - 1) * height[i]);
                i++;
            }

            // Update maximum water so far and decrement j
            else if (height[j] < height[i]) {
                max = Math.max(max, (j - i - 1) * height[j]);
                j--;
            }

            // Any of the pointers can be updated (or both)
            else {
                max = Math.max(max, (j - i - 1) * height[i]);
                i++;
                j--;
            }
        }

        return max;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(maxWater(new int[]{16,11,16,62,2,97,61,1,66,32,58,48,17,5,93,3,83,91,84,14,5,52,58,26,37,36,81,55,55,40,65,24,97,98,75,88,97,29,45,36,77,40,26,13,84,90,89,91,43,41,51,66,86,63,96,92,8,60,77,99,60,90,59,48,30,49}, 66));
    }

}
