import java.util.ArrayList;
import java.util.Collections;

public class subsetsusingrecur {
    public static ArrayList<String> subsetsusingrecur(String S) {
        ArrayList<String> resultArr = new ArrayList<>();
        if(S.length()<=0){
            return resultArr;
        }

        for (int i = 0; i <= S.length(); i++) {
            String temp = S.substring(0, i);
            if(!resultArr.contains(temp) && temp!="")
            resultArr.add(temp);

        }
        resultArr.addAll(subsetsusingrecur(S.substring(1, S.length())));
        return resultArr;
    }

    public static void main(String str[]) throws Exception {
      ArrayList result = subsetsusingrecur("ab"); 
    }

}
