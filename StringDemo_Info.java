package com.company;

public class StringDemo_Info {
    public static void main(String[] args) {
        String username = "AmitKumarJha1";
        int  size = username.length();  //this returns the length of the string

        if(size>8 && size <15){
            char arr[] = username.toCharArray();  //coverts string into array of characters
            int count = 0;
            for(char c:arr){
                if(Character.isLetter(c)){  //checks each character is letter or not
                    ++count;
                }


            }
            if(count==size){
                System.out.println("valid username");
            }
            else{
                System.out.println("Invalid username");
            }
        }

    }
}
