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

        String[] progressionParts = generateProgression(start, difference, PROGRESSION_LENGTH, hiddenIndex);
        String question = String.join(" ", progressionParts);
        String correctAnswer = String.valueOf(start + difference * hiddenIndex);

        GAME_ENGINE.processUserAnswer(question, correctAnswer);
    }

    private String[] generateProgression(int start, int difference, int length, int hiddenIndex) {
        String[] progressionParts = new String[length];
        for (int step = 0; step < length; step++) {
            if (step == hiddenIndex) {
                progressionParts[step] = "..";
            } else {
                progressionParts[step] = String.valueOf(start + difference * step);
            }
        }
        return progressionParts;
    }
}
