package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Scanner;

public interface Gameable {
    public String getGameTitle();
    public void play(Scanner scanner, GameEngine game) throws RuntimeException;
}
