import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class findRepeating {
    //Function to find the minimum element in sorted and rotated array.
    public static Point findRepeating(Integer arr[], int n) {
        //Your code here
        Point resultPoint = new Point();
        Map<Integer, Integer> tempMap = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (tempMap.containsKey(arr[i])) {
                flag = true;
                tempMap.put(arr[i], tempMap.get(arr[i]) + 1);
            } else {
                tempMap.put(arr[i], 1);
            }
        }

        if (flag) {
            for (int key : tempMap.keySet()) {
                if (tempMap.get(key) > 1) {
                    resultPoint.setLocation(key, tempMap.get(key));
                }
            }
        } else {
            resultPoint.setLocation(-1, -1);
        }
        return resultPoint;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(findRepeating(new Integer[]{1, 2, 3, 3, 4}, 5));
    }

}
