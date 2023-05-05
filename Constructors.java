package com.company;
class Computer{
    String Name;
    int model;
    int ram;
    public Computer(String Name,int model,int ram){   //if we declare method having same name as class then it is constructors

        this.Name=Name;
        this.model=model;
        this.ram=ram;
        System.out.println(this.Name);
        System.out.println(this.model);
        System.out.println(this.ram);
    }
}
public class Constructors {

    public static void main(String[] args) {
        System.out.println("This is for constructors");
        //Constructors are used to initialize an object
        Computer hp=new Computer("Pavilion",2394,512);
//        System.out.println(this.name);


    }
}
