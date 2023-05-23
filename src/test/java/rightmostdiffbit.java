public class rightmostdiffbit {
    public static int posOfRightMostDiffBit(int m, int n) {
        int result =0;
        int intermittent = m^n;
        if(m==n){
            return -1;
        }
        while(intermittent>0){
            result++;
            if((intermittent&1)==1){
                break;
            }
            else{
                intermittent = intermittent >>1;
            }
        }
        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(posOfRightMostDiffBit(52,52));
    }

}
