//package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,3,4,5,3,2,5,67);
        //the first way to iterate over this list
     /*   for(int i=0;i< value.size();i++){
            System.out.println(value.get(i));
        }

        System.out.println("the second way");

        Iterator<Integer> i = value.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("The third way is enhanced for loop");
        for(int j:value){
            System.out.println(j);
        }*/


        //these all are called external Iterations
        //we have the concept of internal Iterations as well
        //to achieve internal iterations we have stream api
        value.forEach(i -> System.out.println(i));  //this is external iteration
    }
}
