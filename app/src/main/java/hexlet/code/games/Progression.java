package hexlet.code.games;

import hexlet.code.GameEngine;

import java.util.Random;
import java.util.Scanner;

public class Progression implements Gameable{
    @Override
    final public String getGameTitle() {
        return "What number is missing in the progression?";
    }

    @Override
    final public void play(Scanner scanner, GameEngine gameEngine) throws RuntimeException {
        Random rand = new Random();
        int start = rand.nextInt(10) + 1;
        int index = rand.nextInt(10) + 1;
        int missingStep = rand.nextInt(10) + 1;
        String subsequence = "";
        String correctAnswer = "This was not supposed to happen";
        for (int step = 1; step <= 10; step++) {
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
}
