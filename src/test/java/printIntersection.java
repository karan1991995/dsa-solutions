import java.util.*;

public class printIntersection {


    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) {

        TreeSet<Integer> resultList = new TreeSet<>();
        ArrayList<Integer> actualList = new ArrayList<>();
        int i = 0;
        int j = 0;


        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] == arr2[j]) {
                resultList.add(arr1[i]);
                i++;
                j++;

            } else {
                j++;
            }
        }


        Iterator<Integer> iterator = resultList.iterator();
        if (!resultList.isEmpty())
            while (iterator.hasNext()) {
                actualList.add(iterator.next());
            }
        else {
            actualList.add(-1);
        }

        return actualList;
    }

    public static void main(String str[]) throws Exception {
        int[] arr2 = new int[]{1, 4};
        int[] arr1 = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(printIntersection(arr1, arr2, 9, 9));

    }
}
