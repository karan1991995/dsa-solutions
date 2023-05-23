import java.util.ArrayList;

class oddNumberofFactors {

    static ArrayList<Integer> oddNumberofFactors(int N) {
        // code here

        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(1);
        for (int i = 4; i <= N; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (j * j == i) {
                    resultList.add(i);
                }
            }
        }
        return resultList;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(oddNumberofFactors(25));

    }

}
