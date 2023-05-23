import java.util.ArrayList;
import java.util.List;

class patternArr {

    static List<Integer> pattern(int N) {
        // code here
        ArrayList<Integer> resultList = new ArrayList<>();
        int addingToPattern = 0;
        int indexCounter = 0;
        boolean flag = false;
        resultList.add(N);
        while (addingToPattern != N) {
            if (indexCounter == 0) {
                addingToPattern = N;
            }
            if (addingToPattern > 0 && !flag) {
                addingToPattern = addingToPattern - 5;
                resultList.add(addingToPattern);
                indexCounter++;
            } else {
                flag = true;
                addingToPattern = addingToPattern + 5;
                resultList.add(addingToPattern);
                indexCounter++;
            }
        }

        return resultList;


    }


    public static void main(String str[]) throws Exception {

        System.out.println(pattern(16));

    }

}
