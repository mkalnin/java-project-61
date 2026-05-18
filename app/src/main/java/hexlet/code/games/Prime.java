package hexlet.code.games;

public class Prime implements Gameable {
    public static final int NUMBER_HIGHEST_RANGE = 100;
    @Override
    public final String getGameTitle() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public final void gameProcess() throws RuntimeException {
        int number = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        String correctAnswer;
        if (Prime.isPrime(number)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        GAME_ENGINE.processUserAnswer(String.valueOf(number), correctAnswer);
    }

    private static boolean isPrime(int n) {
        boolean isPrime = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

}
