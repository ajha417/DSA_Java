public class PalidromeLinkedList {
    char data;
    PalidromeLinkedList next;

    public PalidromeLinkedList(char data) {
        this.data = data;
    }


    public static void main(String[] args) {
        PalidromeLinkedList p1 = new PalidromeLinkedList('C');
        PalidromeLinkedList p2 = new PalidromeLinkedList('B');
        PalidromeLinkedList p3 = new PalidromeLinkedList('A');
        PalidromeLinkedList head = p1;
        head.next = p2;
        p2.next = p3;
        p3.next = null;
        if(findPalin(head)){
            System.out.println("it is palidrome");
        }
        else{
            System.out.println("it is not palindrome");
        }

    }
    static void traverse(PalidromeLinkedList head){
        PalidromeLinkedList curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    static PalidromeLinkedList reverse(PalidromeLinkedList mid){
        PalidromeLinkedList curr = mid;
        PalidromeLinkedList prev = null;
        while(curr!=null){
            PalidromeLinkedList temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return  curr;
    }
    static boolean findPalin(PalidromeLinkedList head){
        if(head == null){
            return true;
        }
        PalidromeLinkedList curr = head;
        PalidromeLinkedList mid = middle(head);
        PalidromeLinkedList end = reverse(mid);
        while(end!=null){
            if(end.data!= curr.data){
                return false;
            }
            end = end.next;
            curr = curr.next;
        }
        return true;
    }
    static PalidromeLinkedList middle(PalidromeLinkedList head){
        PalidromeLinkedList fast = head;
        PalidromeLinkedList slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
