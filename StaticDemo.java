package com.company;
import static java.lang.System.out;   //here we are importing static so we dont have to include system everytime
public class StaticDemo {
    static String s="Amit";
    static {
        out.println("hello world in static");
        s="Ram";   //here the value of s is overwritten in this method
    }
    public static void main(String[] args) {
        out.println("Hello "+s);  //static method always gets loaded first before main
    }
    static{
        out.println("Bye in static");   //all the static gets executed first while class is loaded by jvm
    }
}
