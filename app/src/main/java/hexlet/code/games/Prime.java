package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime implements Gameable {
    @Override
    public String getGameTitle() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public void play(Scanner scanner, Cli cli) throws RuntimeException {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        String correctAnswer;
        if (Prime.isPrime(number)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        cli.processUserAnswer(String.valueOf(number), correctAnswer);
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
