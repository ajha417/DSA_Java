abstract  class Car{
    abstract void accelerate();
}
class Suzuki extends Car{
    void accelerate(){
        System.out.println("It accelerates");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Car obj1 = new Suzuki();
        obj1.accelerate();
    }
}
