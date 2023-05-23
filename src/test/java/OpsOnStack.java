import java.util.Stack;

public class OpsOnStack {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String str[]){
    }

    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
    }

    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        // Your code here
        st.pop();
    }

    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
        System.out.println(st.peek());
    }

    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        // Your code here
        return st.contains(val);
    }

}
