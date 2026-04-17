package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit \n");
        String game = scanner.next();
        //Cli cli = new Cli();
        if (game.equals("1")) {
            Cli.greeting();
        } else if (game.equals("2")) {
            Cli.greeting();
            CheckEvenGame.game();
        } else if (game.equals("0")) {
            System.out.println("Bye");
        } else {
            System.out.println("Unexpected choice");
        }
        scanner.close();
    }
}
