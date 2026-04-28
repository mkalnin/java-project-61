package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Random;
import java.util.Scanner;

public class Prime implements Gameable {
    @Override
    final public String getGameTitle() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    final public void play(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        String correctAnswer;
        if (Prime.isPrime(number)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        gameEngine.processUserAnswer(scanner, String.valueOf(number), correctAnswer);
    }

    private static boolean isPrime(int n) {
        boolean isPrime = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

}
