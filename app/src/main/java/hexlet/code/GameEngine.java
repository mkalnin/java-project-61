package hexlet.code;

import hexlet.code.games.Gameable;

import java.util.Scanner;

public final class GameEngine {
    private String userName;
    public static final int BIG_NUMBER_HIGHEST_RANGE = 100;
    public static final int SHORT_NUMBER_HIGHEST_RANGE = 10;
    public static final short GAMES_LOOP_COUNT = 3;

    public void game(Scanner scanner, Gameable game) {
        this.greeting(scanner);
        System.out.println(game.getGameTitle());
        for (int i = 0; i < GAMES_LOOP_COUNT; i++) {
            try {
                game.play(scanner, this);
            } catch (RuntimeException exception) {
                return;
            }
        }
        this.successMessage();
    }

    public void greeting(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
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
            System.out.println("Let's try again, " + userName + "!");
            throw new RuntimeException();
        }
    }

    public void successMessage() {
        System.out.println("Congratulations, " + userName + "!");
    }

    private String getUserName() {
        return this.userName;
    }

    private void setUserName(String name) {
        this.userName = name;
    }

    public static int generateNumber(int highestRange) {
        return (int) (Math.random() * highestRange) + 1;
    }
}
