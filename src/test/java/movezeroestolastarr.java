public class movezeroestolastarr {
    public static int[] movezeroestolastarr(int N[]) {


        for (int i = 0; i < N.length; i++) {
            if(i==N.length-1){
                break;
            }
           if(N[i]==0&&N[i+1]!=0){
               int temp = N[i];
               N[i] = N[i+1];
               N[i+1] = temp;
               i=-1;
           }
        }
        return N;
    }

    public static void main(String str[]) throws Exception {
        int[] printingarray = movezeroestolastarr(new int[]{0,0,0,10,0,0,0,0});
        for (int i = 0; i < printingarray.length; i++) {
            System.out.println(printingarray[i]);
        }

    }

}
