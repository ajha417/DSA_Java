package com.company;
class Bank3{
    private String bankname;
    private String area;
    private  String phoneNUmber;
    Bank3(){                                //this is default constructor
        bankname = "ICIC bank";
        area = "Rajkot";
        phoneNUmber ="6287356355";
    }
    Bank3(String bname,String aname,String pnum){
        this.bankname = bname;
        this.area= aname;
        this.phoneNUmber = pnum;
    }
    void displayInfo()
    {
        System.out.println("Bank name "+bankname);
        System.out.println("Area name "+area);
        System.out.println("Phone NUmber "+phoneNUmber);
    }

}



public class Infosys_constructor {
    public static void main(String[] args) {
        Bank3 obj1 = new Bank3();  //here default constructor will be called automatically
        Bank3 obj2 = new Bank3("PNB","BhaktiNagar","8799463393");
        obj1.displayInfo();
        System.out.println("***************************");
        obj2.displayInfo();  //here parameterized constructor will be called as obj2 is an object for parameterized constructor
    }
}
