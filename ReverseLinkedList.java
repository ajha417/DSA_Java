class Node2{
    int data;
    Node2 next;
    public  Node2(int data){
        this.data = data;
    }

}

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node2 n1 = new Node2(10);
        Node2 n2 = new Node2(20);
        Node2 n3 = new Node2(30);
        Node2 n4 = new Node2(40);
        Node2 n5 = new Node2(50);
        Node2 head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        traverse(head);
        ReverseLinkedList rs = new ReverseLinkedList();
        head = rs.reverse(head);
        System.out.println();
        System.out.println("After reversing");
        traverse(head);


    }
    static void traverse(Node2 head){
        Node2 curr = head;
        while(curr!=null){
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }
    Node2 reverse(Node2 head){
//        this was using iteration
        /*Node2 curr = head;
        Node2 prev = null;
        while(curr!=null){
            Node2 temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }*/

//        we can implement it by using recursion
       if(head==null || head.next==null){
           return head;
       }
       Node2 newHead = reverse(head.next);
       Node2 headNext = head.next;
       headNext.next = head;
       head.next = null;
       return  newHead;
    }
}
