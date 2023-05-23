class TwoStack {

    int size;
    int top1, top2;
    int arr[] = new int[100];

    TwoStack() {
        size = 100;
        top1 = -1;
        top2 = size;
    }
}

class twoStackinanArray {

    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq) {
        int lastfinder = 0;
        while (sq.arr[lastfinder] != 0) {
            lastfinder++;
        }
        int index;
        if (lastfinder > 0) {
            index = lastfinder - 1;
        } else index = 0;

        while (index >= 0 && sq.arr[index] != 0) {
            sq.arr[index + 1] = sq.arr[index];
            index--;
        }
        sq.arr[0] = x;
        sq.top1 = 0;
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq) {
        int lastfinder = 0;
        while (sq.arr[lastfinder] != 0) {
            lastfinder++;
        }

        sq.arr[lastfinder] = x;
        sq.top2=lastfinder;
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq) {
        if(sq.arr[sq.top1]!=0){
            int popped = sq.arr[sq.top1];
            int lastfinder = 0;
            while (sq.arr[lastfinder] != 0) {
                lastfinder++;
            }
            int index = 1;
            while(index<lastfinder){
                sq.arr[index-1]=  sq.arr[index];
                index++;
            }
            sq.arr[lastfinder-1]=0;
            return popped;
        }
        else{
            return -1;
        }


    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq) {
        if(sq.arr[sq.top2]!=0) {
            int lastfinder = 0;
            while (sq.arr[lastfinder] != 0) {
                lastfinder++;
            }
            sq.top2 = lastfinder - 1;
            int popped = sq.arr[sq.top2];
            sq.arr[sq.top2] = 0;
            sq.top2--;
            return popped;
        }
        else{
            return -1;
        }
    }
}


class driverClassTwoStackinArray {

    public static void main(String str[]) throws Exception {
        twoStackinanArray twoStackinanArray = new twoStackinanArray();
        TwoStack twoStack = new TwoStack();
        twoStackinanArray.push1(1, twoStack);
        twoStackinanArray.push1(2, twoStack);
        twoStackinanArray.push1(3, twoStack);

        twoStackinanArray.push2(7, twoStack);
        twoStackinanArray.push2(8, twoStack);
        twoStackinanArray.push2(9, twoStack);

        twoStackinanArray.pop1(twoStack);
        twoStackinanArray.pop2(twoStack);

    }

}
