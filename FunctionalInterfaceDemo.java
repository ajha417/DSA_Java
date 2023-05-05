@FunctionalInterface
interface DemoInterface{
    void funshow();
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        DemoInterface obj1 = ()-> System.out.println("This is the example of functional interface");
        obj1.funshow();
    }
}
