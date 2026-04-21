package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class CheckEvenGame implements Gameable {
    @Override
    public String getGameTitle() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public void play(Scanner scanner, Cli cli) throws RuntimeException {
        int number = (int) (Math.random() * 100) + 1;
        String correctAnswer = "no";
        if (number % 2 == 0) {
            correctAnswer = "yes";
        }
        cli.processUserAnswer(String.valueOf(number), correctAnswer);
    }
}
