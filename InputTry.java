package com.company;
import  java.io.InputStreamReader;
import java.io.BufferedReader;
//try with resources
public class InputTry {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str="";
            str=br.readLine();   //
            System.out.println(str);  //here if error doesn't occur then the resources will be allocated automatically if occurs then it get
            //deallocated automatically
        }
//        System.out.println(str);
        //whenever we are using resources we have to close the resource
        //but if we write everything in parameter of try then we don't have to write catch block explicitly
        //otherwise we have to write like the code given below
        BufferedReader br=null;
        try{
            String str;
            br=new BufferedReader(new InputStreamReader(System.in));
            str=br.readLine();
            System.out.println(str);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            br.close();  //if the error occurs or not but the resources will be closed
        }
    }
}
