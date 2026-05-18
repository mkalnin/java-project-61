package hexlet.code.games;

import java.util.Random;

public class Progression implements Gameable {
    private static final int PROGRESSION_LENGTH = 10;
    public static final int NUMBER_HIGHEST_RANGE = 100;
    private String correctAnswer;
    @Override
    public final String getGameTitle() {
        return "What number is missing in the progression?";
    }

    @Override
    public final void gameProcess() throws RuntimeException {
        String progression = generateProgression();
        GAME_ENGINE.processUserAnswer(progression, correctAnswer);
    }

    private String generateProgression() {
        Random rand = new Random();
        int start = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int index = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int missingStep = rand.nextInt(this.getProgressionLength()) + 1;
        correctAnswer = "This was not supposed to happen";
        String progression = "";
        for (int step = 1; step <= this.getProgressionLength(); step++) {
            int currentElement = start + index * step;
            if (step == missingStep) {
                correctAnswer = String.valueOf(currentElement);
                progression += ".. ";
            } else {
                progression += currentElement + " ";
            }
        }
        return progression;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String answer) {
        this.correctAnswer = answer;
    }

    public final int getProgressionLength() {
        return PROGRESSION_LENGTH;
    }
}
