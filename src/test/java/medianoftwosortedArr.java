class medianoftwosortedArr {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int resultArr[] = new int[nums1.length + nums2.length];
        double median;
        int resultIndex = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                resultArr[resultIndex] = nums1[i];
                resultIndex++;
                i++;
            } else if (nums1[i] > nums2[j]) {
                resultArr[resultIndex] = nums2[j];
                resultIndex++;
                j++;
            } else {
                resultArr[resultIndex] = nums2[j];
                resultIndex++;
                resultArr[resultIndex] = nums1[i];
                resultIndex++;
                i++;
                j++;
            }
        }

        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length) {
                resultArr[resultIndex] = nums1[i];
                resultIndex++;
                i++;
            } else {
                resultArr[resultIndex] = nums2[j];
                resultIndex++;
                j++;
            }
        }
        if (resultArr.length % 2 == 0) {
            double elem1 = resultArr[(resultArr.length / 2) - 1];
            double elem2 = resultArr[resultArr.length / 2];

            median = (elem1 + elem2) / 2;
            return median;
        } else {
            median = resultArr[resultArr.length / 2];
            return median;
        }

    }


    public static void main(String str[]) throws Exception {

        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));

    }

}
