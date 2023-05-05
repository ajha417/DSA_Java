class CircularQueue{
    int a[];
    int front,rear,n;
    public CircularQueue(int n){
        this.n = n;
        front=rear=-1;a=new int[n];
    }
    void enqueue(int data)throws Exception{
        if((rear+1)%n==front){
            throw new Exception();
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%n;
        a[rear]=data;
    }
    int dequeue()throws Exception{
        if(front==-1){
            throw new Exception();
        }
        int result = a[0];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front = (front+1)%n;
        }
        return result;
    }

}

public class CircularArrayQueue {
    public static void main(String[] args) throws Exception {
            CircularQueue c = new CircularQueue(5);
            c.enqueue(10);
            c.enqueue(20);
            c.enqueue(30);
            c.enqueue(40);
            c.enqueue(50);
            c.dequeue();
            c.dequeue();
        System.out.println(c.a[c.front]);
        System.out.println(c.a[c.rear]);
    }
}
