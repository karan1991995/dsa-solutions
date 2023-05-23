import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class divSub {
    static boolean flag = true;

    static String divAndSub(int N) {
        Map<Boolean, String> tempMap = new HashMap<>();
        tempMap.put(true, "Jon");
        tempMap.put(false, "Arya");


        ArrayList<Double> arr = new ArrayList<>();

        if (N != 1) {
            for (int i = 2; i < 6; i++) {
                double temp = N / i;
                if (temp != 1.0) {
                    arr.add(temp);
                }
            }
            for (int i = 2; i < 6; i++) {
                double temp = N - i;
                if (temp != 1.0) {
                    arr.add(temp);
                }
            }
            int min = (int) Math.floor(arr.get(0));
            for (int i = 0; i < arr.size(); i++) {
                if (min > Math.floor(arr.get(i)) && Math.floor(arr.get(i)) >= 0) {
                    min = (int) Math.floor(arr.get(i));
                }
            }
            N = min;
        }

        if ((N == 1 && flag) || (N == 0 && !flag)) {
            return tempMap.get(false);
        }
        if ((N == 0 && flag) || (N == 1 && !flag)) {
            return tempMap.get(true);
        }

        flag = !flag;
        return divAndSub(N);
    }


    public static void main(String str[]) throws Exception {

        System.out.println(divAndSub(3399));

    }

}
