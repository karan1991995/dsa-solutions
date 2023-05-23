class removeElemArr {
    //Function to find the minimum element in sorted and rotated array.
    public static int removeElement(int[] nums,int val) {
        int actualIndex = 0;
        int valcount=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[actualIndex] = nums[i];
                actualIndex++;
            } else {
                nums[i] = '_';
                valcount++;
            }
        }

        return nums.length-valcount;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(removeElement(new int[]{3,2,2,3},3));


    }

}
