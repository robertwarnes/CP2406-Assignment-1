/**
 * CP2406 Assignment 1
 * Mineral Supertrumps
 * Created by Robert Warnes
 * Due 04/10/2016
 * Github URL -
 */

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
        int option = getUserMenuChoice();
        switch(option){
            case 1:
                startNewGame();
                break;
            case 2:
                quitGame();
                break;
        }
    }

    private static void startNewGame(){
        int numberOfPlayers = getNumberOfPlayers();
        Game game = new Game(numberOfPlayers);
        game.selectDealer();
        game.dealRandomCardsToEachPlayer();
    }

    private static int getUserMenuChoice(){
        boolean validMenu = false;
        int UserMenuChoice = 0;
        do {
            Scanner inputUserMenuChoice = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 2:");
            try {
                UserMenuChoice = inputUserMenuChoice.nextInt();
                if (UserMenuChoice >= 1 && UserMenuChoice <= 4) {
                    validMenu = true;
                } else {
                    System.out.println("Error. Please enter a number between 1 and 2");
                    inputUserMenuChoice.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Please enter a number between 1 and 2");
                inputUserMenuChoice.nextInt();
            }
        }while(validMenu = false);

        return UserMenuChoice;
    }

    private static int getNumberOfPlayers(){
        boolean validPlayers = false;
        int numberOfPlayers = 0;
        do {
            Scanner inputNumberOfPlayers = new Scanner(System.in);

            System.out.println("Enter number of players between 3 and 5: ");
            try {

                numberOfPlayers = inputNumberOfPlayers.nextInt();
                if (numberOfPlayers >= 3 && numberOfPlayers <= 5) {
                    validPlayers = true;
                } else {
                    System.out.println("Error. Please enter a number between 3 and 5");
                    inputNumberOfPlayers.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Please enter a number between 3 and 5");
                numberOfPlayers = inputNumberOfPlayers.nextInt();
            }
        }while(validPlayers = false);
        return numberOfPlayers;
    }

    private static void welcomeMessage(){
        System.out.println("Welcome to Mineral Supertrumps. We hope you enjoy the game.");
    }

    private static void menu(){
        System.out.println("Please enter the corresponding number to make a selection");
        System.out.println("1 - Start Game\n2 - Quit");
    }

    private static void instructions(){
        System.out.println("Number of players: 3 - 5");
        System.out.println("\nMineral Supertrumps is a card based game with deck of 60 cards including 6 supertrump cards.");
        System.out.println("\nThe game selects a dealer and each player is given");
    }

    private static void quitGame(){
        System.out.println("Thanks for playing! See you in the next game!");
        System.exit(0);
    }
}

