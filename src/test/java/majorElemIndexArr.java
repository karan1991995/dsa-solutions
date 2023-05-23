import java.util.ArrayList;

class majorElemIndexArr {
    public static ArrayList<Integer> majorElemIndexArr(int N[]) {

        int curr = 0;

        ArrayList<Integer> resultarr = new ArrayList<>();

        for (int i = 0; i < N.length; i++) {
            if (N[i] > curr) {
                resultarr = new ArrayList<>();
                curr = N[i];
                resultarr.add(i);
            } else if (N[i] == curr) {
                resultarr.add(i);
            }
        }

        return resultarr;
    }

    public static void main(String str[]) throws Exception {
        int[] inputArray = new int[]{20, 30, 40, 50, 50, 50, 50};
        ArrayList<Integer> ResultArrayList = majorElemIndexArr(inputArray);
        if (ResultArrayList.size() > inputArray.length / 2) {
            for (int i = 0; i < ResultArrayList.size(); i++) {
                if (i == ResultArrayList.size() - 1) {
                    System.out.print(ResultArrayList.get(i));
                } else {
                    System.out.print(ResultArrayList.get(i) + " || ");
                }

            }
        } else {
            System.out.print("-1");
        }
    }

}
