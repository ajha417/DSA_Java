package com.company;
import java.util.List;
import java.util.ArrayList;

class Records<E>{
    List<E> record = new ArrayList<>();
    @Override
    public String toString(){
        return "Record[record="+record+"]";
    }
    public void add(E e){
        record.add(e);
    }
    public void display(Records<? extends Student_W>record){
        System.out.println("Student record:"+record);
    }
}
class Student_W{
    int id;
    String name;
    public Student_W(int id,String name){
        this.id = id;
        this.name = name;

    }
    @Override
    public  String toString(){
        return "Id= "+id+"name= "+name;
    }
}
class DayScholar extends Student_W{
        float stipend;
    public DayScholar(int id, String name,float stipend) {
        super(id, name);
        this.stipend = stipend;
    }
    @Override
    public String toString(){
        return "id= "+"name= "+name+"stipend= "+stipend;
    }
}

public class WildCardDemo {
    public static void main(String[] args) {
            Records<Student_W> studentWRecords = new Records<>();
            Student_W student_w = new Student_W(101,"Amit");
            Records<DayScholar> dayScholarRecords = new Records<>();
            DayScholar dayScholar = new DayScholar(102,"Robert",8394.4f);
            studentWRecords.add(student_w);
            dayScholarRecords.add(dayScholar);

            studentWRecords.display(studentWRecords);
            dayScholarRecords.display(dayScholarRecords);
    }
}
