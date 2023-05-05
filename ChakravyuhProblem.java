package com.company;
import java.util.*;
public class ChakravyuhProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter the size of a army:");
        N=sc.nextInt();
        int [][] arr=new int[N+1][N+1];
        int T=0;
        int B=N-1;
        int L=0;
        int R=N-1;
        int pow=1;
        int p=1;
        if(N>=0&&N<=100){

            while(T<=B && L<=R){
                //for top
                for(int i=L;i<=R;i++){
                    arr[T][i]=p++;
                }
                T++;
                //for right
                for(int i=T;i<=B;i++){
                    arr[i][R]=p++;
                }
                R--;
                //for bottom
                if (T <= B) {

                    for(int i=R;i>=L;i--){
                        arr[B][i]=p++;
                        B--;
                    }
                }
                //for right
                if(L<=R){
                    for(int i=B;i>=T;i--){
                        arr[i][L]=p++;
                    }
                    L--;
                }
            }

        }
        else{
            System.out.println("Please enter the size of army in range:");
        }
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                System.out.print(arr[i][j]);
                }
            System.out.println();
            }

        }
//        System.out.println("The power point is "+pow);

    }

