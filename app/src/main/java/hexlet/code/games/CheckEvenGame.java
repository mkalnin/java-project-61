package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Scanner;

public class CheckEvenGame implements Gameable {
    public static final int NUMBER_HIGHEST_RANGE = 100;
    @Override
    public final String getGameTitle() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public final void gameProcess(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        int number = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        gameEngine.processUserAnswer(scanner, String.valueOf(number), correctAnswer);
    }
}
