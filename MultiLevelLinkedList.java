class MultiNode{
    int data;
    MultiNode next,down;
    public MultiNode(int data){
        this.data = data;
    }

}
public class MultiLevelLinkedList {
    static void flattenedPrint(MultiNode head){
        MultiNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    static void printOriginal(MultiNode head){
        MultiNode curr = head;
        if(curr==null)
            return;
        System.out.print(" "+head.data+" ");
        if(curr.down!=null){
            System.out.print("[");
            printOriginal(head.down);
            System.out.print("]");
        }
        printOriginal(curr.next);
    }

    static MultiNode flattenedList(MultiNode head){
        if(head==null){
            return null;
        }
        MultiNode next = head.next;
        head.next = flattenedList(head.down);
        MultiNode tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next = flattenedList(next);
        return head;

    }
    public static void main(String[] args) {
        MultiNode one = new MultiNode(1);
        MultiNode two = new MultiNode(2);
        MultiNode three = new MultiNode(3);
        MultiNode four = new MultiNode(4);
        MultiNode five = new MultiNode(5);
        MultiNode six = new MultiNode(6);
        MultiNode seven = new MultiNode(7);
        MultiNode eight = new MultiNode(8);
        MultiNode nine = new MultiNode(9);
        MultiNode ten = new MultiNode(10);
        MultiNode eleven = new MultiNode(11);
        MultiNode twelve = new MultiNode(12);
        MultiNode thirteen = new MultiNode(13);
        MultiNode fourteen = new MultiNode(14);
        MultiNode fifteen = new MultiNode(15);

        MultiNode head = one;
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;
        printOriginal(head);
      head=  flattenedList(head);
        System.out.println();
        flattenedPrint(head);
    }
}
