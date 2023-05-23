class findFloor {
    static int findFloor(long arr[], int n, long x) {
        //add code here.
        int indexOfFloor = -1;

        for(int i=n-1;i>=0;i--){
            if(arr[i]<=x){
                indexOfFloor = i;
                break;
            }
        }
        return indexOfFloor;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(findFloor(new long[]{1,2,8,10,11,12,19}, 7, 0));
    }

}
