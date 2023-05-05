package com.company;

public class UserDefinedException {

    public static void main(String[] args) {
        int i=5;
        try{
            if(i<10){
                throw new MyException("Error");  //here we are throwing an error for self created exception
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
