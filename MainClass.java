package com.company;
import java.util.Vector;
public class MainClass {
    public static void main(String args[]) {
        Vector v = new Vector(5);
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        System.out.println(v);
    }
}
