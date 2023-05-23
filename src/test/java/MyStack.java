class DriverClass {

    public static void main(String Str[]) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        myStack.push(4);
        System.out.println(myStack.pop());
    }
}

class MyStack {
    int top;
    int arr[] = new int[1000];

    MyStack() {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a) {
        // Your code here
        top++;
        arr[top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if (top != -1) {
            int popped = arr[top];
            top--;
            return popped;
        } else {
            return -1;
        }
    }
}