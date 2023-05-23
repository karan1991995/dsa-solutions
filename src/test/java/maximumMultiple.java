import java.util.*;

class maximumMultiple {

    public static long maximumMultiple(int N, int[] A) {
        TreeMap<Integer, String> map = new TreeMap<>();
        HashSet<Integer> Aset = new HashSet(Arrays.asList(A));
        TreeSet<Integer> arrayB = new TreeSet<>();
        int counter = 1;


        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                map.put(A[j] * A[i], A[j] + ":" + A[i]);
            }
        }
        for (int key : map.keySet()) {
            arrayB.add(key);
            String str[]=map.get(key).split(":");
            Aset.remove(str[0]);
            Aset.remove(str[1]);
            
            if (counter == (N / 2)) {
                break;
            }
            counter++;
        }

        return arrayB.last();
    }

    public static void main(String str[]) throws Exception {

        System.out.println(maximumMultiple(8, new int[]{-11,8,10,9,-19,-8,19,-14 }));

    }

}
