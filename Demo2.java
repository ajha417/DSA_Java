package com.company;
class Student1 {
    private int roll_no;
    private String name;
    public int sem;
    public void setRoll_no(int roll){
        this.roll_no=roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public void showDetails(){
        System.out.println("The name of student is "+this.name);
        System.out.println("The roll number of the student is "+this.roll_no);
        System.out.println("The semester of the student is "+sem);
    }


}

public class Demo2 {
    public static void main(String[] args) {

        Student1 obj1=new Student1();
        obj1.setRoll_no(5); //here we are setting the value of roll no as it is declared private

        obj1.setName("Amit");
        obj1.sem=4;   //here we directly set the value of sem as it is public
        obj1.showDetails();   //here the method is called to show the details of the student


    }
}
