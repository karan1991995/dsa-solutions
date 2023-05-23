import java.util.ArrayList;
import java.util.Arrays;

class StrongestNeighbour {

    public static void maximumAdjacent(int sizeOfArray, int arr[]) {

        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/

        if (sizeOfArray == 1) {
            System.out.print(arr[0]);
        }

        for (int i = 0; i < sizeOfArray; i++) {
            if(i==sizeOfArray-1){
                break;
            }
            if (arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i + 1] + " ");
            }
        }

    }

    public static void main(String str[]) throws Exception {
        int arr[] = new int[]{5,5,5,5,5};
        int length = arr.length;
        maximumAdjacent(length, arr);

    }

}
