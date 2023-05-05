package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        l1.add(23);
        l1.add(45);
        l1.add(1);
        l1.add(69);
        l1.add(56);
        l1.add(32);
        /*System.out.println(l1);
        System.out.println("The minimum element is: "+Collections.min(l1));
        System.out.println("The maximum element is: "+Collections.max(l1));*/
        Collections.sort(l1,Comparator.reverseOrder()); //after this it will be sorted in reverse order
        System.out.println(l1);
    }
}
