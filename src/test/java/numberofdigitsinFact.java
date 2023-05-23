import java.util.ArrayList;

public class numberofdigitsinFact {
    public static int digitsInFactorial(int N) {
        // code here
      
        if(N<0){
            return 0;
        }
        else if(N<=1){
            return 1;
        }
        double digits =0;
        for(int i=2;i<=N;i++){
            digits = (digits+Math.log10(i));
        }
         return (int) (Math.floor(digits)) +1;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(digitsInFactorial(19));

    }

}
