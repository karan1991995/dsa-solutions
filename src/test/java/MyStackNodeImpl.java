 class StackNode {
     int data;
     StackNode next;
     StackNode(int a) {
         data = a;
         next = null;
     }
 }

class DriverClassNode {

    public static void main(String Str[]) {
        MyStackNodeImpl myStackNodeImpl = new MyStackNodeImpl();
        myStackNodeImpl.push(2);
        myStackNodeImpl.push(3);
        System.out.println(myStackNodeImpl.pop());
        myStackNodeImpl.push(4);
        System.out.println(myStackNodeImpl.pop());
    }
}

class MyStackNodeImpl {
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a)
    {
        // Add your code here
        StackNode temp = new StackNode(a);
        temp.next = top;
        top = temp;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        // Add your code here
        if(top!=null){
         int popped = top.data;
         top = top.next;
         return popped;
        }else {
            return -1;
        }
    }
}