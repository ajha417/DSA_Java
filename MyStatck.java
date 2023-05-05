class MyStatck1 {
    int top;
    int capacity;
    int a[];
    MyStatck1(int capacity){
        a=new int[capacity];
        this.capacity=capacity;
        top=-1;
    }
//    now push opeation
    public void push(int x) throws Exception {
        if(top==capacity-1){
            throw new Exception();
        }
        System.out.println("Inserting "+x);
        a[++top]=x;
    }
    public void pop() throws Exception {
        if(top==-1){
            throw new Exception();
        }
        System.out.println("removing "+a[top]);
        top--;
    }
    public void peek() throws Exception {
        if(top==-1){
            throw new Exception("It is empty");
        }
        System.out.println("The topmost element is: "+a[top]);
    }

}
public class MyStatck{
    public static void main(String[] args) throws Exception {
        MyStatck1 obj = new MyStatck1(3);
        obj.push(23);
        obj.push(5);
        obj.peek();
        obj.pop();
        obj.push(7);
        obj.push(5);
        obj.peek();
        obj.pop();
        obj.peek();
    }
}
