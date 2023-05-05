package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Course{
    String coursename;
    public Course(String coursename){
        this.coursename = coursename;
    }
    @Override
    public String toString(){
        return coursename;
    }
}
public class ListInterface {
    public static void main(String[] args) {
        List<Course> courseList= new LinkedList<>();
        courseList.add(new Course("Java"));
        courseList.add(new Course("Internet Programming"));
        courseList.add(new Course("Hibernate"));
        courseList.add(new Course("AngularJS"));

        //accessing using iterator
        Iterator<Course> iterator = courseList.iterator();
        while(iterator.hasNext()){
            Course c = iterator.next();
            System.out.println(c);
        }
        System.out.println();
        System.out.println();
        //accessing using for loop

        for(int i=0;i< courseList.size();i++){
            System.out.println(courseList.get(i));
        }
        System.out.println();
        System.out.println();

        //using enhanced for loop
        for(Course c:courseList){
            System.out.println(c);
        }


    }
}
