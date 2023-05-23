public class oddoccuringtwice {
    public static int[] oddoccuringtwo(int[] N) {
        int[] result = new int[0];
        int desolver =0;
            for(int i=0;i<N.length;i++){
                desolver = (desolver^N[i]);
            }
        System.out.println(desolver);
        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(oddoccuringtwo(new int[]{20,15,20,16}));

    }

}
