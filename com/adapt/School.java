package com.adapt;

public class School {
    public static void main(String[] args) {
        AssignmentWork asw = new AssignmentWork();
        Pen p = new PenAdapter();
        asw.setP(p);
        asw.writeAssignment("I am feeling lazy to write an assignment");
    }
}
