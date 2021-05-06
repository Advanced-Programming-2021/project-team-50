package Model;

import java.util.ArrayList;

public class Cards {
    private String name;
    private String id;
    public String description;
    public ArrayList<String> listOfCards = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public ArrayList<String> getListOfCards() {
        return listOfCards;
    }
}