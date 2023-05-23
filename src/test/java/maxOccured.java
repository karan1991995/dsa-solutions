import java.util.HashMap;
import java.util.Map;

class maxOccured {

    public static int maxOccured(int L[], int R[], int n, int maxx) {
        // add your code here
        int result = 0;
        int finalresult = 0;
        int finalresultCount = 0;
        Map<Integer, Integer> tempMap = new HashMap<>();

        while (result <= maxx) {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if ((L[i] <= result) && (result <= R[i])) {
                    counter++;
                }
            }
            if (counter > 0)
                tempMap.put(result, counter);
            result++;
        }

        for (int key : tempMap.keySet()) {

            if (finalresultCount < tempMap.get(key)) {
                finalresultCount = tempMap.get(key);
                finalresult = key;
            }
        }

        return finalresult;

    }


    public static void main(String str[]) throws Exception {

        System.out.println(maxOccured(new int[]{1, 4, 3, 1}, new int[]{15, 8, 5, 4}, 4, 15));

    }

}
