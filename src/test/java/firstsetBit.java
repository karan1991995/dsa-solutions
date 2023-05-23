public class firstsetBit {
    public static int firstsetBit(int N) {
        int result = 0;
         while(N>0){
             result++;
             if((N&1)==1){
              break;
             }
             N=(N>>1);
         }
        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(firstsetBit(8));

    }

}
