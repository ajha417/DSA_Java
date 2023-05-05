package com.company;

public class ArrayPractise {
    public static void main(String[] args) {
        //question number 1
        // create an array of float of size 5 and find their sum

//        float [] num1;
//        num1=new float[5];
//        num1[0]=23;
//        num1[1]=46;
//        num1[2]=78;
//        num1[3]=89;
//        num1[4]=98;
//        float sum=0;
//        for(int i=0;i<num1.length;i++){
//            sum=sum+num1[i];
//        }
//        System.out.println("The sum of item is "+sum);

       /* float [] marks ={12.4f,23.5f,89.5f,76.5f,99.5f};
        float num=12.6f;
        boolean isPresent=false;
        for(float i:marks){
            if(num==i){
                isPresent=true;
                break;
            }
        }
        if(isPresent){
            System.out.println("The element is present is the array");
        }
        else{
            System.out.println("The element is not present in the array");
        }

        */


        //Question number 3

        //calculate the average marks from an array containing marks of all students in physics using for-each loop

//        float [] physics ={88,21,99,56,78,67};
//        float sum=0;
//        for(float i:physics){
//            sum=sum+i;
//        }
//        float avg=sum/ physics.length;
//        System.out.println(avg);


        //Question number 4
        //create two matrices and add them;

      /*  int [][] matrix1={{1,2,3},
                {5,6,7}};
        int [][] matrix2={{1,2,3},{5,6,7}};
        int [][] result={{0,0,0},{0,0,0}};
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.format("setting value of i=%d and j=%d\n",i,j);
            }
            System.out.println("");
        }
        for(int i=0;i<matrix1.length;++i){
            for(int j=0;j<matrix1[i].length;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");

            }
            System.out.println("");
        }*/


        //Question number 5
        //Write a program to reverse an array in java

      /*  char [] arr={'A','B','C','D','E','F'};
        int l =arr.length;
        int n=Math.floorDiv(l,2);
        char temp;
        for (int i=0;i<n;i++){
             temp=arr[i];
             arr[i]=arr[l-1-i];
             arr[l-1-i]=temp;
        }
        for(int i:arr){
            System.out.println(i);
        }*/


        //question number 6
        //write a program to find maximum number in array

        /*int []arr={1,2,3,4,56,9,81,21,45};
        int max=arr[0];
        for(int i=0;i<arr.length;++i){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("The maximum number in the array is "+max);*/


        //Question number 7
        //write a program to find minimum among array

       /* int[] arr = {1, 23, 2,-6, 5, 54, 32, 0};
        int min = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("The minimum number in the array is : " + min);*/


        //Question number 8
        //Write a program to find whether the array is sorted or not

        int [] arr={1,2,3,4,5,6,7};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;++i){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("It is  sorted");
        }
        else{
            System.out.println("It is not sorted");
        }
    }
    }
