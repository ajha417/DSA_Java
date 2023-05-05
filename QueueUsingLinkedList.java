class QNode{
    int data;
    QNode next;
   public QNode(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue1{
    QNode front,rear;
   public Queue1(){
        this.front=null;
        this.rear=null;
    }
    void enqueue(int data){
       QNode temp = new QNode(data);
       if(this.rear==null){
           this.rear=this.front=temp;
           return;
       }
       this.rear.next=temp;
       this.rear=temp;

    }
    int dequeue() throws Exception {
       if(this.front.next==null){
           throw new Exception("no element to delete");
       }
       int result = front.data;
       front=front.next;
       return result;

    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) throws Exception {
        Queue1 q = new Queue1();
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.front.data);
        System.out.println(q.rear.data);
    }


}
