package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String userName;

    public void greeting(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        this.setUserName(scanner.next());
        System.out.println("Hello, " + this.getUserName() + "!");
    }

    public void failMessage() {
        System.out.println("Let's try again, " + this.getUserName());
    }

    public void successMessage() {
        System.out.println("Congratulations,  " + this.getUserName());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
