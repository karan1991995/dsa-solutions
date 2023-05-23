import java.util.ArrayList;
import java.util.Arrays;

class missingNumber {

    static int missingNumber(int arr[], int size) {
        Arrays.sort(arr);
        int result = 0;
        int i = 0;
        int counter = 0;
        while (i < size) {
            if (arr[i] >= 0) {
                if (i < size - 1) {
                    if (counter == 0) {
                        if (arr[i] != 1 && arr[i] > 0) {
                            result = 1;
                            break;
                        }
                    }
                    counter++;
                    if ((arr[i + 1] != arr[i] + 1) && (arr[i] != arr[i + 1])) {
                        result = arr[i] + 1;
                        break;
                    }
                } else {
                    if (counter == 0) {
                        result = 1;
                        break;
                    } else {
                        result = arr[i] + 1;
                        break;
                    }

                }
            }
            i++;
        }
        return result;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(missingNumber(new int[]{-47, 1, 4, 49, -18, 10, 26, 18, -11, -38, -24, 36, 44, -11, 45, 20, -16, 28, 17, -49, 47, -48, -33, 42, 2, 6, -49, 30, 36, -9, 15, 39, -6, -31, -10, -21, -19, -33, 47, 21, 31, 25, -41, -23, 17, 6, 47, 3, 36, 15, -44, 33, -31, -26, -22, 21, -18, -21, -47, -31, 20, 18, -42, -35, -10, -1, 46, -27, -32, -5, -4, 1, -29, 5, 29, 38, 14, -22, -9, 0, 43, -50, -16, 14, -26}, 85));

    }

}
