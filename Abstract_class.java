package com.company;
abstract class Jasmin{
    public static void androidApp(){  //this is abstract class
        System.out.println("Have developed an android application");
    }
     public abstract  void webApp();
    public abstract void iot();
    public abstract void iosApp();

}
 abstract class Sweta extends Jasmin{   //this is abstract class
    public void webApp(){
        System.out.println("Has developed an web application");
    }
    public void iot(){
        System.out.println("Has worked on iot applications");
    }
    public abstract void iosApp();

}
class Dhaval extends Sweta{      //this is concrete class
    public void iosApp(){
        System.out.println("Is learning to develop ios applications");
    }
}

abstract class Phone{
    public abstract void showConfig();
}
class RedmiNote9promax extends Phone{
    public void showConfig(){
        System.out.println("Ram:6gb,version:11, ROM:128gb, camera:64mp");
    }
}
class Realme extends Phone{
    public void showConfig(){
        System.out.println("Ram:4gb, version:10, ROM:64gb, camera:25mp");
    }
}


public class Abstract_class {
    public static void main(String[] args) {
        //Jasmin obj=new Jasmin();   abstract class cannot be intantiated ;
        Jasmin obj = new Dhaval();
        obj.webApp();
        obj.androidApp();
        obj.iosApp();
        obj.iot();
        RedmiNote9promax obj1 = new RedmiNote9promax();
        Realme obj2 = new Realme();
        show(obj2);
    }
        public static void show(Phone obj){
            obj.showConfig();
        }


    }

