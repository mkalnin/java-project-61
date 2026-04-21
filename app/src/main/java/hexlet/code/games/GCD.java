package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class GCD implements Gameable{
    @Override
    public String getGameTitle() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public void play(Scanner scanner, Cli cli) throws RuntimeException {
        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100) + 1;
        int gcd = this.getGCD(number1, number2);
        String correctAnswer = String.valueOf(this.getGCD(number1, number2));
        System.out.println("Question: " + number1 + ' ' + number2);
        System.out.println("Your answer: ");
        String answer = scanner.next();
        cli.checkAnswer(answer, correctAnswer);
    }

    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
