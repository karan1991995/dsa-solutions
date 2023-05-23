public class maxElementinanArray {
    public static int[] maxElementinanArray(int[] N) {
        int maxarr[] = new int[2];
        int max = 0;
        int maxi =0;
        for(int i=0;i<N.length;i++){
             if(max<N[i]){
                 max = N[i];
                 maxi =i;
             }
        }
        maxarr[0] = maxi;
        maxarr[1] = max;
        return maxarr;
    }


    public static void main(String str[]) throws Exception {
        System.out.println(maxElementinanArray(new int[]{10,32,9,64,88}));

    }

}
