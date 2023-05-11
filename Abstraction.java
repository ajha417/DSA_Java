package Basics;

public class Abstraction {
    public static void main(String[] args) {
    //we cannot create the object of abstract class
        MotorBike m1 = new MotorBike();
        m1.start();
        m1.run();
    }
}
abstract class Vehicle{
    int speed=45;
    int mileage;
abstract public void start();
abstract public void run();
}
class MotorBike extends Vehicle{

    @Override
    public void start(){
        System.out.println("Motorbike is starting");
    }

    @Override
    public void run() {
        System.out.println("it is running with the speed of "+speed);
    }
}
