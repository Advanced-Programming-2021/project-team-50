package view.menu;

import com.sun.tools.javac.Main;
import controller.User;
import view.MainMenu;
import view.WelcomeMenu;

import java.util.Arrays;
import java.util.Scanner;

import static controller.User.allUsers;


public class ScoreboardMenu {
    private ScoreboardMenu(Scanner scanner, User user) {
        this.scanner = scanner;
        this.user = user;
    }

    private static ScoreboardMenu instance;
    private Scanner scanner;
    private User user;

    public static ScoreboardMenu getInstance(Scanner scanner, User user) {
        if (instance == null) {
            instance = new ScoreboardMenu(scanner, user);
        }
        instance.scanner = scanner;
        instance.user = user;
        return instance;
    }

    public void showScoreboardMenuMessage() {
        System.out.println("Scoreboard Menu:");
        System.out.println("Enter your command");
        scanner.nextLine();
        String input = scanner.nextLine();

        if (input.equals("menu show-current")) {
            ScoreboardMenu.getInstance(scanner, user).showScoreboardMenuMessage();
        } else if (input.equals("menu exit")) {
            MainMenu.getInstance(scanner, user).showMainMessage();
        } else if (input.equals("scoreboard show")) {
            int i = 0;
            int[] rank = new int[100];
            for (User user : allUsers) {
                rank[i] = user.getScore();
                i++;
            }
            Arrays.sort(rank);

            int number = 1;
            for (int j = i-1; j >= 0; j--) {
                for (User user : allUsers) {
                    if (user.getScore() == rank[i]) {
                        System.out.println(number + "- " + user.getNickname() +
                                ": " + user.getScore());
                        number++;
                    }
                }
            }
            ScoreboardMenu.getInstance(scanner, user).showScoreboardMenuMessage();
        } else {
            System.out.println("invalid command");
            ScoreboardMenu.getInstance(scanner, user).showScoreboardMenuMessage();
        }
    }
}
