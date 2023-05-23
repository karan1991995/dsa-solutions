import java.util.Arrays;

public class findNumberOfTrianglesGFG {


    static int findNumberOfTriangles(int A[], int n) {
        int count = 0;

        Arrays.sort(A);
        

        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (A[l] + A[r] > A[i]) {

                    // If it is possible with a[l], a[r]
                    // and a[i] then it is also possible
                    // with a[l+1]..a[r-1], a[r] and a[i]
                    count += r - l;

                    // checking for more possible solutions
                    r--;
                }
                else // if not possible check for
                // higher values of arr[l]
                {
                    l++;
                }
            }
        }
        return count;

    }

    public static void main(String str[]) throws Exception {
        int[] arr1 = new int[]{26, 9, 27, 22, 16, 27};
        System.out.println(findNumberOfTriangles(arr1, 6));

    }
}
