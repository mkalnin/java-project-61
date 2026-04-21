package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String userName;
    private Scanner scanner;

    public void greeting(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        this.setUserName(scanner.next());
        System.out.println("Hello, " + this.getUserName() + "!");
    }

    public void processUserAnswer(String question, String correctAnswer) {
        System.out.println("Question: " + question);
        System.out.println("Your answer: ");
        String answer = scanner.next();
        this.checkAnswer(answer, correctAnswer);
    }

    public void checkAnswer(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + this.getUserName());
            throw new RuntimeException();
        }
    }

    public void failMessage(String answer, String correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + correctAnswer);
        System.out.println("Let's try again, " + this.getUserName());
    }

    public void successMessage() {
        System.out.println("Congratulations,  " + this.getUserName());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
