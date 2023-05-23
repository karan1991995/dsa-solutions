import java.util.Stack;


class driverClassGetMinPop{
    public static void main(String args[]){
        
    }
}


class getMinAtPop {
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[], int n) {
        // your code here
        Stack<Integer> stck = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stck.push(arr[i]);

        }
        return stck;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        // your code here
        while(s.size()>0){
            int min = s.peek();
            for (int elem : s) {
                min = Math.min(min, elem);
            }
            System.out.print(min);
            s.pop();
        }

    }
}

