package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        /*ArrayList<String> list=new ArrayList<>();
        list.add("Amit");
        list.add("Aman");  here add method is used to insert the element inside array
        list.add("Aashu");
        list.add("Aadesh");
//        list.add(1,Pradip);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        List<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(23);
        l1.add(45);
        System.out.println(l1);
        l1.add(1,50);
        System.out.println(l1);
        List<Integer>l2=new ArrayList<>();
        l2.add(90);
        l2.add(75);
        l1.addAll(l2);   //add all method helps to copy the content of one list to another list
        System.out.println(l1);
*/
List<Integer>l=new ArrayList<>();
    l.add(23);
    l.add(24);
    l.add(25);
    l.add(89);
    l.add(12);
//        System.out.println(l);
//        System.out.println(l.get(1));     //get method is used to gain the value at particular index which is passed to it
//        //remove method removes the particular element which is at the index passed in the method
//        l.remove(2);
//        System.out.println(l);
//        //if we pass the dataType of the list.value of (element )it removes the particular element
//        l.remove(Integer.valueOf(89));
//        System.out.println(l);
//       // l.clear();   //clear method clears all the elements inside list
//     //   System.out.println(l);   //while inserting and removing particular element in or from the list the time complexity is O(n)
//        //set method set the value at particular index
//        l.set(1,800);
//        System.out.println(l);
//        if(l.contains(23)){
//            System.out.println("It is present inside list");
//        } //contains method returns true if the object provided is present in the list else return false
//        System.out.println(l.contains(98));


        //to iterate the list we have various ways
        //number 1 way is using for loop
        for(int i=0;i<l.size();i++){
            System.out.println("the element is: "+l.get(i));
        }
        System.out.println();
        System.out.println();
        //second method is by using for each loop
        for(Integer i:l){
            System.out.println("for each element is: "+i);
        }
        System.out.println();
        System.out.println();
        //third way is by using iterator
        //it has default iterator which helps to iterate over the list
        Iterator <Integer> it =l.iterator();
        while(it.hasNext()){
            System.out.println("Iterator elements is: "+it.next());
        }
    }
}
