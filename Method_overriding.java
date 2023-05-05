package com.company;
class base1{
    int a=45;
    public int method1(){
        return a;
    }
    public void method2(){
        System.out.println("This is method 2 of base class");
    }
}
class derived1 extends base1{
    @Override
    public void method2(){
        System.out.println("This is method 2 of derived class");
    }
    public void method3(){
        System.out.println("This si method 3 of derived class");
    }
}
public class Method_overriding {
    public static void main(String[] args) {

    }
}
