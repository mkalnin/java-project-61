package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class CalculatorGame implements Gameable {
    @Override
    public String getGameTitle() {
        return "What is the result of the expression?";
    }

    @Override
    public void play(Scanner scanner, Cli cli) throws RuntimeException {
        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100) + 1;
        String[] signs = {"+", "-", "*"};
        int indexOfSign = new Random().nextInt(signs.length);
        String equation =  String.valueOf(number1) + ' ' + signs[indexOfSign] + ' ' + String.valueOf(number2);
        System.out.println(equation);
        String  correctAnswer = String.valueOf(this.correctAnswer(number1, number2, signs[indexOfSign]));
        String answer = scanner.next();
        cli.checkAnswer(answer, correctAnswer);
    }

    private int correctAnswer(int number1, int number2, String sign) {
        switch (sign) {
            case "+": return number1 + number2;
            case "-": return number1 - number2;
            case "*": return number1 * number2;
            default: throw new RuntimeException();
        }
    }
}
