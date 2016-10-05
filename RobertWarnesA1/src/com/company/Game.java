package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static final int TOTAL_NUMBER_OF_CARDS = 60;
    private int numberOfPlayers;
    private Player[] players;
    private Deck deck;

    public Game(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    public void selectDealer(){
        Random randomDealer = new Random();
        int dealerID = randomDealer.nextInt(numberOfPlayers)+1;
        System.out.println("Player No. " + dealerID + " is the dealer.");
    }

    public void dealRandomCardsToEachPlayer(){

        players = new Player[numberOfPlayers];
        for (Player player : players){
            ArrayList cardList = deck.dealCards(TOTAL_NUMBER_OF_CARDS);
            player.setCards(cardList);
        }
    }
}
