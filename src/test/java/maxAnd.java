import java.util.ArrayList;

public class maxAnd {
    public static int maxAND(int arr[], int N) {
        int maxvalue = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((arr[i] & arr[j]) > maxvalue) {
                    maxvalue = (arr[i] & arr[j]);
                }
            }
        }
        return maxvalue;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(maxAND(new int[]{4, 8, 16, 2}, 4));

    }

}
