import java.util.ArrayList;
import java.util.HashMap;

public class freqinSortedArray {
    public static HashMap<Integer, Integer> freqinSortedArray(int N[]) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < N.length; i++) {
            int count = 1;
            if (i == N.length - 1) {
                if (!result.containsKey(N[i]))
                    result.put(N[i], count);

                break;
            }
            for (int j = i + 1; j < N.length; j++) {

                if (N[j] == N[i]) {
                    count++;
                    if (j == N.length - 1) {
                        if (!result.containsKey(N[i]))
                            result.put(N[i], count);
                    }
                } else {
                    if (!result.containsKey(N[i]))
                        result.put(N[i], count);
                }
            }

        }
        return result;
    }

    public static void main(String str[]) throws Exception {

        System.out.println(freqinSortedArray(new int[]{10, 20, 30}));


    }

}
