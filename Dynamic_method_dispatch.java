package com.company;
class University{

    public void admission(){
        System.out.println("University takes admission");
    }
    public void seminar(){
        System.out.println("University conducts seminars");
    }


}
class Faculty extends University{

    public void seminar(){
        System.out.println("faculties also takes seminars");
    }
    public void lectures(){
        System.out.println("Faculties takes lectures");
    }

}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        University obj=new Faculty();
        //this is called dynamic method dispatch
        //here we can refernce to the super class and create object for subclass
        //but Faculty obj =new University(); is not allowed
        //we can access those methods only which are super class and overriden methods
        obj.admission();
        obj.seminar();   //here method of sub class will be called because the object is of sub class
        //obj.lectures(); this is not allowed



    }
}
