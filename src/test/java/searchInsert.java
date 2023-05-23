class searchInsert {
    //Function to find the minimum element in sorted and rotated array.
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if(target>nums[nums.length-1]){
            return nums.length;
        } else if(nums[0]>target){
              return 0;
        }
        if(nums[0]==target){
            return 0;
        }

        while (low < high) {
            mid = ((low + high) / 2);
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }
        return high+1;

    }

    public static void main(String str[]) throws Exception {
        System.out.println(searchInsert(new int[]{1}, 1));


    }

}
