package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class BasicGame {
    public static void game(Cli cli, Scanner scanner, Gameable game) {
        cli.greeting(scanner);
        System.out.println(game.getGameTitle());
        for (int i = 0; i < 3; i++) {
            try {
                game.play(scanner, cli);
            } catch (RuntimeException exception) {
                return;
            }
        }
        cli.successMessage();
    }
}
