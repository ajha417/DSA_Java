import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    int poll(){
        return q1.poll();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);
        System.out.println(ms.poll());

    }
}
