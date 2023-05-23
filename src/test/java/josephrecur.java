public class josephrecur {
    public static int josephrecur(int n,int k) {
     if(n==1){
         return 0;
     }


        return josephrecur(n-1,k);
    }

    public static void main(String str[]) throws Exception {
        System.out.println(josephrecur(5,3));
    }

}
