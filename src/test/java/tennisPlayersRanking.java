import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class tennisPlayersRanking {

    static ArrayList<String> tennisPlayersRanking(HashMap<String, Integer> inputMap) {
        ArrayList<String> rankList = new ArrayList<>();
        int score = 0;
        for (String key : inputMap.keySet()) {
            if (score < inputMap.get(key)) {
                score = inputMap.get(key);
                rankList.add(0, key);
            } else {
                rankList.add(key);
            }
        }
        return rankList;
    }

    public static void main(String str[]) throws Exception {
        HashMap<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 45);
        inputMap.put("B", 145);
        inputMap.put("C", 25);
        inputMap.put("D", 725);
        //D B A C

        System.out.println(tennisPlayersRanking(inputMap));

    }

}
