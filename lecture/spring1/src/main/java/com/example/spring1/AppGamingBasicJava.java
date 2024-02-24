package com.example.spring1;

import com.example.spring1.game.GameRunner;
import com.example.spring1.game.MarioGame;
import com.example.spring1.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}