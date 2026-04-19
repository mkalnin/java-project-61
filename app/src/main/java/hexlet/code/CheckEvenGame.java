package hexlet.code;

import java.util.Scanner;

public class CheckEvenGame {
    public static void game(Cli cli, Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 100) + 1;

            String correctAnswer = "no";
            if (number % 2 == 0) {
                correctAnswer = "yes";
            }

            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + correctAnswer);
                cli.failMessage();
                return;
            }

        }
        cli.successMessage();
    }
}
