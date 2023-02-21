package javaProject;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame_1 {
	public static void game() {
		 
	    
        // Scanner Class
        Scanner sc = new Scanner(System.in);
        
        // Generate the numbers
        int number = 1 + (int)(100* Math.random());
        int i, guess;                       
        do {
        // Given K trials
        System.out.println("\nEnter the number of trials.");
        int num=sc.nextInt();

        System.out.println(
            "\nA number is chosen between 1 to 100.Guess the number within "+ num + " trials.");
           
        // Iterate over number of Trials
       
        for (i = 0; i < num; i++) {
 
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!You guessed the number.");
                    
                break;
            }
            else if (number > guess
                     && i != num - 1) {
                System.out.println(
                    "The number is greater than " + guess);
                    
            }
            else if (number < guess && i != num - 1) {
                System.out.println(
                    "The number is less than " + guess);
            
            }
        }
 
        if (i == num) {
            System.out.println(
                "You have exhausted K trials.");
            System.out.println("You win 0 points.\n0 marks.\nBest Luck for next round!!");
            System.out.println( "\nThe number was " + number);
               
        }
       if(i<=number/number) {
    	   System.out.println("You did a fantastic job...");
    	   System.out.println("You win 5 points.\nYou scored 100 marks");
    	   
       }
       else if(i<=num/2) {
    	   System.out.println("Good!\nYou win 3 points.\nYou scored 50 marks.\n");
       }
        }
        while(i<=100);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
game();
	}

}
