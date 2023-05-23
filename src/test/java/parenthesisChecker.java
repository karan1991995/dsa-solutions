import java.util.Stack;

class parenthesisChecker {

    //Function to remove pair of duplicates from given string using Stack.
    public static boolean ispar(String x) {
        // your code here
        Stack<Character> stkOpen = new Stack<>();
        char ch[] = x.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '[' || ch[i] == '(' || ch[i] == '{') {
                stkOpen.push(ch[i]);

            } else if (ch[i] == ']' || ch[i] == ')' || ch[i] == '}') {
                if (stkOpen.size() > 0) {
                    if (isMatching(stkOpen.peek(), ch[i]))
                        stkOpen.pop();
                    else
                        return false;
                } else {
                    return false;
                }
            }

        }
        if (stkOpen.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isMatching(char a, char b) {
        if (a == '[' && b == ']')
            return true;
        else if (a == '{' && b == '}')
            return true;
        else if (a == '(' && b == ')')
            return true;
        else
            return false;
    }

    public static void main(String str[]) throws Exception {

        System.out.println(ispar("(])"));

    }

}
