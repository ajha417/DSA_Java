package com.company;
class Student{
   static String name;
  static   int rollNo;
   static String address;
     void getName(){
        System.out.println("The name of the student is "+name);
    }
     void getRollNo(){
        System.out.println("The roll no of the student is "+rollNo);
    }
     void getAddress(){
        System.out.println("The address of the student is "+address);
    }

}
public class OOPS1 {
    public static void main(String[] args) {
        System.out.println("This is the tutorial for object oriented programming");
        Student amit=new Student(); //intatiating an abject
        Student aman=new Student();
        amit.name="Amit Kumar Jha";
        amit.rollNo=25;
        amit.address="Rajkot";
        amit.getName();
        amit.getAddress();
        amit.getRollNo();
        aman.name="Aman karn";
        aman.rollNo=28;
        aman.address="Bhavnagar Highway";
        aman.getName();
        aman.getRollNo();
        aman.getAddress();
    }
}
