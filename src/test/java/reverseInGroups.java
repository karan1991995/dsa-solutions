import java.util.ArrayList;
import java.util.Arrays;

class reverseInGroups {

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int counter = 1;
        double kdouble = k;
        int i = k * counter - 1;
        int numberOfGroups = (int) Math.ceil(n / kdouble);
        while (i < n) {
            if(resultList.size()== arr.size()){
                break;
            }
            resultList.add(arr.get(i));

            if (i == k * (counter - 1)) {

                if (counter == numberOfGroups) {
                    break;
                }
                counter++;
                if ((k * counter - 1) >= n) {
                    i = n - 1;
                } else {
                    i = k * counter - 1;
                }
                resultList.add(arr.get(i));
            }
            i--;
        }
        arr = resultList;
        System.out.println(arr);
    }

    public static void main(String str[]) throws Exception {

        ArrayList<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        reverseInGroups(arrayOne, arrayOne.size(), 3);

    }

}
