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
        Cli cli = new Cli();
        if (game.equals("1")) {
            cli.greeting(scanner);
        } else if (game.equals("2")) {
            BasicGame.game(cli, scanner, new CheckEvenGame());
        } else if (game.equals("3")) {
            BasicGame.game(cli, scanner, new CalculatorGame());
        } else if (game.equals("4")) {
            BasicGame.game(cli, scanner, new GCD());
        } else if (game.equals("5")) {
            BasicGame.game(cli, scanner, new Progression());
        } else if (game.equals("6")) {
            cli.greeting(scanner);
            Prime.game(cli, scanner);
        } else if (game.equals("0")) {
            System.out.println("Bye");
        } else {
            System.out.println("Unexpected choice");
        }
        scanner.close();
    }
}
