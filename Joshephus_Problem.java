package com.company;

public class Joshephus_Problem {
    public static int findWinner(int n,int k){
        if(n==1){
            return 1;
        }
        return (findWinner(n-1,k)+k)%n;

    }
    public static void main(String[] args) {
        int n=5;
        int k=2;

        //Joshephus problem is the problem in which we have to find the winner among the person standing in circle
        //the rule is that it kills the person which is at kth position and sword is given to next of that person and next person does the same until the last person is found

        int ans = findWinner(n,k);
        System.out.println("the winner is at "+ans);

    }
}
