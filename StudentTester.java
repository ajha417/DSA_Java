package com.company;
class Student2{
    private int student_Id;
    private String student_name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOF;


    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public char getResidentialStatus() {
       return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public int getYearOF() {
        return yearOF;
    }

    public void setYearOF(int yearOF) {
        this.yearOF = yearOF;
    }



}
public class StudentTester{

    public static void main(String [] args){
        Student2 s1=new Student2();
        //Create an object of Student class
        //Use setter methods to set the values
        //Use getter methods with proper escape sequences to display values
        s1.setStudent_Id(1001);
        s1.setStudent_name("Jacob");
        s1.setQualifyingExamMarks(80.0f);
        s1.setResidentialStatus('H');
        s1.setYearOF(4);
        System.out.println("Student Name:    "+s1.getStudent_name());
        System.out.println("Student ID: "+s1.getStudent_Id());
//        s1.getStudent_name();
        System.out.println("Qualifying marks:  "+s1.getQualifyingExamMarks());
        System.out.println("Year of Engineering:   "+s1.getYearOF());
        if(s1.getResidentialStatus()=='H'){
            System.out.println("Residential Status:  "+"Hostelleres");
        }
    }
}

