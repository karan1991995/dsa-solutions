public class findpowerfortwo {
    public static boolean poweroftwo(int N) {
        boolean flag = false;
        double denom =  Math.log10(N);
        double num =  Math.log10(2);
        double range =  (denom/num);
        
          for(int i=1;i<=((int)range);i++){
              if(Math.pow(2,i)==N){
                  flag = true;
              }
          }
        return flag;
    }
    public static void main(String str[]) throws Exception {
        System.out.println(poweroftwo(32));

    }

}
