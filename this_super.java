package com.company;

import java.nio.file.FileStore;

class Firstclass{
   private int a;

   Firstclass(){
       System.out.println("This is not paramiterized constructor");
   }

    Firstclass(int a){
        System.out.println("This is the constructor of first class");
       // a=a;  //if we write this then compiler will be confused and it will print the value of a as 0
        // so we use word like this
        this.a=a;

    }
    public int getA(){
        return this.a;
    }
    public int returnone(){
        return 1;
    }

}

class SecondClass extends Firstclass{
    int a;
    SecondClass(int a){
//if we want to call the particular constructor of parent class then we have to use super keyword here
        //super is reference variable which is used to call particular constructor of base class
        super(a);  //with the help of this the constructor having one parameter will invoke
        System.out.println("This is the constructor of second class");
        this.a=a;
    }
}
public class this_super {
    public static void main(String[] args) {
//        Firstclass f1=new Firstclass(34);
        SecondClass s1=new SecondClass(78);
//        System.out.println(f1.getA());
//        System.out.println(f1.returnone());



    }
}
