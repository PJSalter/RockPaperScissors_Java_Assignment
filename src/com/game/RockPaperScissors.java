package com.game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        // Create a new Scanner object to read user input.
        Scanner input = new Scanner(System.in);
        // Create a new Random object to generate computer's choice.
        Random rand = new Random();
        // Initialize variables for the number of rounds, user's choice, computer's choice,
        int numRounds;
        int userChoice;
        int computerChoice;
        // number of ties, number of user wins, and number of computer win's.
        int numTies = 0;
        int numUserWins = 0;
        int numComputerWins = 0;

        // Prompt the user to enter the number of rounds to play.
        // Read the user's input using the Scanner object.
        System.out.print("How many rounds would you like to play? (1-10): ");
        numRounds = input.nextInt();

        // Check if the number of rounds entered by the user is valid.
        if(numRounds < 1 || numRounds > 10) {
            // If the number of rounds is less than 1 or greater than 10, print an error message and exit the program.
            System.out.print("Invalid number of rounds. Please enter a number between 1 and 10.");
            return;
        }

        // Play specified number of rounds.
        for(int i = 0; i < numRounds; i++) {
            // ask user for choice.
            System.out.println("Enter your choice (1=Rock, 2=Paper, 3=Scissors): ");
            userChoice = input.nextInt();

            // Generate computer choice.
            computerChoice = rand.nextInt(3) + 1;


            // Determine winner of round.
            switch (userChoice) {
                case 1:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("Tie!");
                            numTies++;
                            break;
                        case 2:
                            System.out.println("Computer wins!");
                            numComputerWins++;
                            break;
                        case 3:
                            System.out.println("You win!");
                            numUserWins++;
                            break;
                    }
                    break;
                case 2:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("You win!");
                            numUserWins++;
                            break;
                        case 2:
                            System.out.println("Tie!");
                            numTies++;
                            break;
                        case 3:
                            System.out.println("Computer wins!");
                            numComputerWins++;
                            break;
                    }
                    break;
                case 3:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("Computer wins!");
                            numComputerWins++;
                            break;
                        case 2:
                            System.out.println("You win!");
                            numUserWins++;
                            break;
                        case 3:
                            System.out.println("Tie!");
                            numTies++;
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    i--;
                    break;
            }
        }

        // Print results of Game played.
        System.out.println("Number of ties: " + numTies);
        System.out.println("Number of User wins: " + numUserWins);
        System.out.println("Number of Computer wins: " + numComputerWins);

        // Check if the number of user wins our greater than the number of computer wins. If so, it prints "Congratulations, you win!".
        if(numUserWins > numComputerWins) {
            System.out.println("Congratulations, you win!");
            // If the number of computer wins is greater than the number of user wins, it prints "Sorry, the computer wins."
        } else if (numComputerWins > numUserWins) {
            System.out.println("Sorry, the Computer wins.");
        } else {
            // If the number of user wins is equal to the number of computer wins, it prints "It's a tie!".
            System.out.println("It's a tie!");
        }

        // Asking the user if they want to play again
        System.out.println("Do you want to play again?(y/n): ");

        // input is stored in a variable called playAgain.
        String playAgain = input.next();

        // conditional from user choosing y/n
        if(playAgain.equalsIgnoreCase("y")){
            main(null);
        } else {
            System.out.println("Thanks for playing!");
        }

    }

}
