class Cloning{
    static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data=data;
            next=random=null;
        }
    }
    static Node clone(Node head){
        Node curr = head,temp=null;
        while(curr!=null){
           temp=curr.next;
             curr.next = new Node(curr.data);
            curr.next.next=temp;
            curr=temp;

        }
        curr=head;
//        now add random pointers to newly added node
        while(curr!=null){
            if(curr.next!=null){
                curr.next.random=(curr.random!=null)?curr.random.next:curr.random;
            }
            curr = curr.next.next;
        }
        Node orig=head,copy=head.next;
        temp=copy;
        while(orig!=null){
            orig.next=orig.next.next;
            copy.next=(copy.next != null) ? copy.next.next:copy.next;
            orig=orig.next;
            copy=copy.next;
        }
        return temp;
    }
    static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println("Data = "+temp.data+", Random = "+temp.random.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(1);
        start.next= new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);

//        1's random point to 3
        start.random=start.next.next;

//        2's random point to 1
        start.next.random=start;

//        3's and 4's random point to 5
        start.next.next.random=start.next.next.next.next;
        start.next.next.next.random=start.next.next.next.next;

//        5's random point to 2
        start.next.next.next.next.random=start.next;

        System.out.println("original linked list is:");
        print(start);
        Node clonedHead = clone(start);
        System.out.println("Cloned linked list is");
        print(clonedHead);
    }
}