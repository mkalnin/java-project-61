package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit \n");
        String game = scanner.next();
        GameEngine gameEngine = new GameEngine();
        if (game.equals("1")) {
            Cli.greet();
        } else if (game.equals("2")) {
            gameEngine.game(scanner, new CheckEvenGame());
        } else if (game.equals("3")) {
            gameEngine.game(scanner, new CalculatorGame());
        } else if (game.equals("4")) {
            gameEngine.game(scanner, new GCD());
        } else if (game.equals("5")) {
            gameEngine.game(scanner, new Progression());
        } else if (game.equals("6")) {
            gameEngine.game(scanner, new Prime());
        } else if (game.equals("0")) {
            System.out.println("Bye");
        } else {
            System.out.println("Unexpected choice");
        }
        scanner.close();
    }
}
