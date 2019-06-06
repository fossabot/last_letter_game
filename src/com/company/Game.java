package com.company;
import java.util.*;
import com.company.Player;

public class Game {
    private List<Player> players = new ArrayList<Player>();
    private int current_ = 0;
    public void AddPlayer(Player p) {
        players.add(p);
    }

    public void Turn(){
        String word = players.get(current_).OnTurn();
        System.out.println("Entered: " + word);

        if (word == "rejected"){
            System.out.println("Word was rejected by player");
            MoveToPrev();
        }

        MoveToNext();
    }

    private void MoveToNext(){
        current_++;
        if(current_ >= players.size())
            current_ = 0;
    }

    private void MoveToPrev(){
        current_--;
        if(current_ < 0)
            current_ = players.size() - 1;
    }

}
