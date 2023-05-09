enum Vehicles{
    AUTOMOBILE,THAR,MERCEDES,BUS;
//     we can have methods and variables inside enum unlike c/c++
    int price;
    public int getPrice(){
        return price;
    }
}
/*
* Inner implementation of enum
* class Vehicles{
* static final Vehicles AUTOMOBILE
* }
* */

public class Enum_Class {
    public static void main(String[] args) {
        System.out.println(Vehicles.AUTOMOBILE.getPrice());
        Vehicles[] v = Vehicles.values();
        for (Vehicles val:v){
            System.out.println(val);
        }
    }
}
