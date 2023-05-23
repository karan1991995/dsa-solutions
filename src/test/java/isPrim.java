public class isPrim {
    public static boolean isPrime(int N) {


        boolean flag = true;
        for(int i=2;i<=N/2;i++){
            if(N%i==0){
                flag=false;
                break;
            }
        }

      return flag;
    }



    public static void main(String str[]) throws Exception {
        System.out.println(isPrime(13));

    }

}
