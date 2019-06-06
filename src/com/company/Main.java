package com.company;
import com.company.Player;
import com.company.Game;
import com.company.Bot;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Bot bot = new Bot();
        Player player = new Player();

        game.AddPlayer(bot);
        game.AddPlayer(player);

        while (true)
            game.Turn();
    }
}
