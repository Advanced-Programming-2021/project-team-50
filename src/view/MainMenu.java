package view;

import controller.User;
import model.Shop;
import view.menu.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMenu {

    private User user;

    // make class singleton
    private MainMenu(Scanner scanner, User user) {
        this.scanner = scanner;
        this.user = user;
    }

    private static MainMenu instance;
    private Scanner scanner;
    //private User user;

    public static MainMenu getInstance(Scanner scanner, User user) {
        if (instance == null) {
            instance = new MainMenu(scanner, user);
        }
        instance.scanner = scanner;
        instance.user = user;
        return instance;
    }


    public void showMainMessage() {
        System.out.println("Main Menu:");
        System.out.println("Your username: " + user.getUsername());
        System.out.println("Your full name: " + user.getNickname());

        System.out.println("You can use numbers or enter valid command :)");
        System.out.println("1- Duel");
        System.out.println("2- Deck");
        System.out.println("3- Scoreboard");
        System.out.println("4- Profile");
        System.out.println("5- Shop");
        System.out.println("6- User Logout");
        System.out.println("0- Back");

        String input = scanner.nextLine();
        Pattern enterMenuPattern = Pattern.compile("menu inter");
        Matcher enterMenu = enterMenuPattern.matcher(input);

        Pattern enterDuelPattern = Pattern.compile("<Duel>");
        Matcher enterDuel = enterDuelPattern.matcher(input);

        Pattern enterDeckPattern = Pattern.compile("<Deck>");
        Matcher enterDeck = enterDeckPattern.matcher(input);

        Pattern enterScoreboardPattern = Pattern.compile("<Scoreboard>");
        Matcher enterScoreboard = enterScoreboardPattern.matcher(input);

        Pattern enterProfilePattern = Pattern.compile("<Profile>");
        Matcher enterProfile = enterProfilePattern.matcher(input);

        Pattern enterShopPattern = Pattern.compile("<Shop>");
        Matcher enterShop = enterShopPattern.matcher(input);

        if (input.equals("1") || (enterDuel.find() && enterMenu.find())) {
            DuelMenu.getInstance(scanner, user).showDuelMenuMessage();
        } else if (input.equals("2") || (enterDeck.find() && enterMenu.find())) {
            DeckMenu.getInstance(scanner, user).showDeckMenuMessage();
        } else if (input.equals("3") || (enterScoreboard.find() && enterMenu.find())) {
            ScoreboardMenu.getInstance(scanner, user).showScoreboardMenuMessage();
        }else if (input.equals("4") || (enterProfile.find() && enterMenu.find())) {
            ProfileMenu.getInstance(scanner, user).showProfileMenuMessage();
        }else if (input.equals("5") || (enterShop.find() && enterMenu.find())) {
            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
        } else if (input.equals("0") || input.equals("menu exit")) {
            LoginMenu.getInstance(scanner).showLoginMessage();
        }else if (input.equals("menu show-current")) {
            System.out.println("Main Menu");
        }else if (input.equals("6") || input.equals("user logout")) {
            System.out.println("user logged out successfully!");
            WelcomeMenu.getInstance(scanner).showWelcomeMessage();
        } else {
            System.out.println("invalid command\n");
            MainMenu.getInstance(scanner, user).showMainMessage();
        }
    }
}