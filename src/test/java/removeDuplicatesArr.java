class removeDuplicatesArr {
    //Function to find the minimum element in sorted and rotated array.
    public static int removeDuplicates(int[] nums) {
        int actualIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[actualIndex]) {
                actualIndex++;
                nums[actualIndex] = nums[i];
            } else {
                nums[i] = '_';
            }

        }

        return actualIndex + 1;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));


    }

}
