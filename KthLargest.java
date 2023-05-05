import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        //we can find out the kth largest either by sorting the array and printing the element which is at a[n-k]
        //but we can also implement it by using priority queue
        int a[] = {20,10,60,30,50,40};
        int k = 3;
        int res = findKthLargest(a,k);
        int res1 = findKthSmallest(a,k);
        System.out.println("The kth smallest element is "+res1);
        System.out.println("The kth largest element is "+res);
    }
    static int findKthLargest(int a[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0;i<k;i++){
            pq.add(a[i]);

        }
        for(int i=k;i<a.length;i++){
            if(pq.peek()<a[i]){
                pq.poll();
                pq.add(a[i]);
            }

        }
        return  pq.peek();
    }
    static int findKthSmallest(int a[],int k){
        PriorityQueue<Integer> sq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<k;i++){
            sq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(sq.peek()>a[i]){
                sq.poll();
                sq.add(a[i]);
            }

        }
        return sq.peek();
    }
}
