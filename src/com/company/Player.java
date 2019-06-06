package com.company;
import java.util.Scanner;

public class Player {
    public String OnTurn(){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if(word == "/reject")
        {
            return "Rejected";
        }
        else
        {
            return word;
        }
    }
}

