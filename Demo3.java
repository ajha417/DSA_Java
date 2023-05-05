package com.company;
class Cuboid1{
    private int length;
    private int width;
    private int height;
    Cuboid1(){
        System.out.println("This is default constructor");
    }
    Cuboid1(int a,int b){
        System.out.println("This is constructor with two parameters");
            }
            Cuboid1(int a,int b,int c){
            this.length=a;
            this.width=b;
            this.height=c;
                System.out.println("This is the constructor with three parameters");
            }
            public int volumeOfCuboid(){
        return this.length * this.width * this.height;
            }

}
public class Demo3 {
    public static void main(String[] args) {
        Cuboid1 obj1=new Cuboid1();  //default constructor gets automatically called as object is created
        Cuboid1 obj2=new Cuboid1(4,5);  //this will invoke the constructor with two parameter
        Cuboid1 obj3= new Cuboid1(3,4,5); //this will invoke the constructor with three parameter
        System.out.println("The volume of cuboid is "+obj3.volumeOfCuboid());; //as obj3 is of cuboid class having 3 parameters so it will so result


    }
}
