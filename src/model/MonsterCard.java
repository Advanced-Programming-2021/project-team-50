package model;

import java.util.ArrayList;

public class MonsterCard {
    public static final ArrayList<MonsterCard> allCards;

    static {
        allCards = new ArrayList<>();
    }

    private String name;
    private int level ;
    private String monsterType;
    private String cardType;
    private int price;
    private int attackScore;
    private int defenceScore;
    private String id;
    private String description;
    private String attribute;

    public MonsterCard(String name, int level,String attribute,String monsterType,
                String cardType, int attackScore,
                int defenceScore,String description,int price, String id) {
        this.name = name;
        this.level = level;
        this.monsterType = monsterType;
        this.cardType = cardType;
        this.price = price;
        this.attackScore = attackScore;
        this.defenceScore = defenceScore;
        this.id = id;
        this.description = description;
        this.attribute = attribute;

        allCards.add(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public void setDefenceScore(int defenceScore) {
        this.defenceScore = defenceScore;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public String getCardType() {
        return cardType;
    }

    public String getAttribute() {
        return attribute;
    }

    public int getPrice() {
        return price;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public int getDefenceScore() {
        return defenceScore;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
