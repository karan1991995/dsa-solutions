public class bubbleSort {
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static void main(String str[]) throws Exception {
        bubbleSort(new int[]{4, 1, 3, 9, 7}, 5);

    }

}
