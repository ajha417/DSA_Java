package com.company;
abstract class Pen{
    abstract  void write();
      abstract   void refill();
}
//class Pen1 extends Pen{
//    public void write(){
//        System.out.println("Pen can write");
//    }
//
//    @Override
//    public void refill() {
//        System.out.println("We can refill ink inside pen");
//    }
//}
class Fountainpen extends  Pen{
    void refill(){
        System.out.println("it can change refill of the ink");
    }
    void write(){
        System.out.println("It can write");
    }
    void changeNib(){
        System.out.println("It can change nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("It can jump");
    }
    void bite(){
        System.out.println("It also bites who harm him");
    }
}
interface BasicAnimals{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimals{
    void speak(){
        System.out.println("Humans can speak");
    }
   public void sleep(){
        System.out.println("Humans can sleep");
    }
   public void eat(){
        System.out.println("Humans can eat");
    }
}


public class Practise_on_interface {
    public static void main(String[] args) {
        //Question Number 1 and 2 included
        //Create an abstract class pen with methods write and refill as abstract methods
        Fountainpen p1=new Fountainpen();
        p1.write();
        p1.refill();
        p1.changeNib();



        //Question Number 3
        //Create a Monkey class with jump and bite method.create human class which inherits the monkey class with additional methods such as eat and sleep
        Human h1=new Human();
        BasicAnimals b1=new Human();
        b1.eat();
        b1.sleep();
//        b1.speak(); this is not allowed
//        h1.eat();
//        h1.sleep();
        h1.bite();
        h1.jump();


    }
}
