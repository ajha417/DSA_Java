class AQueue{
    static private int front,rear,capacity;
   static private int queue[];
    AQueue(int size){
        front = rear = 0;
        capacity=size;
        queue = new int[capacity];

    }
    static void enqueue(int data){
        if(capacity==rear){
            System.out.println("It is full");
            return;
        }
        else{
            queue[rear]=data;
            rear++;
        }
        return;
    }
    static void dequeue(){
        if(front==rear){
            System.out.println("It cannot be emoty");
        }
        else{
            for(int i=1;i<rear-1;i++){
                queue[i] = queue[i-1];
            }
            if(rear<capacity){
                queue[rear]=0;
            }
            rear--;
        }
        return;
    }
    static void displayQueue(){
        int i;
        if(front==rear){
            System.out.println("\nQueue is empty");
        }
        for(i=0;i<rear;i++){
            System.out.println("Element is "+queue[i]);
        }
            return;
    }
        static void getFront(){
        if(front==rear){
            System.out.println("Queue is empty");
            return;
        }
            System.out.println("front element is "+queue[front]);
        }


}
public class QueueUsingArray {
    public static void main(String[] args) {
        AQueue o1= new AQueue(4);
        o1.displayQueue();

        o1.enqueue(20);
        o1.enqueue(30);
        o1.enqueue(40);
        o1.enqueue(50);
        o1.enqueue(60);

        o1.displayQueue();
       o1.dequeue();
       o1.dequeue();
       o1.displayQueue();
       o1.getFront();

    }
}
