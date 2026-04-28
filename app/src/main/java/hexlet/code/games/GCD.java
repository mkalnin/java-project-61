package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Scanner;

public class GCD implements Gameable{
    @Override
    final public String getGameTitle() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    final public void play(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100) + 1;
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
