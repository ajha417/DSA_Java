package encapsulation;

public class EncapsulationInfo {
    public static void main(String[] args) {
    //generally encapsulation is used for security purpose
        System.out.println("this is encapsulation body");
        Laptop l1 = new Laptop();
//        l1.ram=46500; this is not possible
        //we can do it by method access
        l1.setRam(1024);
        l1.setPrice(46500);
        System.out.println("The ram of this laptop is "+l1.getRam());
        System.out.println("The price of this laptop is "+l1.getPrice());
    }
    public void doWork(){  //here we have access modifier is public so this method will be visible to every packages outside it
        System.out.println("Working in encapsulation");
    }

    void defaultMethod(){  //not specifying any access modifier simply means it is default type and, it's visibility is within this package only
        //or, it can be visible in it's sub-packages
        System.out.println("this is default access modifier");
    }

    //similarly, we have access modifiers such as private and protected
    //private simply means it's visibility is inside its class only not even in the other classes
    //protected visibility is to the child classes only even if those child classes are on other package it doesn't matter

}

class Laptop{
    private int ram;
    private int price;
    //now these data members are not visible and cannot be modified in other class using object
    //we can do it by setters
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRam(){
        return this.ram;
    }


}
