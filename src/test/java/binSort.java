public class binSort {
    //Function to sort the array using bubble sort algorithm.
    public static void binSort(int arr[], int n) {


        int j = -1;
        for (int i = 0; i < n; i++) {

            // if number is smaller than 1
            // then swap it with j-th number
            if (arr[i] < 1) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String str[]) throws Exception {
        binSort(new int[]{ 1, 1, 0, 1, 0, 1, 0, 1, 1, 1,
                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 }, 21);
        // 0 1 1 1 0 

    }

}
