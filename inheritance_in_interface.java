package com.company;
interface ParentClass{
    void parentName();
    void parentAddress();
}
interface Childclass1 extends ParentClass{  //java supoorts inheritance in interface as well
    //it means the methods which are declared in parent interface will be available in child class also
    void childName();
    void childAddress();
}

class Sampleclass implements Childclass1{
 public void childName(){ //we have to declare it public access modifier
    System.out.println("This is the name of child");
}
public void childAddress(){
    System.out.println("This is the address of Child");
}  //even after defining the methods of Childclass it will throw error as childclass has inherited the methods of parentclass interface
//so we have to define the methods of parentclass interface also
    public void parentName(){
        System.out.println("This is the name of Parents");
    }
    public void parentAddress(){
        System.out.println("This is the address of Parents");
    }
    public void play(){
        System.out.println("playing...");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        Childclass1 obj =new Sampleclass();
        obj.parentAddress();
        obj.parentName();
        obj.childName();
        obj.childAddress();
        Sampleclass obj1=new Sampleclass();
        obj1.play();


    }
}
