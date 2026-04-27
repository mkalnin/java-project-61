package hexlet.code;

import hexlet.code.games.Gameable;

import java.util.Scanner;

public class GameEngine {
    private String userName;
    private Scanner scanner;

    public void game(Scanner scanner, Gameable game) {
        this.greeting(scanner);
        System.out.println(game.getGameTitle());
        for (int i = 0; i < 3; i++) {
            try {
                game.play(scanner, this);
            } catch (RuntimeException exception) {
                return;
            }
        }
        this.successMessage();
    }

    public void singleGame(Scanner scanner, Gameable game) {
        this.greeting(scanner);
        System.out.println(game.getGameTitle());
        try {
            game.play(scanner, this);
        } catch (RuntimeException exception) {
            return;
        }
        this.successMessage();
    }

    public void greeting(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        this.setUserName(scanner.next());
        System.out.println("Hello, " + this.getUserName() + "!");
    }

    public void processUserAnswer(Scanner scanner, String question, String correctAnswer) {
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
            System.out.println("Let's try again, " + this.getUserName() + "!");
            throw new RuntimeException();
        }
    }

    public void successMessage() {
        System.out.println("Congratulations, " + this.getUserName() + "!");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
