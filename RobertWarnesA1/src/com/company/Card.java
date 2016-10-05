
package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;

public class Card {
    private int id;
    public Card(){
        String fileName = "pack.txt";
        String line;
        ArrayList cardList = new ArrayList();
        try {
            BufferedReader input = new BufferedReader(new FileReader(fileName));
            if(!input.ready()){
                throw new IOException();
            }
            while ((line = input.readLine()) !=null){
                cardList.add(line);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error. Can't open file.");
        }
        int cardSize = cardList.size();
        for(int i = 0; i < cardSize; i ++){
            System.out.println(cardList.get(i).toString());
        }
    }

}
