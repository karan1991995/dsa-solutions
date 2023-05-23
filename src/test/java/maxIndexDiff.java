class maxIndexDiff {

    static int maxIndexDiff(int arr[], int n) {

        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++)
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);

        // leftMin[i] = min{ arr[i...(n-1] }

        int maxDist = Integer.MIN_VALUE;
        int i = n - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (arr[j] >= leftMin[i]) {
                maxDist = Math.max(maxDist, j - i);
                i--;
            } else
                j--;
        }

        return maxDist;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(maxIndexDiff(new int[]{92, 71, 39, 88, 3, 24, 33, 46, 24, 6, 31, 54, 65}, 13));

    }

}
