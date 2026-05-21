package hexlet.code.games;

import java.util.Random;

public class CalculatorGame implements Gameable {
    public static final int NUMBER_HIGHEST_RANGE = 100;
    @Override
    public final String getGameTitle() {
        return "What is the result of the expression?";
    }

    @Override
    public void play() {
        GAME_ENGINE.game(this);
    }

    @Override
    public final void gameProcess() throws RuntimeException {
        int number1 = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        int number2 = (int) (Math.random() * NUMBER_HIGHEST_RANGE) + 1;
        String[] signs = {"+", "-", "*"};
        int indexOfSign = new Random().nextInt(signs.length);
        String equation =  String.valueOf(number1) + ' ' + signs[indexOfSign] + ' ' + String.valueOf(number2);
        System.out.println(equation);
        String  correctAnswer = String.valueOf(this.calculate(number1, number2, signs[indexOfSign]));
        GAME_ENGINE.processUserAnswer(equation, correctAnswer);
    }

    final int calculate(int number1, int number2, String sign) {
        return switch (sign) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> throw new RuntimeException("\"" + sign + "\" is unexpected operation type");
        };
    }
}
