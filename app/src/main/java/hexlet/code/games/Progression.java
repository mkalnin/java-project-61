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
        StringBuilder progressionString = new StringBuilder();

        for (int step = 0; step < PROGRESSION_LENGTH; step++) {
            if (step == hiddenIndex) {
                progressionString.append("..");
            } else {
                progressionString.append(progression[step]);
            }

            if (step < PROGRESSION_LENGTH - 1) {
                progressionString.append(" ");
            }
        }

        GAME_ENGINE.processUserAnswer(progressionString.toString(), correctAnswer);
    }

    private int[] generateProgression(int start, int difference, int progressionLength) {
        int[] progression = new int[progressionLength];
        for (int step = 0; step < progressionLength; step++) {
            progression[step] = start + difference * step;
        }
        return progression;
    }
}
