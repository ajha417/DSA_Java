package com.company;

public class WrapperClass {
    public static void main(String[] args) {
        int i=5;//this is primitive data type and known as
        //Integer obj = new Integer(i);
        Integer obj=i;   //this is auto-boxing in java   this is class and known as an object
        int j=obj;   //this is auto-unboxing
        System.out.println(obj);
        System.out.println(j);
    }
}
