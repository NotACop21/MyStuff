package lab006;

import java.util.Scanner; 
import java.util.Random; 
//************************************************************  
//   Guess.java 
// 
//   Play a game where the user guesses a number from 1 to 10 
// 
// ************************************************************ 

public class Guess 
{
    public static void main(String[] args) 
    { 
        final int MAX = 10;
        int numToGuess; //Number the user tries to guess 
        int guess; //The user's guess 
        int guessCount = 1;
        int guessHigh = 0;
        int guessLow = 0;
        
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random();
        
        numToGuess = generator.nextInt(MAX) + 1;
        System.out.println("Pick a number between 1 and " + MAX + " if you" 
                + " get it right you win!"); 
        
        guess = scan.nextInt();
        
        while (numToGuess != guess) {
            System.out.println("Sorry that is incorrect!! Please try again."); 
            if (numToGuess < guess) {
                System.out.println("A hint (Your guess is too high)");
                guessCount++;
                guessHigh++;
                guess = scan.nextInt(); 
            }
            else
                if(numToGuess > guess) {
                System.out.println("A hint (Your guess is too low)");
                guessCount++;
                guessLow++;
                guess = scan.nextInt();
                }
            }
        System.out.println("Good guess!! You got it!!");
        System.out.println("It took you " + guessCount + " times to get it.");
        System.out.println("You guessed low: " + guessLow + " time(s).");
        System.out.println("You guessed high: " + guessHigh + " time(s).");
        scan.close();
             }
} 
 
