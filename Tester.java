package com.company;
class Base3{
    public  void method(int a){
        int x,y,z;
        float f2=1234;
        double d3=1234.0;
        System.out.println(d3);
//        float f3=1234.0;



    }
}
class Derived3 extends Base3{
    public void method(){
        System.out.println("helo");
    }
}
public class Tester {
    public static void main(String[] args) {
        Base3 obj = new Derived3();
        obj.method(25);
    }
}
