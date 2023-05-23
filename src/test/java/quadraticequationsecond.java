import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class quadraticequationsecond {

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Double> temp = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int lcmofthree = lcm(a, b, c);
        if(lcmofthree>0){
            a = a / lcmofthree;
            b = b / lcmofthree;
            c = c / lcmofthree;
        }

        double determinant = (b * b) - 4 * a * c;
        if (determinant < 0) {
            result.add(-1);
        } else {
            temp.add((-b + Math.sqrt(determinant)) / (2 * a));
            temp.add((-b - Math.sqrt(determinant)) / (2 * a));
        }

        for (int i = 0; i < temp.size(); i++) {
            result.add((int) Math.floor(temp.get(i)));
        }

        if (result.size() == 2) {
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
        System.out.println(quadraticRoots(-264, -750, 504));

    }

}
