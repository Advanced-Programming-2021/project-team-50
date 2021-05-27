package view;

import java.util.Scanner;

public class WelcomeMenu {

    // make class singleton
    private WelcomeMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    private static WelcomeMenu instance;
    private Scanner scanner;

    public static WelcomeMenu getInstance(Scanner scanner) {
        if (instance == null) {
            instance = new WelcomeMenu(scanner);
        }
        instance.scanner = scanner;
        return instance;
    }

    public void showWelcomeMessage() {
        System.out.println("Welcome to Yu-Gi-Oh!");
        System.out.println("Please Login or Register first:");
        System.out.println("1- Login");
        System.out.println("2- Register");
        System.out.println("0- Exit");

        int input = scanner.nextInt();
        if (input == 1) {
            LoginMenu.getInstance(scanner).showLoginMessage();
        } else if (input == 2) {
            RegisterMenu.getInstance(scanner).showRegisterMessage();
        } else if (input == 0) {
            return;
        } else {
            System.out.println("ERROR: Please enter a valid input!");
            WelcomeMenu.getInstance(scanner).showWelcomeMessage();
        }
    }
}
