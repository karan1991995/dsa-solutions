import java.util.ArrayList;

class leaders {

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> ResultList = new ArrayList<>();
        int i = n - 1;
        int maxtemp = arr[i];
        ResultList.add(arr[i]);
        while (i >= 0) {
            if (i != n - 1)
                if (maxtemp <= arr[i]) {
                    maxtemp = arr[i];
                    ResultList.add(arr[i]);
                }

            i--;
        }

        int low = 0;
        int high = ResultList.size() - 1;
        while (low < high) {
            int temp = ResultList.get(low);
            ResultList.set(low, ResultList.get(high));
            ResultList.set(high, temp);
            low++;
            high--;
        }

        return ResultList;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(leaders(new int[]{16, 17, 4, 3, 5, 2}, 6));

    }

}
