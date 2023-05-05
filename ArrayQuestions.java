package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int [] array1={2,9,7,5,10,14,23};

        String [] array2={"C++","Java","Python","C","Data Structures"};
        System.out.println("The original first array is "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("The sorted first array is "+Arrays.toString(array1));
        System.out.println("The original string array is "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("The sorted string array is "+Arrays.toString(array2));*/

        //finding peak element
        //peak elements are those elements if its value is not smaller than its adjacent elements

       /* int [] array1;
        System.out.println("Enter the size of array?: ");
        int N=sc.nextInt();
        array1 = new int[N];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<N;i++){
             array1[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<N;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println("");
        System.out.print("Enter any element of array: ");

        int element= sc.nextInt();
        System.out.println("");
        int count=0;
        for(int i=0;i<N;i++){

            if(array1[i]==element){
                System.out.println(i);
                break;
            }
            count=count+1;
        }
        System.out.println(count);
        if(array1[count]>array1[count-1]&&array1[count]>array1[count+1]){
            System.out.format("%d is peak element",element);
        }
        else{
            System.out.println("It is not peak element");
        }
*/

        //you are given a string and you need to reverse the string
      /*  String test="Hi I am Amit and practising array questions";
        String reverse="";
        int p=test.length()-1;
        for(int i=p;i>=0;i--){
            reverse=reverse+test.charAt(i);
        }
        System.out.println("The reverse string is as follow:");
        System.out.println(reverse);z*/


        //write a program to find Kth smallest and Kth highest element in an array

      /*  int [] array1=new int[5];
        array1[0]=23;
        array1[1]=46;
        array1[2]=12;
        array1[3]=1;
        array1[4]=2;
        Arrays.sort(array1);
        System.out.println("enter kth term for smallest element?");
        int k=sc.nextInt();
//        System.out.println("");
        System.out.println("Enter kth term for higheset element?");
        int h= sc.nextInt();
        int l= array1.length;
        System.out.format("the %d th smallest element is %d",k,array1[k-1]);
        System.out.println("");
        System.out.format("the %d th highest element is %d ",h,array1[l-h]);
*/


        //write a program to find the occurence of an integer in an array
        int [] arr;
        System.out.print("Enter the size of an Array?");
        int N= sc.nextInt();
        arr=new int[N];
        System.out.println("Enter the elementes of an Array:");
        for(int i=0;i<N;++i){
            arr[i]= sc.nextInt();
        }
        System.out.println("The formed array is:");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.print("Enter an integer you want find the occurence of:");
        int element= sc.nextInt();
        int count=0;
        for(int i=0;i<N;++i){
            if(arr[i]==element){
                count=count+1;
            }
        }
        System.out.format("The occurence of %d in the array is %d",element,count);
    }
}
