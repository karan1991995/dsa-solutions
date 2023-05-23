import java.util.ArrayList;

public class consecutiveOnes {
    public static int maxConsecutiveOnes(int N) {
        int count = 0;
        int result = 0;
        ArrayList countarr = new ArrayList();
        while (N > 0) {
            if ((N & 1) == 1) {
                count++;
                if(!countarr.contains(count)){
                    countarr.add(count);
                }
            } else {
                count = 0;
            }
            N = N >> 1;
        }
        for (int i = 0; i < countarr.size(); i++) {
            if ((int) countarr.get(i) > result) {
                result = (int) countarr.get(i);
            }
        }
        return result;

    }

    public static void main(String str[]) throws Exception {
        System.out.println(maxConsecutiveOnes(222));

    }

}
