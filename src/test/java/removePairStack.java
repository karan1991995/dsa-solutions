import java.util.Stack;

class removePairStack {

    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        // your code here
        Stack<Character> stk = new Stack<>();

        char ch[] = str.toCharArray();
        stk.push(ch[0]);
        for(int i=1;i<ch.length;i++){
            if(stk.size()>0 && stk.peek()==ch[i]){
                stk.pop();
            }
            else{
                stk.push(ch[i]);
            }

        }
        char chres[] = new char[stk.size()];
        int chresIndex=0;
        for(char chstk: stk){
         chres[chresIndex] = chstk;
         chresIndex++;
        }
        return new String(chres);
    }
    
    public static void main(String str[]) throws Exception {

        System.out.println(removePair("aaaa"));

    }

}
