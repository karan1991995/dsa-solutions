import java.util.ArrayList;
import java.util.List;

class stockBuyandSell {

    static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        ArrayList<Integer> daysIndexlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (A[i] < A[i + 1] && daysIndexlist.size() == 0) {
                    daysIndexlist.add(i);
                } else if (A[i] > A[i + 1] && daysIndexlist.size() == 1) {
                    daysIndexlist.add(i);
                }
                if (daysIndexlist.size() == 2) {
                    resultList.add(daysIndexlist);
                    daysIndexlist = new ArrayList<>();
                }
            } else {
                if (daysIndexlist.size() == 1 && A[daysIndexlist.get(0)] < A[i]) {
                    daysIndexlist.add(i);
                    resultList.add(daysIndexlist);
                    daysIndexlist = new ArrayList<>();
                }
            }

        }
        return resultList;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(stockBuySell(new int[]{4,2,2,2,4}, 5));

    }

}
