package com.company;
import java.util.*;
class Base2{
    public Base2(){
        System.out.println("Hi I am construtor of base class");
    }
   public Base2(int a){
//        super(0);
        System.out.println("Hi I am overloaded constructor of base class "+a);

    }
}
class Derived1 extends Base2{

   public Derived1(){
     //  super(34);  //here by using this keyword I can invoke the constructor of base class having parameter
        System.out.println("HI I am constructor of derived class");
    }
    Derived1(int a,int b){
       super(a);

        System.out.println("Hi I am overloaded constructor of derived class with the value of b as "+b);
    }

}
class Childclass extends Derived1{
    Childclass(){
        System.out.println("Hi I am constructor of childclass");
    }
    Childclass(int x,int y,int z){
        super(x,y);
        System.out.println("Hi I am overloaded constructor of childclass with the value of z as "+z);
    }
}

public class ConstrucotsInheritance {
    public static void main(String[] args) {
       // Base1 b=new Base1();  //the constructor is automatically invoked as soon as the object is created
//        Derived1 d=new Derived1(88,98);
        //Though the object of derived class is created constructor of base class is invoked first
        //the default invoked constructor is without parameter
//        Childclass c=new Childclass(12,34,45);
            Childclass c = new Childclass();


    }
}
