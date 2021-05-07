package model;

import java.util.ArrayList;

class Cards {

    private String name;
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

//    HashMap<String,String> allCardsNameAndDescription=new HashMap<>();


    ArrayList<String> allCardsName = new ArrayList<>();
    ArrayList<String> allCardsId = new ArrayList<>();
    ArrayList<String> listOfCards;

    public String getName() {
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
        return description;
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
