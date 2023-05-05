package com.company;
class Good extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Good Morning");
            i++;
            try{
                Thread.sleep(200);
            } catch (Exception e){}
        }
    }
}
class Morning extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Thread_practise {
    public static void main(String[] args) {
        //Question Number 1
//        write a program to print "Good morning" and "welcome" continuously  using thread
        Good g = new Good();
        Morning m = new Morning();
//        g.start();
//        m.start();
//        g.join();






        //Demonstrate get priority and set priority
//        g.setPriority(12);
//        m.setPriority(3);
        System.out.println(g.getPriority());
        System.out.println(m.getPriority());
    }
}
