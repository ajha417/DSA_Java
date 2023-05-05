interface InterfaceI{
    void add();
    default void show(){
        System.out.println("This is default method inside interface I");
    }

}

interface InterfaceJ{
    void subtract();
    default void show(){
        System.out.println("This is the default method inside interface J");
    }
    default void display(){
        System.out.println("This is display method");
    }
}

class C implements InterfaceI,InterfaceJ{
    //here C compulsorily needs to implement show method because it can cause ambiguity error if we create an object of c
    public void add(){
        System.out.println("This is add method");
    }
    public void subtract(){
        System.out.println("This is subtract method");
    }
    @Override
    public void show(){
        System.out.println("This is show method inside C");
    }
}

public class DefaultMethods {
//    in java 8 we have features that can help us to define methods inside interface

    public static void main(String[] args) {
        C obj1 = new C();
        obj1.show();
        obj1.add();
        obj1.display();
    }
}
