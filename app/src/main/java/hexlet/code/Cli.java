package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String userName;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
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
