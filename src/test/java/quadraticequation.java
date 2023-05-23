import java.util.*;

public class quadraticequation {

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> result;
        Set<Integer> storage = new HashSet<>();

        int lcmofthree = lcm(a, b, c);
        if(lcmofthree>0){
            a = a / lcmofthree;
            b = b / lcmofthree;
            c = c / lcmofthree;
        }


        int product = a * c;
        for (int i = 1; i <= product; i++) {
            if (product % i == 0) {
                temp.add(i);
            }
        }
        for (int j = 0; j < temp.size(); j++) {
            for (int k = 0; k < temp.size(); k++) {
                if ((b == temp.get(j) + temp.get(k) && (c == temp.get(j) * temp.get(k)))) {
                    storage.add(-temp.get(j));
                    storage.add(-temp.get(k));
                } else if ((b == temp.get(j) - temp.get(k)) && (c == temp.get(j) * temp.get(k))) {
                    storage.add(-temp.get(j));
                    storage.add(temp.get(k));
                } else if ((b == temp.get(k) - temp.get(j)) && (c == temp.get(j) * temp.get(k))) {
                    storage.add(temp.get(j));
                    storage.add(-temp.get(k));
                } else if ((b == -(temp.get(j) + temp.get(k))) && (c == temp.get(j) * temp.get(k))) {
                    storage.add(temp.get(j));
                    storage.add(temp.get(k));
                }
            }
        }
        result = new ArrayList<>(storage);
        if (result.isEmpty()) {
            result.add(-1);
        }
        if (result.size() == 1) {
            result.add(result.get(0));
        } else if (result.size() == 2) {
            if (result.get(0) < result.get(1)) {
                int swap = result.get(0);
                result.set(0, result.get(1));
                result.set(1, swap);
            }

        }

        return result;
    }

    public static int lcm(int a, int b, int c) {
        int finallcm = 0;
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (c < 0) {
            c = -c;
        }
        int smallest = (a < c) ? (a < b ? a : b) : c;
        for (int i = 2; i <= smallest; i++) {
            if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
                finallcm = i;
            }
        }
        return finallcm;
    }

    public static void main(String str[]) throws Exception {
        System.out.println(quadraticRoots(752, 904, 164));

    }

}
