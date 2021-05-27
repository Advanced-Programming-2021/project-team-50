package view.menu;

import controller.User;
import view.MainMenu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileMenu {
    private ProfileMenu(Scanner scanner, User user) {
        this.scanner = scanner;
        this.user = user;
    }

    private static ProfileMenu instance;
    private Scanner scanner;
    private User user;

    public static ProfileMenu getInstance(Scanner scanner, User user) {
        if (instance == null) {
            instance = new ProfileMenu(scanner, user);
        }
        instance.scanner = scanner;
        instance.user = user;
        return instance;
    }

    public void showProfileMenuMessage() {
        System.out.println("Enter your command:");
        String input = scanner.nextLine();
        Pattern profileChangePattern = Pattern.compile("profile change");
        Matcher profileChange = profileChangePattern.matcher(input);

        Pattern changeNicknamePattern = Pattern.compile("profile change --nickname");
        Matcher changeNickname = changeNicknamePattern.matcher(input);

        Pattern changePasswordPattern1 = Pattern.compile("--password");
        Matcher changePassword1 = changePasswordPattern1.matcher(input);

        Pattern changePasswordPattern2 = Pattern.compile("--current");
        Matcher changePassword2 = changePasswordPattern2.matcher(input);

        if (changeNickname.find()) {
            String[] temp = input.split("<");
            temp = temp[1].split(">");
            if (User.isNicknameUnique(temp[0])) {
                user.setNickname(temp[0]);
                System.out.println("nickname changed successfully!");
            } else {
                System.out.println("user with nickname <" +
                        temp[0] + "> already exists");
            }
        }else if (profileChange.find()) {
            if (changePassword1.find() && changePassword2.find()) {
                String[] temp = input.split(" --current");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String currentPassword = temp[0];

                temp = input.split(" --new");
                temp = temp[1].split("<");
                temp = temp[1].split(">");
                String newPassword = temp[0];

                if (!user.getPassword().equals(currentPassword)) {
                    System.out.println("current password is invalid");
                }else if (currentPassword.equals(newPassword)) {
                    System.out.println("please enter a new password");
                }else {
                   if (!User.checkPasswordPattern(newPassword)) {
                       System.out.println("""
                               WEAK PASSWORD!
                               Your password must:
                               A) has at least 1 & at most 3 digits at first
                               B) has one capital letter exactly after A
                               C) has at least 5 & at most 10 a-z characters exactly after B""");
                   }else {
                       user.setPassword(newPassword);
                       System.out.println("password changed successfully!");
                   }
                }
            }
        }else if (input.equals("menu show-current")) {
            System.out.println("Profile Menu");
            ProfileMenu.getInstance(scanner, user).showProfileMenuMessage();
        }else if (input.equals("menu exit")) {
            MainMenu.getInstance(scanner, user).showMainMessage();
        }else {
            System.out.println("invalid command");
            ProfileMenu.getInstance(scanner, user).showProfileMenuMessage();
        }
    }
}
