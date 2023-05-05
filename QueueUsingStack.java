import java.util.Stack;

class MyQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void push(int data){
        s1.push(data);
    }
    int pop(){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return ans;
    }

}

public class QueueUsingStack {
    public static void main(String[] args) {
            MyQueue obj = new MyQueue();
            obj.push(1);
            obj.push(2);
            obj.push(3);
        System.out.println(obj.pop());
    }
}
