package com.company;

public class StaticClass {    //class is nothing but the description of object's property and behaviour
    public static void main(String[] args) {
        //static keyword simply represents that it is object specified but class specified
        Bank10 obj1 = new Bank10();
        obj1.balance=5000;
        obj1.showBalance();
//        we can access static methods by using class name
        Bank10.showAccount();
//        we can access inner static class in given way
        Bank10.InnerBank.showData();

    }
}
class Bank10{
    int balance; //this is object data member
    static int rateOfInterest; //this is static data member
    //static members are created once the file is compiled
    //it is independent of object
    public  void showBalance(){

        System.out.println("The balance of account is "+balance);
    }
    public static void showAccount(){
        rateOfInterest = 5;
        System.out.println("the rate of interest is "+rateOfInterest);
    }
     static  class InnerBank{
        public  static void showData(){
            System.out.println("This is the data shown inside static inner class");
        }
        // objects are real world entities. We use object to represent real world entity

     }
}
