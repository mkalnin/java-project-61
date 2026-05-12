package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Scanner;

public class GCD implements Gameable {
    @Override
    public final String getGameTitle() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static final int NUMBER_HIGHEST_RANGE = 10;
    @Override
    public final void play(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        int number1 = GameEngine.generateNumber(NUMBER_HIGHEST_RANGE);
        int number2 = GameEngine.generateNumber(NUMBER_HIGHEST_RANGE);
        int gcd = this.getGCD(number1, number2);
        String question = String.valueOf(number1) + ' ' + number2;
        String correctAnswer = String.valueOf(this.getGCD(number1, number2));
        gameEngine.processUserAnswer(scanner, question, correctAnswer);
    }

    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
