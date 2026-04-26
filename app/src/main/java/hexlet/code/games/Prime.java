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
        int number = rand.nextInt(10) + 1;
        String correctAnswer;
        if (Prime.isPrime(number, 2)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        cli.processUserAnswer(String.valueOf(number), correctAnswer);
    }

    private static boolean isPrime(int n, int i) {
        // Base case: Numbers less than or equal to 1 are not prime
        if (n <= 1) return false;

        // Base case: 2 is the smallest prime number
        if (n == 2) return true;

        // If n is divisible by i, it is not prime
        if (n % i == 0) return false;

        // Optimization: If divisor squared exceeds n, n must be prime
        if (i * i > n) return true;

        // Recursive call: Check the next divisor
        return isPrime(n, i + 1);
    }

}
