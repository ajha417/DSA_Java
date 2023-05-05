import java.util.Scanner;

class QueueArray{
    int capacity;
    int a[];
    int rear;
    public QueueArray(int n){
        this.capacity = n;
        a = new int[n];
        rear = -1;
    }
    void enqueue(int data) throws Exception{
        if(rear==capacity-1){
            throw new Exception();
        }
        rear++;
        a[rear]=data;
    }
    int dequeue() throws Exception {
        if(rear==-1){
            throw new Exception();
        }
        int result = a[0];
        for(int i=0;i<rear;i++){
            a[i]=a[i+1];
        }
        rear--;
        return result;
    }
    int getFront() throws Exception {
        if(rear==-1){
            throw new Exception();
        }
        return a[0];
    }
}

public class QueueInArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        QueueArray q = new QueueArray(size);
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println(q.getFront());
    }

}
