class climbStairsclass {
    //Function to find the minimum element in sorted and rotated array.
    public static int climbStairs(int n) {
      int one=1, two =1;
      for(int i=1;i<n;i++){
          int temp=one;
          one = one+two;
          two = temp;
      }
      return one;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(climbStairs(35));
    }


}
