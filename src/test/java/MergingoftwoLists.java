import java.util.ArrayList;
import java.util.HashSet;

class MergingoftwoLists {

    static HashSet MergingoftwoLists(int[] arr1, int arr2[]) {
       HashSet<Integer> resultList = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                resultList.add(arr1[i]);
                i++;
            } else {
                resultList.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            resultList.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            resultList.add(arr2[j]);
            j++;
        }
        return resultList;

    }

    public static void main(String str[]) throws Exception {
        System.out.println(MergingoftwoLists(new int[]{1, 2, 3, 4, 4, 5}, new int[]{7, 8, 9}));
        // OP: 1 2 3 4 5 7 8 9

    }

}
