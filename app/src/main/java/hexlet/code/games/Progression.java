package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Random;
import java.util.Scanner;

public class Progression implements Gameable {
    private static final int PROGRESSION_LENGTH = 10;
    public static final int NUMBER_HIGHEST_RANGE = 100;
    @Override
    public final String getGameTitle() {
        return "What number is missing in the progression?";
    }

    @Override
    public final void play(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        Random rand = new Random();
        int start = GameEngine.generateNumber(NUMBER_HIGHEST_RANGE);
        int index = GameEngine.generateNumber(NUMBER_HIGHEST_RANGE);
        int missingStep = rand.nextInt(this.getProgressionLength()) + 1;
        String subsequence = "";
        String correctAnswer = "This was not supposed to happen";
        for (int step = 1; step <= this.getProgressionLength(); step++) {
            int currentElement = start + index * step;
            if (step == missingStep) {
                correctAnswer = String.valueOf(currentElement);
                subsequence += ".. ";
            } else {
                subsequence += currentElement + " ";
            }
        }
        gameEngine.processUserAnswer(scanner, subsequence, correctAnswer);
    }

    public final int getProgressionLength() {
        return PROGRESSION_LENGTH;
    }
}
