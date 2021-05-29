package view;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ViewCards {

    private ViewCards(Scanner scanner) {
        this.scanner = scanner;
    }

    private static ViewCards instance;
    private Scanner scanner;

    public static ViewCards getInstance(Scanner scanner) {
        if (instance == null) {
            instance = new ViewCards(scanner);
        }
        instance.scanner = scanner;
        return instance;
    }

    public static void showCardInfo(String input) {
        String[] line2 = input.split(" ");
        line2 = line2[2].split("<");
        line2 = line2[1].split(">");
        String name = line2[0];
        showCard(name);
    }

    public static void showCard(String name) {
        if (SpellAndTrapCard.allCards.contains(name)) {
            for (SpellAndTrapCard card : SpellAndTrapCard.allCards) {
                if (card.getName().equals(name)) {
                    if (card.getType().equals("Spell")) {
                        System.out.println("Name: " + card.getName() + "\n" +
                                "Spell" + "\n" +
                                "Type: " + card.getType() + "\n" +
                                "Description: " + card.getDescription());
                    }else {
                        System.out.println("Name: " + card.getName() + "\n" +
                                "Trap" + "\n" +
                                "Type: " + card.getType() + "\n" +
                                "Description: " + card.getDescription());
                    }
                }
            }
        }else if (MonsterCard.allCards.contains(name)) {
            for (MonsterCard card : MonsterCard.allCards) {
                if (card.getName().equals(name)) {
                    System.out.println("Name: " + card.getName() + "\n" +
                            "Level: " + card.getLevel() + "\n" +
                            "Type: " + card.getCardType() + "\n" +
                            "ATK: " + card.getAttackScore() + "\n" +
                            "DEF: " + card.getDescription() + "\n" +
                            "Description: " + card.getDescription());
                }
            }
        }else {
            System.out.println("there is no card with this name");
        }
    }

    public ArrayList<String> ListOfCardsInfo = new ArrayList<>();
    public HashMap<String, String> card = new HashMap<>();

}