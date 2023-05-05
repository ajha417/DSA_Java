package com.company;
class Circle{
    int radius;
    Circle(){
        System.out.println("This is base class named circle");
    }
    Circle(int r){
        this.radius=r;

    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder2 extends Circle{
      int height;
        Cylinder2(int r,int h){
            super(r);
            this.radius=r;
            this.height=h;
            System.out.println("This is derived class named cylinder");
        }
        public double volume(){
            return Math.PI*this.radius*this.height;
        }
}
class  Rectangle1{
    int length;
    int width;
    Rectangle1(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int area(){
        return length*width;
    }


}
class Cuboid extends Rectangle1{

    int height;
    Cuboid(int length,int width,int height){
        super(length, width);
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public int volume(){
        return length*width*height;
    }
}
public class InheritancePractice {
    public static void main(String[] args) {

        //Question Number 1
        //Create a class circle and derive a class called cylinder from it
        Circle obj1=new Circle();
        Cylinder2 c1=new Cylinder2(7,21);
        System.out.format("%.2f",c1.volume());
        System.out.println();
        System.out.format("%.2f",c1.area());


        //Question Number 2
        //Create class called rectangle and use inheritance to create another class cuboid

        Cuboid obj=new Cuboid(2,3,4);
        System.out.println();
        System.out.println("The area of rectangle is "+obj.area());
        System.out.println("The volume of cuboid is "+obj.volume());


    }
}
