package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();  //by passing argument in the constructor as Comparator.reverseOrder it will be
        //priority queue is used to perform operations on special element            treated as maxHeap
        //by default it will implement minHeap
        //all the method will be same as queue
        p.offer(23);
        p.offer(12);
        p.offer(1);
        p.offer(87);
        p.offer(2);
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
        System.out.println(p.peek());
    }
}
