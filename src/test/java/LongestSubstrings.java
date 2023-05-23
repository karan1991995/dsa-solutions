import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class LongestSubstrings {

    public static int lengthOfLongestSubstring(String s) {

        char[] ch = s.toCharArray();
        int stringSize = ch.length;
        String resSubString = "";
        HashMap<Integer,String> TempMap = new HashMap<>();
        String loopString = "";
        for(int i=0;i<stringSize;i++){
            for(int j=i;j<stringSize;j++) {
                if (loopString.contains(String.valueOf(s.charAt(j)))) {
                    loopString = "";
                    break;
                } else {
                    loopString = loopString + s.charAt(j);
                }
                TempMap.put(loopString.length(),loopString);
            }
        }

        int resultkey = 0;
        for(int key: TempMap.keySet()){
            for(int comparekey: TempMap.keySet()){
                if(comparekey>=key){
                    resultkey = comparekey;
                }
            }
        }
        resSubString = TempMap.get(resultkey);
        if(resSubString==null){
            resSubString="";
        }
        return resSubString.length();
    }


    public static void main(String str[]) throws Exception {
        System.out.println(lengthOfLongestSubstring(""));

    }

}
