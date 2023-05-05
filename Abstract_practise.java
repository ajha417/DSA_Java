package com.company;
abstract class Parent{
    public abstract void message();
}
class Child1 extends Parent{
    public void message(){
        System.out.println("This is first subclass");
    }
}
class Child2 extends Parent{
    public void message(){
        System.out.println("This is second subclass");
    }
}
abstract class Bank{
    int bal;
    public void setBalance(int bal){
        this.bal=bal;
    }
    public abstract int getBalance();

}
class BankA extends Bank{
    public int getBalance(){
        return bal;
    }
}
class BankB extends Bank{
    public int getBalance(){
        return bal;
    }
}
class BankC extends Bank{
    public int getBalance(){
        return bal;
    }
}
public class Abstract_practise {
    public static void main(String[] args) {
        //Question number 1
//        Create an abstract class 'Parent' with a method 'message'.
//        It has two subclasses each having a method with the same name 'message' that prints
//        "This is first subclass" and "This is second subclass" respectively.
//        Call the methods 'message' by creating an object for each subclass.
        Parent obj=new Child1();  //here I have taken the reference of parent class and object of child1 class
        Parent obj1=new Child2();
        obj.message();
        obj1.message();


        //Question Number 2
        /*
Create an abstract class 'Bank' with an abstract method 'getBalance'.
$100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.
         */

        Bank obj4=new BankA();
        obj4.setBalance(100);
        System.out.println("The money deposited in BankA is "+obj4.getBalance());
        Bank obj5=new BankB();
        obj5.setBalance(200);
        System.out.println("The money deposited in BankB is "+obj5.getBalance());
        Bank obj6=new BankC();
        obj6.setBalance(300);
        System.out.println("The money depositd in BankC is "+obj6.getBalance());


    }
}
