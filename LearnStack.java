package com.company;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> students=new Stack<>();
        students.push("Amit");  //push method is used to insert the element inside stack
        students.push("Rakesh");
        students.push("Suresh");
        students.push("Raman");
        System.out.println(students);
        System.out.println(students.peek()); //peek method shows the element which is at top
        students.pop();   //pop removes the element which is inserted at last
        System.out.println(students);
        System.out.println(students.peek());
    }
}
