package com.company;

import java.util.Scanner;

class Employee{
    static int salary;
    static String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    String setName(String n){
        name=n;
//        System.out.println("The name of Employee is : "+name);
        return name;
    }

}
class CellPhone{
    void feature1(){
        System.out.println("The cellphone is ringing");
    }
    void feature2(){
        System.out.println("The cellphone is vibrating");
    }
    void getModel(){
        System.out.println("The model of the phone is iphone11x");
    }

}
class Square{
    int side;
    void setSide(int n){
        side=n;
    }
    int areaOfSquare(){
        return side*side;
    }
    int perimeterOfSquare(){
        return 4*side;
    }
}
class Soldier{
    void hit(){
        System.out.println("The soldier is hitting enemy");
    }
    void run(){
        System.out.println("The soldier is running towards enemy");
    }
    void fire(){
        System.out.println("The soldier is firing bullets on the enemy");
    }
}

public class CWH_practiseSet3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Question Number 1
        //create a class Employee with the following properties and methods
      /*  Employee a1=new Employee(); //creating an object
        a1.salary=94000;
        a1.name="Ajay";
        int sal=a1.getSalary();
        System.out.println(sal);
        String nam=a1.getName();
        System.out.println(nam);
       String name1=a1.setName("Amit");
//        System.out.println(a1.setName);
        System.out.println("The salary of "+name1+" is "+sal);

       */



        //Question Number 2
        //Create a class having name cellphone and create various methods which prints features of the phone
       /* CellPhone iphone=new CellPhone(); iphone.getModel();
        iphone.feature1();
        iphone.feature2();

        */


        //Question Number 3
        //Create a class Square with a method to initialize its side,calculate area and perimeter
     /*   Square s1=new Square();
        System.out.println("Enter the length of the side of square:");
        int side= sc.nextInt();
        s1.setSide(side);
        int area=s1.areaOfSquare();
        int perimeter= s1.perimeterOfSquare();
        System.out.println("The area of square 1 is "+area);
        System.out.println("The perimeter of square 1 is "+perimeter);


      */

        //Question number 4
        //create a class soldier for Rockstar games capable of fighting running and firing bullets
        Soldier soldier1=new Soldier();
        soldier1.hit();
        soldier1.fire();
        soldier1.run();

    }
}
