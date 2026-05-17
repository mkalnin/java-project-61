package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Scanner;

public interface Gameable {
    String getGameTitle();
    default void play() {
        GameEngine gameEngine = new GameEngine();
        gameEngine.game(this);
    };
    void gameProcess(Scanner scanner, GameEngine game) throws RuntimeException;
}
