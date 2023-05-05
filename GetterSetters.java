package com.company;
class Getter{
    private int rollno;
    private String name;
    public void setName(String n){
        name=n;
    }
    public void setRollno(int i){
        rollno=i;
    }
    public String getName(){
        return name;
    }
    public  int getRollno(){
        return rollno;
    }

}
public class GetterSetters {
    public static void main(String[] args) {
        System.out.println("Access modifiers decide which place to access methods of the class");
        Getter g1=new Getter();
      //  g1.rollno=34; //this will throw an error as rollno is mentioned private so the object directly cannot access it
    //    g1.name="Amit"; //this will also throw an error
//        so we can access private properties through methods
        g1.setName("Amit");
        g1.setRollno(25);
        System.out.println( g1.getName());
        System.out.println(g1.getRollno());

    }
}
