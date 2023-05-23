public class GPTerm {
    public static int termOfGP(int A,int B,int N)
    {
        double result=0;
        double commondiff = (double) B/(double)A;
        result = A*Math.pow(commondiff,N-1);
        return (int)Math.floor(result);

    }



    public static void main(String str[]) throws Exception {
        System.out.println(termOfGP(-27,-78,3));

    }

}
