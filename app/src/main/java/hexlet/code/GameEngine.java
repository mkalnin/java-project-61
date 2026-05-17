package hexlet.code;

import hexlet.code.games.Gameable;

import java.util.Scanner;

public final class GameEngine {
    private String userName;
    public static final short GAMES_LOOP_COUNT = 3;

    public void game(Gameable game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getGameTitle());
        for (int i = 0; i < GAMES_LOOP_COUNT; i++) {
            try {
                game.gameProcess(scanner, this);
            } catch (RuntimeException exception) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public void processUserAnswer(Scanner scanner, String question, String correctAnswer) {
        System.out.println("Question: " + question);
        System.out.println("Your answer: ");
        String answer = scanner.next();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + userName + "!");
            throw new RuntimeException();
        }
    }
}
