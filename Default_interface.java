package com.company;
interface Camera{
    void takePicture();
    void recordVideo();
    default void record4k(){
        System.out.println("recording 4k vidoe");   //in interface if we declare method as default then we can define it in the interface
    }
}
interface Calculator{
    void sum(int a,int b);
    void dividing();

}
interface WiFi{
    String [] getNetworks();
}
class CellPhone1{
    void calling(){
        System.out.println("calling to the number");
    }
    void receiving(){
        System.out.println("receiving call");
    }

}
class SmartPhone extends CellPhone1 implements Camera,Calculator,WiFi{
    public void takePicture(){
        System.out.println("Camerea is taking snap");
    }
    public void recordVideo(){
        System.out.println("Phone is recording videos");
    }
    public void sum(int a,int b){
        System.out.println("The sum is "+a+b);

    }
//but we can also overwrite the default methods of interface by re defining it

    public void dividing() {
        System.out.println("The calculator is dividing two numbers");
    }

    public String[] getNetworks(){
        System.out.println("getting list of networks available...");
        String [] getnet={"jio","airtel","Vodafone","bsnl"};
        return getnet;
    }
}
public class Default_interface {
    public static void main(String[] args) {
        SmartPhone xiaomi=new SmartPhone();
        xiaomi.dividing();;
        xiaomi.sum(3,4);
        String []arr= xiaomi.getNetworks();
//        System.out.println();
        for (String i:arr
             ) {
            System.out.println(i);
        }

    }
}
