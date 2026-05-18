package hexlet.code.games;

public class GCD implements Gameable {
    @Override
    public final String getGameTitle() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static final int NUMBER_HIGHEST_RANGE = 10;
    @Override
    public final void gameProcess() throws RuntimeException {
        int number1 = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int number2 = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int gcd = this.getGCD(number1, number2);
        String question = String.valueOf(number1) + ' ' + number2;
        String correctAnswer = String.valueOf(this.getGCD(number1, number2));
        GAME_ENGINE.processUserAnswer(question, correctAnswer);
    }

    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
