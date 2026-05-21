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
        int index = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int missingStep = (int) (Math.random() * PROGRESSION_LENGTH) + 1;
        int[] progression = generateProgression(start, index, PROGRESSION_LENGTH);
        String correctAnswer = "This was not supposed to happen";
        String progressionString = "";
        for (int step = 0; step < PROGRESSION_LENGTH; step++) {
            if (step == missingStep) {
                correctAnswer = String.valueOf(progression[step]);
                progressionString += ".. ";
            } else {
                progressionString += progression[step] + " ";
            }
        }
        GAME_ENGINE.processUserAnswer(progressionString, correctAnswer);
    }

    private int[] generateProgression(int start, int index, int progessionLength) {
        int[] progression = new int[progessionLength];
        for (int step = 1; step <= progessionLength; step++) {
            progression[step - 1] = start + index * step;
        }
        return progression;
    }
}
