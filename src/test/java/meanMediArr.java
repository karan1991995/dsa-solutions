import java.util.ArrayList;
import java.util.Arrays;

class meanMediArr {
    //Function to find median of the array elements.
    public static int median(int A[], int N) {
        int result = 0;
        Arrays.sort(A);

        //Your code here
        //If median is fraction then conver it to integer and return
        if (N % 2 != 0) {
            result = A[(N - 1) / 2];
        } else {
            result = (int) Math.floor((A[N / 2] + A[(N / 2) - 1]) / 2);
        }
        return result;

    }

    //Function to find median of the array elements.
    public static int mean(int A[], int N) {
        int sum = 0;
        int result = 0;
        //Your code here
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
        }
        result = sum / N;
        return result;
    }

    public static void main(String str[]) throws Exception {
        int[] inputArray = new int[]{1,2,19,28,5,3}; //1,2,3,5,19,28
        System.out.println("Median " + median(inputArray, inputArray.length));
        System.out.println("Mean " + mean(inputArray, inputArray.length));

    }

}
