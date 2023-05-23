import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class subarraySum {
    //Function to find the minimum element in sorted and rotated array.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> resultList = new ArrayList<>();

        int curr_sum = 0;
        boolean flag = false;
        int finalStart = 0;
        int finalEnd = 0;
        int indexCounterForRemovalFromStart = 0;
        int normalIndex=0;
        while(normalIndex<=n){
            if (curr_sum == s) {
                flag = true;
                finalStart = indexCounterForRemovalFromStart+1;
                finalEnd = normalIndex;
                break;
            } else if (curr_sum < s && normalIndex<n) {
                curr_sum += arr[normalIndex];
                normalIndex++;
            } else if (curr_sum > s) {
                curr_sum -= arr[indexCounterForRemovalFromStart];
                indexCounterForRemovalFromStart++;
            }
        }

        if (!flag) {
            resultList.add(-1);
        } else {
            resultList.add(finalStart);
            resultList.add(finalEnd);
        }


        return resultList;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(subarraySum(new int[]{135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134}, 42, 468));
    }

}
