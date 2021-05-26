package model;

import java.util.ArrayList;

public class Cards {

    public static String name;
    private String id;
    private String description;
    private String state;
    //state could also be boolean

    public String cardState(String state) {
        if (state.equals("faceUp")) {
            return "faceUp";
        } else {
            return "faceDown";
        }
    }

    public void addCardName() {
        allCardsName.add(getName());
    }

    public void addCardId() {
        allCardsId.add(getId());
    }

    public void addSpellCard(String spellName) {
        allSpellCardsName.add(spellName);
    }

    public void addTrapCard(String trapName) {
        allTrapCardsName.add(trapName);
    }

    public void addMonsterCard() {
        allMonsterCardsName.add(getName());
    }

//    HashMap<String,String> allCardsNameAndDescription=new HashMap<>();


    public ArrayList<String> allCardsName = new ArrayList<>();
    public ArrayList<String> allCardsId;
    public ArrayList<String> allSpellCardsName;
    public ArrayList<String> allTrapCardsName;
    public ArrayList<String> allMonsterCardsName;
    public ArrayList<String> listOfCards;

    public static String getName() {
        return name;
    }

    public void setName(String cardName) {
        this.name = cardName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<String> getAllCardsName() {
        return allCardsName;
    }

    public void setAllCardsName(ArrayList<String> allCardsName) {
        this.allCardsName = allCardsName;
    }


}
