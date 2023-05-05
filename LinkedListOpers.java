class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class LinkedListOpers {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        traverse(head);
        insetNode(head,1,40);
        System.out.println("\nAfter insertion");
        traverse(head);
        delete(head,2);
        System.out.println("\nAfter deletion");
        traverse(head);
        String s = new String();
    }
    static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }
    static void insetNode(Node head,int pos,int data){
        Node toAdd = new Node(data);
        if(pos == 0){
            toAdd.next = head.next;
            head.next = toAdd;
        }
        Node prev=head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;

    }
    static void delete(Node head,int pos){
        if(pos==0){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

}
