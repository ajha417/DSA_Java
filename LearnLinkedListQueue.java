package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();    //here Queue is an interface and LinkedList is the class we are using
        queue.offer(34);  //offer method is used to insert element inside queue
        queue.offer(45);
        queue.offer(12);
        System.out.println(queue);
        System.out.println(queue.poll());    //poll method is used to remove an element which was inserted first
        System.out.println(queue);
        //peek method shows which element is going to remove next
        System.out.println(queue.peek());

    }
}
