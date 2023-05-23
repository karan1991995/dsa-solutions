public class leftrotatedposition {
    public static int[] leftrotatedposition(int N[]) {
        int temp[] = new int[N.length];
        int counter=0;
        for (int i = 0; i < N.length; i++) {
            boolean flag = false;
            for(int j=i+1;j<N.length;j++){
                if(N[i]>N[j]){
                      flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                temp[counter] = N[i];
                counter++;
            }
            if(i==N.length-1){
                temp[counter] = N[i];
                counter++;
            }
        }
        return temp;
    }

    public static void main(String str[]) throws Exception {
        int[] printingarray = leftrotatedposition(new int[]{30,20,10});
        for (int i = 0; i < printingarray.length; i++) {
            if(printingarray[i]==0){
                continue;
            }
            System.out.println(printingarray[i]);
        }

    }

}
