package com.company;
import java.util.ArrayDeque;
public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        //ArrayDequeue is used to perform queue tasks in both direction
        adq.offer(23);
        adq.offer(45);
        adq.offerFirst(87);  //here offerFirst method will insert the element at first index
        adq.offer(98);
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollLast());  //here poll Last method will remove the element which was inserted at last
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());

        System.out.println(adq.peekLast());  //peekLast method is used to display the element which was inserted at last
        //we can even implement linked list by using array Dequeue

    }
}
