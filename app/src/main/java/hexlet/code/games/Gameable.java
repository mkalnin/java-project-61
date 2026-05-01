package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Scanner;

public interface Gameable {
    String getGameTitle();
    void play(Scanner scanner, GameEngine game) throws RuntimeException;
}
