package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionDemo {
    public static void main(String[] args) {
        //exception are those that can be handled
        //errors cannot be handled
        //types of exception
        //one is checked and other is unchecked
        //under checked exception there are two exception and they are IOException and sql exception
        //under unchecked there are Runtime exception
        //checked exception is caught at compile time and unchecked exception at runtime
        //In unchecked exception compiler itself finds out the error
        //while checked exception needs to be handled
        int i=8;
        int j=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=0;
//        int a[]=new int[4];
        try{
            System.out.println("Enter a number:");
            j=Integer.parseInt(br.readLine());
             k=i/j;
//             for(int c=0;c<=4;c++){
//                 a[c]=c+1;

//             }
//             for(int value:a){
//                 System.out.println(value);
//             }
            System.out.println(k);
        }
        catch(IOException e){
            System.out.println("Some Input Output Error");
        }
        catch (ArithmeticException e){
            System.out.println("cannot be divided by zero"+e);
        }
//        catch(ArrayIndexOutOfBoundsException e){   //we can multiple catch blocks for single try block
//            System.out.println("Maximum Number of values shouldn't exceed 4");
//        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
        finally {     //finally block will be executed whether there is error or not

            System.out.println("finally bye");
        }
        System.out.println(k);

    }
}
