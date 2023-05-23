import java.util.ArrayList;

class betBalance {

    static int betBalance(String result) {
        // code here
        int balance = 4;
        int bet = 1;

        char[] ch = result.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (balance <=0 || balance< bet) {
                return -1;
            }
            if (ch[i] == 'W') {
                balance = balance + bet;
                bet = 1;
            } else if (ch[i] == 'L') {
                balance = balance - bet;
                bet = 2 * bet;
            }
        }
        return balance;
    }


    public static void main(String str[]) throws Exception {

        System.out.println(betBalance("WLWLLWLLWWLWWW"));

    }

}
