package model;

import java.lang.invoke.StringConcatException;
import java.util.ArrayList;


public class SpellAndTrapCard {
    public static final ArrayList<SpellAndTrapCard> allCards;

    static {
        allCards = new ArrayList<>();
    }

    private String name;
    private String type;
    private String icon;
    private String description;
    private String status;
    private int price;

    public SpellAndTrapCard(String name, String type, String icon,
                            String description,
                            String status, int price) {
        this.name = name;
        this.type = type;
        this.icon = icon;
        this.description = description;
        this.status = status;
        this.price = price;

        allCards.add(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }
}