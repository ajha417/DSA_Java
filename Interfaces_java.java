package com.company;

interface Sports{
    int a=45;  //in interface we can declare properties also
    void oneday();
    void test();
    void t20();
}
interface Entertain{
    void enjoy();
    void trending();
}
interface Phone3{
    void call();
}

class Cricket implements Sports,Entertain{
    public void oneday(){
        System.out.println("One day match is of 50 overs");
    }
    public void test(){
        System.out.println("Test match is of 90 overs a day and played for 5 days");
    }
    public void t20(){
        System.out.println("T20 matches are of 20 overs");
    }
    public void enjoy(){
        System.out.println("people enjoys while watching cricket");
    }
    public void trending(){
        System.out.println("Cricket is trending nowadays");
    }
}
interface Abc{
    void show();
}


public class Interfaces_java {
    public static void main(String[] args) {
        //the main difference between interface and abstract class is that we can have multiple interface for single subclass but not in abstract class
        Cricket match1=new Cricket();   //we cannot create the object of interface but it can be refrenced
        Sports match2=new Cricket();
        Abc a=()-> System.out.println("in show");   //this is also one of the way to define interface and it is also known as lambda function
        a.show();
        Phone3 p1=new Phone3() {
            @Override
            public void call() {
                System.out.println("It can call");
            }
        };    //here without creating class outside we have created inside class and defined method of the interface
        p1.call();
        match1.oneday();
        match2.test();  //here both objects are created for cricket class so we can access the methods throough both objects
        match1.enjoy();
        match1.trending();
        System.out.println(match1.a);
        //but we cannot modify the property of interface


    }
}
