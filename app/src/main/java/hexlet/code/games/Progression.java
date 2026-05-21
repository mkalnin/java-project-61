package hexlet.code.games;

public class Progression implements Gameable {
    private static final int PROGRESSION_LENGTH = 10;
    public static final int NUMBER_HIGHEST_RANGE = 100;
    @Override
    public final String getGameTitle() {
        return "What number is missing in the progression?";
    }

    @Override
    public void play() {
        GAME_ENGINE.game(this);
    }

    @Override
    public final void gameProcess() throws RuntimeException {
        int start = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int difference = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int hiddenIndex = (int) (Math.random() * PROGRESSION_LENGTH);

        int[] progression = generateProgression(start, difference, PROGRESSION_LENGTH);

        String correctAnswer = String.valueOf(progression[hiddenIndex]);

        String[] questionParts = new String[PROGRESSION_LENGTH];
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            questionParts[i] = i == hiddenIndex ? ".." : Integer.toString(progression[i]);
        }

        String question = String.join(" ", questionParts);

        GAME_ENGINE.processUserAnswer(question, correctAnswer);
    }

    private int[] generateProgression(int start, int difference, int progressionLength) {
        int[] progression = new int[progressionLength];
        for (int step = 0; step < progressionLength; step++) {
            progression[step] = start + difference * step;
        }
        return progression;
    }
}
