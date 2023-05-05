package com.company;
class Base{
    int x;
    void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x=x;
    }
    int getX(){

        return x;
    }
    void printMe(){
        System.out.println("Hi this is Base class");
    }
}
class Derived extends Base{    //extend keyword is used to inherit the properties from Base class
     int y;
     void setY(int y){
         this.y=y;
         System.out.println("I am in derived class and setting y now");
     }
     public int getY(){
         return y;
     }

}
public class Inheritance {
    public static void main(String[] args) {
        Base b1=new Base();
        b1.setX(45);
        System.out.println(b1.getX());
        Derived b2=new Derived();   //here we are able to access the methods of base class also though we have created the object for derived class
        b2.setX(34);   //this is method defined in base class
        System.out.println(b2.getX());  //this is also defined in base class

        b2.printMe();
        b2.setY(78);
        System.out.println(b2.getY()); //here b2 can access the methods from both base and derived class
        //this is the example of inheritance


    }
}
