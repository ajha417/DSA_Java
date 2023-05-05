package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryDemo {
    public static void main(String[] args) throws Exception{  //here throws keyword is used to suppress the exception by putting comma we can suppress more exception
        int i=8,j;
        int k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the value of j");
            j=Integer.parseInt(br.readLine());
            k=i+j;
            if(k<15){
                //here we are throwing an instance of an exception by writing new keyword
                throw new ArithmeticException();  //throw keyword is used to throw an error willingly
            }
            System.out.println(k);
        }
        catch (IOException e){
            System.out.println("some error");
        }
        catch (ArithmeticException e){
            System.out.println("Minimum value for output is 15");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Good Bye");
        }
    }
}
