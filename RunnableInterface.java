package com.company;
/*class H implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");

            try{
                Thread.sleep(500);
            } catch(Exception e){}
        }
    }
}*/
/*class E implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");

            try{
                Thread.sleep(500);
            } catch(Exception e){}
        }
    }

}*/

public class RunnableInterface {
    public static void main(String[] args) throws Exception
    {
        //we can execute threading in two ways
        //one is by extending thread class
        //other is by implementing runnable interface
//        Runnable obj1=new H();  //here obj1 is reference object of Runnable interface but real object of H
//        Runnable obj2=new E();
//        //so we have to create object of Thread
//        Thread r=new Thread(obj1);   //if we don't pass any parameter here it will execute its own method by default
//        Thread s =new Thread(obj2); //so we are passing Runnable object as parameter
//        r.start();
//        s.start();   //now Runnable doesn't have any pre-defined method called start

        //here we are using method of class for once only so we can create anonymous class
        //Anonymous class are those class which doesn't have its name
        Runnable obj1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("HI");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e){}
                }
            }
        };
        Runnable obj2=new Runnable() {
            public void run(){
                for (int i = 0; i <5 ; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500);

                    }catch (Exception e){}
                }
            }
        };
        Thread r1=new Thread(obj1);
        Thread r2=new Thread(obj2);
        //we can set the value of priority
        /*r1.setPriority(1);
                r1.setPriority((10));*/
        r1.setPriority(Thread.MIN_PRIORITY);  //here Min priority will set the value of priority to 1
        r1.setPriority(Thread.MAX_PRIORITY);  //here max priority will set the value of priority to 10
        r1.setPriority(Thread.NORM_PRIORITY);  //here norm will set the value of priority to 5
        System.out.println(r1.getPriority());   //with the getPriority method we can get the priority of the thread object

        System.out.println(r2.getPriority());
        r1.start();
        r2.start();
        //System.out.println(r1.isAlive()); //isAlive method shows whether the object is in execution or not. It returns either true or false
         r1.join();
       // System.out.println(r1.isAlive());  //here it will print false as its execution is ended
        r2.join();

        System.out.println("bye"); //here bye will be executed in between
        //so we have to use join method here
        //after using join method now bye will be printed at last
        //this is all about join and isAlive method

        //we can even print the priority of the thread
    }
}
