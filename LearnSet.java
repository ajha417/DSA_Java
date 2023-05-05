package com.company;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
       /* Set<Integer> s=new HashSet<>();
        s.add(12);
        s.add(98);
        s.add(23);
        s.add(11);
        System.out.println(s);  //in set elements are arranged randomly
        //set doesn't allow duplicate values inside it
        //if we try to insert the duplicate value it won't take
        s.add(11);   //here 11 will not be inserted for the twice
        System.out.println(s);
        s.remove(23);   //as set is not arranged properly so we have to provide the value instead of providing index value
        System.out.println(s);
        System.out.println(s.isEmpty());   //isEmpty returns true if the set is empty and false if not
        System.out.println(s.contains(12));  //contain method also return true if the passed element is found
        s.clear();   //clear methods removes all the elements of the set
        System.out.println(s.isEmpty());
        System.out.println(s);
*/

       /* Set<Integer> s=new LinkedHashSet<>();  //all the methods are same as Hash set
        //the only difference is that it shows the element in order in which we enter the values
        s.add(12);
        s.add(98);
        s.add(23);
        s.add(11);
        System.out.println(s);*/

      /*  Set<Integer> s=new TreeSet<>();
        //in tree set the elements get sorted
        s.add(12);
        s.add(98);
        s.add(23);
        s.add(11);
        System.out.println(s);*/
        Set<Student5> students=new HashSet<>();
        students.add(new Student5(2,"Amit"));
        students.add(new Student5(1,"Aradhna"));
        students.add(new Student5(2,"Antara"));
        System.out.println(students);    //after hashcode and equals method it is not possible to add duplicate values
    }
}
