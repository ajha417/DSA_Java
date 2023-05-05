package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class LearnVector {
    public static void main(String[] args) {
        Vector<Integer> values = new Vector<>();  //vector when exceeds the capacity it increases its capacity by 100%
        values.add(45);  //ArrayList increases its capacity by 50%
        values.add(23);
        values.add(90);
//        for(System.out::println)
        for(int i:values){
            System.out.println(i);
        }
        System.out.println("Results after sorting in reverse order");
        Collections.sort(values, Comparator.reverseOrder());
        for (int i = 0; i <values.size() ; i++) {
            System.out.println(values.get(i));
        }
    }

}
