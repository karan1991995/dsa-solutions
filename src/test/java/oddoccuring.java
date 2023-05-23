import java.util.Arrays;

public class oddoccuring {
    public static int oddOccuring(int[] N) {
        int result=0;
        int temp[] = new int[N.length];
        int sizer=0;
        for (int i = 0; i < N.length; i++) {
            int count = 0;
            for (int j = i; j < N.length; j++) {
                if (N[i] == N[j]) {
                    count++;
                }
            }
            if(!doesArrayContainN(N[i],temp)){
                if (count % 2 != 0) {
                    result = N[i];
                }
                else{
                    temp[sizer] = N[i];
                    sizer++;
                }
            }

        }

        return result;
    }

    public static boolean doesArrayContainN(int N, int[]X){
        boolean result = false;
        for(int i=0;i<X.length;i++){
            if(N==X[i]){
                result = true;
            }
        }
             return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(oddOccuring(new int[]{8,7,7,8,8}));

    }

}
