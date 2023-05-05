package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(399);
        arr.add(234);
        arr.add(456);
        arr.add(741);
        arr.add(232);
     //   Comparator<Integer> com = new CompImp();  //here comparator is interface so we cannot directly create object
        Comparator<Integer> com = (o1,o2)->{
            if (o1%10>o2%10)
                return 1;
            return -1;
        };  //this is lambda expression which is used to reduce the number of codes
        Collections.sort(arr,com);   //here we are sorting the given array  but Collection can take two values
        //first one is the array and second is the object of comparator
        Collections.reverse(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
