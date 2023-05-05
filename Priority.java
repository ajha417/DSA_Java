package com.company;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;
class MyThread implements Runnable {

    MyThread() {
        System.out.print("New Thread is created.");    // Line 1
    }

    @Override
    public void run() {
        try {
            System.out.print("Am from MyThread...");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class Priority
{
    public static void displayElements(List<? super Integer> li) {
        System.out.println(li);     //line 4
    }
    public static void main(String[] args) {
        List<Number> i1=new ArrayList<Number>();
        i1.add(1009.9f);            //line 1
        i1.add(200);                //line 2
        i1.add(300.0);    //line 3
        displayElements(i1);
    }
}
