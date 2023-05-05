package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    public boolean equals(Object ob){
        return ((Person)ob).name==this.name;
    }

//    public int hashCode(){
//        return name.length();
//    }
}
public class MyListGeneric<Object> {
    private List<Object> values=new ArrayList<>();

    public void add(Object value) {
        values.add(value);    //line 1
        System.out.println(values);
    }

    public static void main(String[] args) {
        MyListGeneric<String> myListString = new MyListGeneric<String>();
        myListString.add("Good");
    }
}