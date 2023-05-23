import java.util.HashMap;

class duplicateNuminArr {

    static int duplicateNuminArr(int[] arr) {
        int result = -1;
        HashMap<Integer, Integer> tempMap = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (tempMap.containsKey(arr[i])) {
                tempMap.put(arr[i], 1 + tempMap.get(arr[i]));
            } else {
                tempMap.put(arr[i], 1);
            }
        }

        for (int key : tempMap.keySet()) {
            if (tempMap.get(key) > 1) {
                result = key;
            }
        }
        return result;

    }

    public static void main(String str[]) throws Exception {
        System.out.println(duplicateNuminArr(new int[]{1, 1, 4, 5, 2, 6}));


    }

}
