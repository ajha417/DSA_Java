package com.company;

enum Grade{
    A,B,C,D,E,K;
}
class Student10{
    int studentId;
    String name;
    char grade;
    int scholarShipAmount;
    int totalMarks;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getScholarShipAmount() {
        return scholarShipAmount;
    }

    public void setScholarShipAmount(int scholarShipAmount) {
        this.scholarShipAmount = scholarShipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    public void calculateGrade(){
        if(totalMarks>=250){
            grade = 'K';
        }
        else if(totalMarks>=200 && totalMarks<250)
            grade = 'B';
        else if(totalMarks>=175 && totalMarks<200 )
            grade = 'C';
        else if(totalMarks >=150 && totalMarks<175)
            grade = 'D';
        else
            grade = 'E';

    }
    public void calculateScholarshipAmount(Grade grade){
        switch (grade){
            case A:
                scholarShipAmount= 5000;
                break;
            case B:
                scholarShipAmount = 4000;
                break;
            case C:
                scholarShipAmount = 3000;
                break;
            case D:
                scholarShipAmount = 2000;
                break;
            default:
                scholarShipAmount=0;
//                break;

        }
    }

}

public class Info_Enum {
    public static void main(String[] args) {

        Student10 s1 = new Student10();
        s1.setStudentId(1000);
        s1.setName("Amit");
        s1.setTotalMarks(249);
        s1.calculateGrade();
        s1.calculateScholarshipAmount(Grade.B);
        System.out.println("Student Details:");
        System.out.println("Student Id:"+s1.getStudentId());
        System.out.println("Student Name:"+s1.getName());
        System.out.println("Student Grade:"+s1.getGrade());
        System.out.println("Scholarship Amout:"+s1.getScholarShipAmount());

    }
}
