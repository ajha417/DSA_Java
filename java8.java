package com.company;
interface I{
//    void add();

   default   void show() {
       System.out.println("This is in I" +
               "");
     };

}
interface J{
    void sub();
    default void show(){
        System.out.println("This is in J");
    }
}
class A{
    void show(){
        System.out.println("This is in A");
    }
}
class B implements I {

//  show

}
public class java8 {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();

    }
}
