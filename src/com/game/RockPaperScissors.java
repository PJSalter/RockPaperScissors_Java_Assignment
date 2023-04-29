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
        // If the number of rounds is less than 1 or greater than 10, print an error message and exit the program.
    }

}
