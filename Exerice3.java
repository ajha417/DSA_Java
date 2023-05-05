package com.company;

import java.util.*;
class Game{
    public int number;
    public int noOfGuesses;
    public int inputNumber;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    //    int guess_count;


    public Game(){
//       this.number =n;
    Random r=new Random();
    this.number=r.nextInt(100);

    }
    void takeuserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess any number:");
        inputNumber= sc.nextInt();
//        return inputNumber;


    }
     boolean isCorrect(){
        noOfGuesses++;
    if(inputNumber==number){
        System.out.format("Yes you guessed it right the number was %d\nYou guessed it in %d attempts",number,noOfGuesses);
        return true;
    }
    else if(inputNumber<number){
        System.out.println("The guessed number is too less");
    }
    else if(inputNumber>number){
        System.out.println("The guessed number is too high");
    }
    return false;
    }
}

public class Exerice3 {
    public static void main(String[] args) {
        System.out.println("weclcome  to guessing game");
        Game g=new Game();
        boolean b=false;
        while(!b) {
            g.takeuserInput();
            b = g.isCorrect();
//            System.out.println(b);
        }

    }
}