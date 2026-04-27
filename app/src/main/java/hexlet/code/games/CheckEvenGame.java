package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.GameEngine;

import java.util.Scanner;

public class CheckEvenGame implements Gameable {
    @Override
    public String getGameTitle() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public void play(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        int number = (int) (Math.random() * 100) + 1;
        String correctAnswer = "no";
        if (number % 2 == 0) {
            correctAnswer = "yes";
        }
        gameEngine.processUserAnswer(scanner, String.valueOf(number), correctAnswer);
    }
}
