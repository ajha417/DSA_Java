package com.company;

class Record<E>{
    private E record;
    public void display(E item){
        System.out.println(item);
    }
}
class Student11{
    private int stdId;
    private String stdName;
    public Student11(int stdId,String stdName){
        this.stdId = stdId;
        this.stdName = stdName;
    }
    public String toString(){
        return "Student Id: "+ stdId + " StudentName: "+ stdName;
    }
}
public class GenericDemo_Info {
    public static void main(String[] args) {
        Student11 s1 = new Student11(101,"Amit");
        Record<Integer> integerRecord = new Record<Integer>(); //this can be used only to display integers
        integerRecord.display(12);
        //integerRecord.display(s1) it will give error as we are trying to add student class object
        Record<Student11> student11Record = new Record<Student11>();
        student11Record.display(s1);
        //student11Record.display(15)  it will give error as we are trying to add int

    }
}
