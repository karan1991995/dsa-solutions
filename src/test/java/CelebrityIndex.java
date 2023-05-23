import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Stack;

class CelebrityIndex {
    public static int celebrity(int M[][], int n) {

        HashMap<Integer, Boolean> isCelebrityMap = new HashMap<>();
       // HashMap<Integer, Integer> numberOfKnownPeople = new HashMap<>();

        for (int i = 0; i < M.length; i++) {
            boolean isCelebrityFlag = true;

            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] != 0) {
                    isCelebrityFlag = false;
                    break;
                  //  numberOfKnownPeople.put(i, numberOfKnownPeople.getOrDefault(i, 0) + 1);
                }
//                else {
//                    numberOfKnownPeople.put(i, 0);
//                }
            }

            isCelebrityMap.put(i, isCelebrityFlag);
        }

        if(isCelebrityMap.containsValue(false)){
            for(int key:isCelebrityMap.keySet()) {
                 if(isCelebrityMap.get(key)){
                     return key;
                 }
            }
        }

        return -1;

    }

    public static void main(String str[]) throws Exception {
        int mat[][] = new int[][]{{0, 1}
                , {1, 0}};
        System.out.print(celebrity(mat, mat.length));

    }

}
