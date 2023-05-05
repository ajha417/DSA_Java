package com.company;
class Rectangle2{
    private int length;  //by declaring it as private will not allow any of the object to access it directly
    private int width;
    public void setLength(int length){   //here setter is used to set the value of length as length is declared private so it cannot directly be accessed from other class
        this.length=length;  //this keyword will set the value of length
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int area1(){
        return this.length * this.length;
    }

}
public class Tutorial2_Question1 {
    public static void main(String[] args) {
        Rectangle2 obj5=new Rectangle2();   //here we have intantiated the object1 of class Rectangle2
        Rectangle2 obj6=new Rectangle2();
        obj5.setLength(4);  //here we have set the value of length using method
        obj5.setWidth(5);  //here we have set the value of width using method
        obj6.setLength(10);
        obj6.setWidth(5);
        System.out.println("The area of rectangle 1 is "+obj5.area1());
        System.out.println("The area of rectangle 2 is "+obj6.area1());

    }
}
