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
        String[] progression = generateProgression(start, difference, PROGRESSION_LENGTH);
        String correctAnswer = String.valueOf(progression[hiddenIndex]);
        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);
        GAME_ENGINE.processUserAnswer(question, correctAnswer);
    }

    private String[] generateProgression(int start, int difference, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (int step = 0; step < progressionLength; step++) {
            progression[step] = String.valueOf(start + difference * step);
        }
        return progression;
    }
}
