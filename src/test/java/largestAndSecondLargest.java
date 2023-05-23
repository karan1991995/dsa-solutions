import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class largestAndSecondLargest {

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        //code here.
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> tempArraylist = new ArrayList<>();

        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (!tempArraylist.contains(arr[i]))
                tempArraylist.add(arr[i]);

        }

        if(tempArraylist.size()>1){
            resultList.add(tempArraylist.get(tempArraylist.size() - 1));
            resultList.add(tempArraylist.get(tempArraylist.size() - 2));   
        }
        else{
            resultList.add(tempArraylist.get(tempArraylist.size() - 1));
        }

        return resultList;
    }

    public static void main(String str[]) throws Exception {
        int arr[] = new int[]{10,10,10,10,10,10};
        int length = arr.length;
        System.out.println(largestAndSecondLargest(length, arr));

    }

}
