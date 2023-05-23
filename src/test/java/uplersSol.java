class uplersSol {
    //Function to find the minimum element in sorted and rotated array.
    static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            if (A[i] == Y)
                nY += 1;
            if ((nX == nY) && nX > 0)
                result = i;
        }
        return result;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(solution(10, 19, new int[]{6, 42, 11}));
        System.out.println(solution(6, 13, new int[]{13, 13, 1, 6}));
        System.out.println(solution(100, 63, new int[]{100, 63, 1, 6, 2, 13}));

    }

}
