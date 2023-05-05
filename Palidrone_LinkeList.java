class NodePalidrome{
    char data;
    NodePalidrome next;
    NodePalidrome(char data){
        this.data = data;
    }
}

public class Palidrone_LinkeList {
    public static void main(String[] args) {
        NodePalidrome n1 = new NodePalidrome('R');
        NodePalidrome n2 = new NodePalidrome('A');
        NodePalidrome n3 = new NodePalidrome('C');
        NodePalidrome n4 = new NodePalidrome('E');
        NodePalidrome n5 = new NodePalidrome('C');
        NodePalidrome n6 = new NodePalidrome('A');
        NodePalidrome n7 = new NodePalidrome('R');
        NodePalidrome head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;
        if(findPalidoj(head)==true){
            System.out.println("it is palidrome");
        }
        else{
            System.out.println("It is not");
        }


    }
    static  boolean findPalidoj(NodePalidrome head){
        if(head==null)
            return true;
        NodePalidrome curr = head;
        Palidrone_LinkeList p1 = new Palidrone_LinkeList();
        NodePalidrome mid = p1.middle(head);
        NodePalidrome end = p1.reverse(head);
        while(end!=null){
            if(end.data != curr.data){
                return false;
            }
            end = end.next;
            curr = curr.next;
        }
        return true;
    }
    NodePalidrome middle(NodePalidrome head){
        NodePalidrome fast  = head;
        NodePalidrome slow= head;
        while(fast!=null || fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
    NodePalidrome reverse(NodePalidrome head){
        NodePalidrome curr = head;
        NodePalidrome prev = null;
        while(curr!=null){
            NodePalidrome temp = curr.next;
            curr.next = prev;
            prev = temp.next;
            curr = temp;

        }
        return prev;
    }
}
