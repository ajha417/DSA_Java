package com.company;

enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int value;
    private Day(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
public class TestEnum {
    public static void main(String[] args) {
        for(Day day:Day.values()) {
            // Line 1sout
            System.out.println(day.name()+"-");
        }
    }
}