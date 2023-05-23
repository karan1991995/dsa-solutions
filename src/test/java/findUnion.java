import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class findUnion {


    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {

        HashSet<Integer> resultList = new HashSet<>();
        ArrayList<Integer> actualList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                resultList.add(arr1[i]);
                i++;

            } else {
                resultList.add(arr2[j]);
                j++;
            }

        }
        while (i < n) {
            resultList.add(arr1[i]);
            i++;
        }
        while (j < m) {
            resultList.add(arr2[j]);
            j++;
        }

        Iterator<Integer> iterator = resultList.iterator();
        while (iterator.hasNext()) {
            actualList.add(iterator.next());

        }
        Collections.sort(actualList);

        return actualList;
    }

    public static void main(String str[]) throws Exception {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3};
        System.out.println(findUnion(arr1, arr2, 5, 3));

    }
}
