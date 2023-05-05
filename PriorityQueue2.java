import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //if you want to make it maxheap by default, then we have to pass comparator in the argument of priority queue
        //by default, it implements minheap
        pq.add(15);
        pq.add(10);
        pq.add(5);
        System.out.println(pq.size());
        while (!pq.isEmpty()){
            System.out.println(pq.peek());   //it prints the element which is at the top of the queue
            pq.poll();  //it pops out the element which was added first
        }

    }
}
