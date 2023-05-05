public class FloydCycleAlgo {
    static Node  head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }
    int detectAndRemoveLoop(Node node){
        Node slow = node,fast = node;
        while(slow!=null && fast!=null & fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                removeLoop(slow,fast);
                return 1;
            }
        }
        return 0;
    }
    void removeLoop(Node loop,Node head){
        Node ptr1 = loop;
        Node ptr2 = loop;
//        count the number of nodes in loop
        int k = 1,i;
        while(ptr1.next!=ptr2){
            ptr1 = ptr1.next;
            k++;
        }
        ptr1 = head;
        ptr2= head;
        for(i = 0;i<k;i++){
            ptr2 = ptr2.next;
        }
        //move the both pointers at the same time so that they can meet at loop starting node
        while(ptr2!=ptr1){
            ptr1 = ptr1.next;
            ptr1 = ptr2.next;
        }
        //once you get the ptr then  delete it
        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }

        ptr2.next = null;


    }
    static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        FloydCycleAlgo list = new FloydCycleAlgo();
        list.head = new Node(50);
        list.head.next = new Node(60);
        list.head.next.next = new Node(70);
        list.head.next.next.next = new Node(80);
        list.head.next.next.next.next = new Node(90);
        //this is for making looop
        head.next.next.next.next.next = head.next.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("List after removing loop:");
        print(head);

    }
}
