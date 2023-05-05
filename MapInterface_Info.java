package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Course1{
    String courseName;
    public Course1(String courseName){
        this.courseName = courseName;
    }
    @Override
    public String toString(){
        return courseName;
    }
}
public class MapInterface_Info {
    public static void main(String[] args) {
        Set<Course1> course1Set = new HashSet<>();
        course1Set.add(new Course1("java"));
        course1Set.add(new Course1("DBMS"));

        Set<Course1> course2Set = new HashSet<>();
        course2Set.add(new Course1("PHP"));
        course2Set.add(new Course1("HTML"));
        course2Set.add(new Course1("CSS"));


        Map<Integer,Set<Course1>> studentCourses = new HashMap<>();
        //here Integer is the key and Set<Course1> is value
        studentCourses.put(1000,course1Set);
        studentCourses.put(1001,course2Set);

        //retrieving the set of courses by student id
        Set<Course1> courseSet = studentCourses.get(1000);
        System.out.println("By using get method");
        System.out.println(courseSet);

        //retrieving the set of courses using for-each loop
        Set<Integer> setOfKeys = studentCourses.keySet();
        System.out.println("Iterating over set values using for-each loop");
        for(Integer i :setOfKeys){
            System.out.println(studentCourses.get(i));


        }

        //iterating over collection using values
        System.out.println("Iterating over collection using values");
        for(Set<Course1> courses : studentCourses.values()){
            System.out.println(courses);
        }

    }
}
