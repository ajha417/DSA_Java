class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog  extends  Animal{
    public void display(){
        System.out.println("My name is "+name);
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
//        super.eat();
        super.eat();
        System.out.println("I eat cat foods");
    }
    public void display(){
        System.out.println("My name is "+name);
    }

}
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name="Tiger";
        d1.display();
        d1.eat();
        Cat c1 = new Cat();
        c1.name = "Tom";
        c1.display();
        c1.eat();
    }

}
