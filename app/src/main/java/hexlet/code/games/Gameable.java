package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public interface Gameable {
    public String getGameTitle();
    public void play(Scanner scanner, Cli cli) throws RuntimeException;
}
