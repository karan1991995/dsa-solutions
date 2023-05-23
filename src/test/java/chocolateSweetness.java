class chocolateSweetness {

    static int chocolateSweetness(int arr[], int k) {
        int result = Integer.MAX_VALUE;
        int sizeofEachGroup = (arr.length / k);
        int sweetnessOfEachGroupArr[] = new int[k];
        int sweetnessIndex = 0;

        int i = 0;
        int j = 0;

        int ithlastIndex = arr.length - sizeofEachGroup + 1;

        while (i < ithlastIndex) {
            int sumOfEachGroupSweetness = 0;
            while (j < i + sizeofEachGroup) {
                sumOfEachGroupSweetness += arr[j];
                j++;
            }
            sweetnessOfEachGroupArr[sweetnessIndex] = sumOfEachGroupSweetness;
            sweetnessIndex++;
            i += sizeofEachGroup;
        }
        for (int l = 0; l < sweetnessOfEachGroupArr.length; l++) {
            if (result > sweetnessOfEachGroupArr[l]) {
                result = sweetnessOfEachGroupArr[l];
            }


        }
        return result;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(chocolateSweetness(new int[]{6, 3, 2, 8, 7, 5, 7, 1, 2}, 3));

    }

}
