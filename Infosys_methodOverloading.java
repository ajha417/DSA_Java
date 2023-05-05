package com.company;
class Registration{
    String customerName;
    String panCardNo;
    String passportNo;
    int voterId;
    int licenseNo;
    long telePhoneNo[];
    Registration(String customerName,String passportNo,long telePhoneNo[]){
        System.out.println("congratulations! "+customerName+"You have successfully registered");
        System.out.println("Passport Number:"+passportNo);
        System.out.println("Phone Number:");
        for (long i:telePhoneNo
             ) {
            System.out.println(i);
        }
    }
    Registration(String customerName,int licenseNo,String passportNo,long telePhoneNo){

    }
}
public class Infosys_methodOverloading {
    public static void main(String[] args) {

    }
}
