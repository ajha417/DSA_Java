package com.company;
class Cylinder{
    private int radius;
    private int height;
    int getHeight(){
    return height;
    }
    void setHeight(int height){
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    void setRadius(int radius){
        this.radius=radius;
    }
    double volume(){
        return 3.14*radius*radius*height;
    }
    double surfaceArea(){
        return 2*3.14*radius*height+2*3.14*radius*height;
    }
}
class Cylinder1{
    int radius;
    int height;
    public Cylinder1(int r,int h){
        this.radius=r;
        this.height=h;
    }

}
class Rectangle{
    private int length;
    private int breadth;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(){
        this.length=5;
        this.breadth=4;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

public class ModifiersPractise {
    public static void main(String[] args) {
        //Question Number 1
        //Create a class cylinder and use getters and setters to set its radius and height
     // Cylinder c1=new Cylinder();
     /*   c1.setHeight(34);
        c1.setRadius(7);
        int h= c1.getHeight();
        int r = c1.getRadius();
        System.out.println(h);
        System.out.println(r);






        //Question number 2
        //use number 1 to print surface area of cylinder
        System.out.println("The volume of cylinder is "+c1.volume());
        System.out.println("The surface area of cylinder is "+c1.surfaceArea());

      */




        //Question Number 3
        //Use a constructor and repeat number 1
     /*   Cylinder1 c2=new Cylinder1(7,45);
        System.out.println(c2.height);
        System.out.println(c2.radius);


      */


        //Question Number 4
        //overload a constructor used to initialize a length and breadth for using custom parameter
        Rectangle rect =new Rectangle();
        rect.setBreadth(45);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());


    }
}
