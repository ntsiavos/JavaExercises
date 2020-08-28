/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kino;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ntsia
 */
public class KinoDraw implements Kino {
    private Scanner sc = new Scanner(System.in);
    private int bet=0;
    private int draws=0;
    private Set<Integer> numbersDrawn = new TreeSet<Integer>();
    private int guess = 0;
    private int result = 0;
    private int totalEarnings = 0;
    private int totalBets = 0;
   
  
    //We put the numbers in a treeset so that when we print them here, they are in ascending order
    @Override
    public void showDrawNumbers() {
        System.out.println("Set of numbers drawn: " +numbersDrawn);
    }
    
    //Checks if the draw result is equal to user's choice and applies the proper amount of money won if so
    @Override
    public void calcEarning() {
        if (result==guess){
            if (guess==1 || guess==2) totalEarnings += (bet*2);
            else totalEarnings += (bet*4);
        }
    }

    
    //Amount user wants to bet
    public void betAmount(){
       System.out.print("Welcome to Kino! Please choose your bet (1, 2, 3, 5, 10, 15, 20, 30, 50 or 100 euros): ");
        bet = sc.nextInt();
        if (!(bet==1 || bet==2 || bet==3 || bet==5 || bet==10 || bet==15 || bet==20 || bet==30 || bet==50 || bet==100)){
            System.out.println("Incorrect input! Please try again!");
            betAmount();
        } 
    }
    
    //Number of draws
    public void numberOfDraws(){
        System.out.print("Please select the number of times you wish to play (1, 2, 4, 5, 6, 10, 20, 50, 100, 200): ");
        draws = sc.nextInt();
        if (!(draws==1 || draws==2 || draws==4 || bet==5 || draws==6||draws==10 || draws==20 || draws==50 || draws==100 || draws==200)){
            System.out.println("Incorrect input, please try again!");
            numberOfDraws();
        }
    }
    
    
    //Runs as many draws as the user requested. Fills the set with 20 unique numberes and checks them. At the end it clears the set for the next loop
    @Override
    public void runDraw() {
        
        totalBets=(bet*draws);
        for (int i = 0; i < draws; i++) {
            
            System.out.println("");
            System.out.println("Draw #" +(i+1));
            System.out.println("*******");
        
        while (numbersDrawn.size()<20){
            int min = 1;
            int max = 80;
            int random_int = (int)(Math.random() * (max - min + 1) + min);
            numbersDrawn.add(random_int);
        }
         showDrawNumbers();
         result = checkResult();
         calcEarning();
            System.out.println("So far you have earned: " +totalEarnings);
            System.out.println("**************************");
            numbersDrawn.clear();
        }
    }
    
    //Checks if the draw is odd, even or a draw
    public int checkResult(){
        
        int counter=0;
        for ( int i : numbersDrawn) {
            int check = (i%2);
            if (check==0) counter++;
        }
        if (counter<10){ 
            System.out.println("Odds win!");
            return 1;
        }
        else if (counter>10){
            System.out.println("Evens win!");
            return 2;
        }
        else {
            System.out.println("It's a draw!");
            return 3;
        }
    }
    
    //Saves the users bet choice
    public void guessResult(){
        System.out.print("Please select on which result you would like to bet. For more odd numbers, type 1. For more even numbers, type 2. For draw, type 3: ");
        guess=sc.nextInt();
        if (!(guess==1 || guess==2 || guess==3)){
            System.out.println("Wrong input, please try again.");
            guessResult();
        }
    
    }
    
    //calculates the overall amount won or lost
    public void end(){
    System.out.println("All draws complete! You bet " +totalBets+ ". You won " +totalEarnings+ ". "
            + "Your total earnings are " +(totalEarnings-totalBets)+ ". Thank you for playing!");
    
    }
}

