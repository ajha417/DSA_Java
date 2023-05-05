class Stack{
    Node head;
    int size;
    Stack(){
        head=null;
        size=0;
    }
    static class Node {
            int data;
            Node next;
            Node(int data){

                this.data=data;
            }
    }
    public void push(int data){
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        size++;
    }
    public void pop()throws Exception{
        if(head==null){
            throw new Exception("It is empty. So, no elementt is there to pop out");
        }
        head=head.next;
        size--;
    }
    public void peek() throws Exception {
        if(head==null){
            throw new Exception("No element is there to show");
        }
        System.out.println("the topmost element is: "+head.data);
    }

}

public class StackUsingLinkedList {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(32);
        s.push(21);
        s.peek();
    }
}
