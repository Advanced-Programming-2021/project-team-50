package view.menu;

import controller.User;
import model.MonsterCard;
import model.SpellAndTrapCard;
import view.MainMenu;
import view.ViewCards;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShopMenu {
    private ShopMenu(Scanner scanner, User user) {
        this.scanner = scanner;
        this.user = user;
    }

    private static ShopMenu instance;
    private Scanner scanner;
    private User user;

    public static ShopMenu getInstance(Scanner scanner, User user) {
        if (instance == null) {
            instance = new ShopMenu(scanner, user);
        }
        instance.scanner = scanner;
        instance.user = user;
        return instance;
    }

    public void showShopMenuMessage() {
        System.out.println("Shop Menu:");
        System.out.println("Enter your command");
        String input = scanner.nextLine();

        Pattern showCardInfoPattern = Pattern.compile("card show");
        Matcher showCardInfo = showCardInfoPattern.matcher(input);

        Pattern buyCardPattern = Pattern.compile("shop buy");
        Matcher buyCardMatcher = buyCardPattern.matcher(input);

        if (input.equals("menu show-current")) {
            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
        } else if (input.equals("menu exit")) {
            MainMenu.getInstance(scanner, user).showMainMessage();
        } else if (showCardInfo.find()) {
            ViewCards.showCardInfo(input);
            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
        }else if (buyCardMatcher.find()) {
            String[] temp = input.split("buy");
            temp = temp[1].split("<");
            temp = temp[1].split(">");
            String cardName = temp[0];
            if (MonsterCard.allCards.contains(cardName)) {
                for (MonsterCard card : MonsterCard.allCards) {
                    if (card.getName().equals(cardName)) {
                        if (card.getPrice() > user.getMoney()) {
                            System.out.println("not enough money");
                            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
                        }else {
                            System.out.println("buy successfully!");
                            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
                        }
                    }
                }
            }else if (SpellAndTrapCard.allCards.contains(cardName)){
                for (SpellAndTrapCard card : SpellAndTrapCard.allCards) {
                    if (card.getName().equals(cardName)) {
                        if (card.getPrice() > user.getMoney()) {
                            System.out.println("not enough money");
                            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
                        }else {
                            System.out.println("buy successfully!");
                            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
                        }
                    }
                }
            }else {
                System.out.println("there is no card with this name");
                ShopMenu.getInstance(scanner, user).showShopMenuMessage();
            }
        }else {
            System.out.println("invalid command");
            ShopMenu.getInstance(scanner, user).showShopMenuMessage();
        }

    }
}
