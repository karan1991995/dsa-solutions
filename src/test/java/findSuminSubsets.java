import java.util.HashMap;
import java.util.Map;

class findSuminSubsets {

    static boolean findSuminSubsets(int[] arr, int sum) {
        boolean flag = false;
        int i = 0;
        int j = 1;

        while (i < arr.length-1) {
            int subsetElem1 = arr[i];
            int subsetElem2 = arr[j];
            if(sum == arr[i]+arr[j]){
                flag = true;
                break;
            }

            if (j == arr.length - 1 && (i != arr.length - 1)) {
                i++;
                j=i+1;
            }
            else{
                j++;
            }
        }


        return flag;
    }

    //1 2
    //1 4
    //1 6
    //2 4
    //2 6

    public static void main(String str[]) throws Exception {
        System.out.println(findSuminSubsets(new int[]{1, 2, 4, 6}, 5));


    }

}
