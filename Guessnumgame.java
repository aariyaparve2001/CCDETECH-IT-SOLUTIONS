
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumgame;
import java.util.Random;
import java.util.Scanner;

public class Guessnumgame {

    public static void main(String[] args) {
        playGame();
    }
private static void playGame(){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int lowerBound = 1;
    int upperBound =100;
    int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    int maxAttempt = 10;
    int attempts = 0;
    System.out.println("Welcome To The Guessing Game!");
    System.out.println("I have selected a number between" + lowerBound + " and " +upperBound+ ".Try to guess it!");
    
    while(attempts < maxAttempt)
    {
       System.out.print("Enter Your Guess : ");
       int playerGuess = scanner.nextInt();
       attempts++;
       
       if(playerGuess < lowerBound || playerGuess > upperBound){
           System.out.println("Please Enter a Number Between" + lowerBound +"and" + upperBound +".");
           continue;
       }
       if(playerGuess == numberToGuess){
           System.out.println("Congratulations! You Guessed Correct" + attempts+"attempts.");
           break;
       }
       else if(playerGuess < numberToGuess ){
        System.out.println("Too Low. Try again");
       }
       else{
           System.out.println("Too high, Try again");
       }
    }
    
    if(attempts == maxAttempt){
        System.out.println("Sorry you have run out of attempts. The correct number was: " + numberToGuess);
    }
   scanner.close();
}
    
}

