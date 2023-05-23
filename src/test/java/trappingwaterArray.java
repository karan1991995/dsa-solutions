public class trappingwaterArray {
    public static int trappingwaterArray(int N[]) {
        boolean isWaterContained = false;
        int result = 0;
        for (int i = 1; i < N.length - 1; i++) {
            if (N[i] < N[0] && N[i] < N[N.length - 1]) {
                isWaterContained = true;
            }
        }
        if (isWaterContained) {
            for (int i = 0; i < N.length; i++) {
                for (int j = i + 1; j < N.length; j++) {
                    if (N[i] > N[j]) {
                        result += (N[i] - N[j]);
                    }

                }
            }
        }

        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(trappingwaterArray(new int[]{3, 1, 3}));


    }

}
