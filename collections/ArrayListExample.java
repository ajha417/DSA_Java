package com.company.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Amit");
        arr1.add("Shiva");
        arr1.add("Pradip");
        for(String i:arr1){
            System.out.println(i);

        }
//        we have the concept of list also
        List<Integer> l1 = new ArrayList<>(); //here list is interface so, we cannot create an object of list but we can have it as reference
        l1.add(23); //list always adds elements to the last
        l1.add(1);
        l1.add(5);
        l1.add(7);
        System.out.println(l1);
        //to add the element at particular index we have to provide index position as an argument
        l1.add(2,34);
        System.out.println(l1);
        List<Integer> newlist = new ArrayList<>();
        newlist.add(10);
        newlist.add(23);
//        we have the concept of addAll method
//        addAll method basically adds all the list to the current list
        l1.addAll(newlist);
        System.out.println(l1);

        //to remove the element we have to pass its index position
        l1.remove(2);
        //to remove particular element
        l1.remove(Integer.valueOf(23));
        System.out.println(l1);

    }
}
