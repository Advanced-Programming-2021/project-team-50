package view;

import controller.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterMenu {

    // make class singleton
    private RegisterMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    private static RegisterMenu instance;
    private Scanner scanner;
    private User user;

    public static RegisterMenu getInstance(Scanner scanner) {
        if (instance == null) {
            instance = new RegisterMenu(scanner);
        }
        instance.scanner = scanner;
        return instance;
    }


    public void showRegisterMessage() {
        System.out.println("Register Menu:");
        System.out.println("Enter your command");
        scanner.nextLine();
        String input = scanner.nextLine();

        Pattern userCreatePattern = Pattern.compile("user create");
        Matcher userCreate = userCreatePattern.matcher(input);

        Pattern usernamePattern = Pattern.compile("--username");
        Matcher usernameMatcher = usernamePattern.matcher(input);

        Pattern nicknamePattern = Pattern.compile("--nickname");
        Matcher nicknameMatcher = nicknamePattern.matcher(input);

        Pattern passwordPattern = Pattern.compile("--password");
        Matcher passwordMatcher = passwordPattern.matcher(input);

        if (input.equals("menu show-current")) {
            System.out.println("Register Menu");
        } else if (input.equals("menu exit")) {
            WelcomeMenu.getInstance(scanner).showWelcomeMessage();
        } else if (userCreate.find()) {
            if (usernameMatcher.find() && nicknameMatcher.find() && passwordMatcher.find()) {
                String[] temp = input.split(" --username");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String username = temp[0];

                temp = input.split(" --nickname");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String nickname = temp[0];

                temp = input.split(" --password");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String password = temp[0];

                if (!User.isUsernameUnique(username)) {
                    System.out.println("user with username <" + username + "> already exists");
                    RegisterMenu.getInstance(scanner).showRegisterMessage();
                } else if (!User.isNicknameUnique(nickname)) {
                    System.out.println("user with nickname <" + nickname + "> already exists");
                    RegisterMenu.getInstance(scanner).showRegisterMessage();
                } else if (!User.checkPasswordPattern(password)) {
                    System.out.println("""
                            WEAK PASSWORD!
                            Your password must:
                            A) has at least 1 & at most 3 digits at first
                            B) has one capital letter exactly after A
                            C) has at least 5 & at most 10 a-z characters exactly after B""");
                    RegisterMenu.getInstance(scanner).showRegisterMessage();
                } else {
                    new User(nickname, username, password);
                    System.out.println("user created successfully!");
                    WelcomeMenu.getInstance(scanner).showWelcomeMessage();
                }
            }
        } else {
            System.out.println("invalid command");
            RegisterMenu.getInstance(scanner).showRegisterMessage();
        }
    }
}
