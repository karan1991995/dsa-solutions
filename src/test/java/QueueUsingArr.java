import java.util.HashMap;

class QueueUsingArr {

    public static void main(String str[]) throws Exception {
        MyQueue mq = new MyQueue();
        mq.push(1);
        mq.push(2);
        mq.push(3);
        mq.pop();
        mq.pop();
        mq.pop();

    }
}

class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    void push(int x) {
        if (arr[front] == 0) {
            arr[front] = x;
        } else {
            rear++;
            arr[rear] = x;
        }

    }

    int pop() {
        int popped = arr[front];
        if(popped==0){
            return -1;
        }
        arr[front] = 0;
        front++;
        return popped;
    }


}
