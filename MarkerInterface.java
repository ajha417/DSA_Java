package com.company;
//marker interface is an interface which doesnot have any methods and members
interface P{
    //since it is marker class it won't have any declarations
}
class A1 implements P{
    void show(){
        System.out.println("This is the class which is implementing marker interface");
    }
}
public class MarkerInterface {
    public static void main(String[] args) {
        A1 b=new A1();
        if(b instanceof P){
            b.show();
        }
        else{
            System.out.println("Permission denied");
        }
    }
}
