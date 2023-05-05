interface AInterfaec{
    void show();
}
class Anc implements AInterfaec{
    public void show(){
        System.out.println("This is the method inside java collection");
    }
}
public class LambdaDemo {
    public static void main(String[] args) {
//        we can have reference of interface
//        but we cannot create the object  of interface

//        using anonymous inner claasses

//        AInterfaec obj1 = new Anc(){
//            public void show(){
//                System.out.println("This is method inside anonymous inner class");
//            }
//        };
//        obj1.show();

//        now using lambda expression
        AInterfaec obj1;
        obj1 = ()-> System.out.println("This is the example of lambda expression");
        obj1.show();
    }
}
