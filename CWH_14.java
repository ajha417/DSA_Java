package com.company;

public class CWH_14 {
    public static void main(String[] args) {
        String name="Amit";
        System.out.println(name);
//        length is used to find the length of string
        System.out.println(name.length());
        String upstring=name.toUpperCase(); //this is used to convert string in uppercase
        System.out.println(upstring);
        System.out.println(name.replace('t','r'));
        System.out.println(name.replace("t","play"));
        System.out.println(name.startsWith("Ami"));
    }
}
