package com.company;
class Hi extends Thread{
    public void run(){   //we take run method because this method is only defined in thread class
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try
            {
                Thread.sleep(500);
            } catch(Exception e){}
        }
    }
}
class Hello extends Thread{    //Thread is pre-defined class
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);   //sleep method delays the output by the time which is provided in the parameter
            }catch (Exception e){}
        }
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        Hi obj1=new Hi();

        Hello obj2=new Hello();
//        obj1.run();
//        obj2.run();
            //here we have to mention start method instead of run
        obj1.start();  //start method refers to run method defined in the class
        try
        {
            Thread.sleep(500);
        }catch (Exception e){}
        obj2.start();
    }
}
