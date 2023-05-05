class NodeQueue{
    NodeQueue next;
    int data;
    public NodeQueue(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue{
    NodeQueue front,rear;
    public Queue(){
        this.front=this.rear=null;
    }
    void enqueue(int data){
        NodeQueue newnode = new NodeQueue(data);
        if(this.front==null){
            this.front=this.rear=newnode;
        }
        this.rear.next = newnode;
        this.rear = newnode;
    }
    int dequeue() throws Exception{
        if(this.front==null){
            throw new Exception();
        }
        int result = this.front.data;
        this.front = this.front.next;
        return result;
    }
}

public class QueueImplementation {



    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        System.out.println(q.front.data);
        System.out.println(q.rear.data);

    }

}
