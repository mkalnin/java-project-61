package hexlet.code.games;

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
        int start = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int index = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int missingStep = (int) (Math.random() * PROGRESSION_LENGTH) + 1;
        String progression = generateProgression(start, index, missingStep, PROGRESSION_LENGTH);
        GAME_ENGINE.processUserAnswer(progression, correctAnswer);
    }

    private String generateProgression(int start, int index, int missingStep, int progessionLength) {
        correctAnswer = "This was not supposed to happen";
        String progression = "";
        for (int step = 1; step <= progessionLength; step++) {
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
}
