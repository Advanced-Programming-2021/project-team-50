package view;


import controller.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginMenu {

    // make class singleton
    private LoginMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    private static LoginMenu instance;
    private Scanner scanner;
    private User user;

    public static LoginMenu getInstance(Scanner scanner) {
        if (instance == null) {
            instance = new LoginMenu(scanner);
        }
        instance.scanner = scanner;
        return instance;
    }


    public void showLoginMessage() {
        System.out.println("Login Menu:");
        System.out.println("Enter your command");
        scanner.nextLine();
        String input = scanner.nextLine();

        Pattern userLoginPattern = Pattern.compile("user login");
        Matcher userLogin = userLoginPattern.matcher(input);

        Pattern usernamePattern = Pattern.compile("--username");
        Matcher usernameMatcher = usernamePattern.matcher(input);

        Pattern passwordPattern = Pattern.compile("--password");
        Matcher passwordMatcher = passwordPattern.matcher(input);

        if (input.equals("menu show-current")) {
            System.out.println("Login Menu");
        } else if (input.equals("menu exit")) {
            WelcomeMenu.getInstance(scanner).showWelcomeMessage();
        } else if (userLogin.find()) {
            if (usernameMatcher.find() && passwordMatcher.find()) {
                String[] temp = input.split(" --username");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String username = temp[0];

                temp = input.split(" --password");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String password = temp[0];
                if (!User.doesUsernameExists(username)) {
                    System.out.println("Username and password didn't match!");
                    LoginMenu.getInstance(scanner).showLoginMessage();
                } else if (!User.checkPassword(username, password)) {
                    System.out.println("Username and password didn't match!");
                    LoginMenu.getInstance(scanner).showLoginMessage();
                }
            } else {
                System.out.println("invalid command");
                LoginMenu.getInstance(scanner).showLoginMessage();
            }
        } else {
            System.out.println("invalid command");
            LoginMenu.getInstance(scanner).showLoginMessage();
        }
    }
}
