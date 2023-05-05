package com.company;

import java.util.Objects;

public class Student5 {
    int roll_no;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student5 student5 = (Student5) o;
        return roll_no == student5.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
    }

    @Override
    public String toString() {
        return "Student5{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }



    public Student5(int roll_no, String name){
        this.name=name;
        this.roll_no=roll_no;
    }

}
