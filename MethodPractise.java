package com.company;

import java.util.Scanner;

public class MethodPractise {
    static int findSmallest(int n1,int n2,int n3){
        if(n1<n2 && n1<n3){
            return n1;
        }
        else if(n2<n1 && n2<n3){
            return n2;
        }
        else{
            return n3;
        }
    }
    static String findMiddle(String test){
        int pos;
        int len;
        if(test.length()%2==0){
            pos=test.length()/2-1;
            len=2;
        }
        else{
            pos=test.length()/2;
            len=1;
        }
        return test.substring(pos,pos+len);
    }
    static int countVowel(String test){
        int count=0;
        for(int i=0;i<test.length();i++){
            if(test.charAt(i)=='a'||test.charAt(i)=='e'||test.charAt(i)=='o'||test.charAt(i)=='i'||test.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    static int countWord(String test){
        int count=0;
        for(int i=0;i<test.length();++i){
            if(test.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
          int  r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
    public static  int getPentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Question number 1
        //Write a Java method to find the smallest number among three numbers.
      /*  System.out.println("Enter the first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int n3=sc.nextInt();
        int result=findSmallest(n1,n2,n3);
        System.out.println("The smallest number among these three is : "+result);
*/



        //Question number 2
        //Write a Java method to display the middle character of a string
      /*  System.out.println("Enter any string:");
        String test=sc.nextLine();
        String result=findMiddle(test);
        System.out.println("The required character is: "+result);
            */


        //Question Number 3
        //Write a Java method to count all vowels in a string

//        System.out.println("Enter any string:");
//        String vowel= sc.nextLine();
//        int result=countVowel(vowel);
//        System.out.println("The number of vowel  in the above string is: "+result);



        //Question Number4
        //Write a Java method to count all words in a string.

       /* System.out.println("Enter any string:");
        String sentence= sc.nextLine();
        int result=countWord(sentence);
        System.out.println("The number of words in this sentence is: "+result);*/



        //Question number 5
        //Write a Java method to compute the sum of the digits in an integer.

      /*  System.out.println("Enter any integer:");
        int n= sc.nextInt();
        int result=sumOfDigit(n);
        System.out.println("The sum of the digits is: "+result);
*/


        //Question Number 6
        //Write a Java method to display the first 50 pentagonal numbers.

       /* int count=1;
        for(int i=1;i<=50;i++){
            System.out.printf("%-6d",getPentagonalNumber(i));
            if(count%10==0) System.out.println();
            count++;
        }*/

        //Question Number 7
        //Write a Java method to compute the future investment value at a given interest rate for a specified number of years

    }
}
