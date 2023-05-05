import java.util.Collections;
import java.util.PriorityQueue;

class FindMedian{
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());//this is basically minHeap but, we have converted it to maxHeap
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //this is min heap
    static void insertNum(int num){
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){

               maxHeap.add(num);
        }
        else {

            minHeap.add(num);
        }
        //now check if maxheap has more elements than it has to be
        //then remove element from maxheap and add it to minheap
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size()<minHeap.size()) {  //this line basically checks if size of maxheap is less then, it takes from minheap
            maxHeap.add(minHeap.poll());
        }
    }
    static double findMedian(){
        if(maxHeap.size()==minHeap.size()){
//            System.out.println("hello");
            return  maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }

}

public class MedianOfAStream {
    public static void main(String[] args) {
            FindMedian obj1 = new FindMedian();
            obj1.insertNum(1);
            obj1.insertNum(3);
        System.out.println("The median is "+obj1.findMedian());
    }
}
