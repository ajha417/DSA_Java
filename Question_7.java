package com.company;

interface Bank1{
    float rateOfInterest();
}
class SBI implements Bank1
{
    //Missing Statement {return 9.15f;}
   public  float rateOfInterest(){   //as this class is implementing interface so we have to define the methods of the interface
        return 9.15f;
    }
}
class PNB implements Bank1{
    //Missing Statement {return 9.7f;}
  public  float rateOfInterest(){
        return 9.7f;
    }
}
class Question_7
{
    public static void main(String[] args){
        //Bank s=//Missing Code;
        Bank1 s = new SBI();  //here we are taking reference of Bank but creating object for SBI which can execute the methods of SBI class
        System.out.println("ROI: "+s.rateOfInterest());
        // Bank p=//Missing Code;
        Bank1 p = new PNB();    //here we are creating object of PNB class
        System.out.println("ROI: "+p.rateOfInterest());
    }
}
