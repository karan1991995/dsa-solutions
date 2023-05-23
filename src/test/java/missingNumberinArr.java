import java.util.HashMap;

class missingNumberinArr {

    static int missingNumberinArr(int[] arr) {
        int result = -1;
        for (int i = 1; i <= 10; i++) {
            if (arr[i - 1] != i) {
                result = arr[i - 1] - 1;
                break;
            }
        }

        return result;

    }

    public static void main(String str[]) throws Exception {
        System.out.println(missingNumberinArr(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));


    }

}
