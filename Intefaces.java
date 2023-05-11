package Basics;

public class Intefaces implements Person1{
    public static void main(String[] args) {

    }
    @Override
    public void speak(){
        System.out.println("It can speak English");
    }


}
class Student1 implements Person1{
    @Override
    public void speak(){
        System.out.println("Students can speak multiple languages");
    }
}

interface Person1{  //interface is used to achieve abstraction and multiple inheritance in some cases
    void speak();  //by default all the methods declared in interface are public and abstract
    //we don't have to specify explicitly
//    void run();
}

