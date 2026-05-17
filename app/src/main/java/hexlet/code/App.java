package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.CheckEvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
        switch (game) {
            case "1":
                Cli.greet();
                break;
            case "2":
                new CheckEvenGame().play();
                break;
            case "3":
                new CalculatorGame().play();
                break;
            case "4":
                new GCD().play();
                break;
            case "5":
                new Progression().play();
                break;
            case "6":
                new Prime().play();
                break;
            case "0":
                System.out.println("Bye");
                break;
            default:
                System.out.println("Unexpected choice: " + game + " is not in list");
                break;
        }
        scanner.close();
    }
}
