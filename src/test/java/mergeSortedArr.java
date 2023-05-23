class mergeSortedArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[nums1.length];
        int i = 0, j = 0, k = 0;


        while (i < m && j < n && k < nums1.length) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] == nums2[j]) {
                temp[k] = nums1[i];
                k++;
                i++;
                temp[k] = nums2[j];
                k++;
                j++;
            } else {
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m && k < nums1.length) {
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n && k < nums1.length) {
            temp[k] = nums2[j];
            k++;
            j++;
        }
        int index = 0;
        if(nums1.length==0){
            nums1 = nums2;
        }
        else{
            for (int l : temp) {
                nums1[index] = l;
                index++;
            }
        }

    }

    public static void main(String str[]) throws Exception {
        merge(new int[]{}, 0, new int[]{1}, 1);
    }


}
