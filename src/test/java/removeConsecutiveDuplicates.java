import java.util.HashSet;
import java.util.Stack;

public class removeConsecutiveDuplicates {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String str[]) {
        System.out.println(removeConsecutiveDuplicatesMethod("aaaaaabaabccccccc"));
    }

    public static String removeConsecutiveDuplicatesMethod(String str) {
        // Your code here
        Stack<Character> stack = new Stack<>();

        char[] ch = str.toCharArray();
        stack.push(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (stack.peek() != null && ch[i] != stack.peek()) {
                stack.push(ch[i]);
            }
        }
        char[] resultchars = new char[stack.size()];
        int index = 0;

        for (char chres : stack) {
            resultchars[index] = chres;
            index++;

        }

        return new String(resultchars);
    }

}
