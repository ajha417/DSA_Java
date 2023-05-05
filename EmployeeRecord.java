package com.company;

import java.util.Scanner;

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double []salary=new double[5];
        System.out.println("Please enter the salaries of employees:");
        for (int i = 0; i < salary.length ; i++) {
            salary[i]=sc.nextDouble();
        }
        double average;
        double sum=0;
        for(int i =0; i< salary.length;i++){
            sum=sum + salary[i];

            }
        average = sum / salary.length;
        int count = 0;
        int count1=0;
        for(int i=0;i< salary.length;i++){
            if(salary[i]>average){
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.println("The number of employees whose salary is greater than average is "+count);
        System.out.println("The number of employees whose salary is lesser than average is "+count1);
    }
}
