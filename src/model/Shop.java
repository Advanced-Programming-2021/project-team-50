package model;
//buy cards

//is it related to user?


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Shop {
    public String userName;
    public int money;
    public int cardsCost;

    //list of all cards
    //have it to buy
    //list of all cards of the user that he has ,has bought
    //methods to increase money or decrease it

    ArrayList<String> listOfCards = new ArrayList<>();
    int numberOfAllCards=listOfCards.size();

    public String sddACardToYourCards(String name,int cardsCost) {

        if (cardsCost > money) {
            return "not enough money";
        }
        else {
            listOfCards.add(name);
            money =money-cardsCost;
            return listOfCards.toString();
        }
    }
    public String removeACardFromYourCards(String name,int cardsCost) {
        listOfCards.remove(name);
        money=money+cardsCost;
        return listOfCards.toString();
    }



//????????????????????????
    HashMap<String, String> allCardsNameAndDescription = new HashMap<>();

    int n = allCardsNameAndDescription.size();
    Cards cards=new Cards();

    // write a loop to go through all cards ,or call a hashmap from cards class?
    String name=cards.getName();
    String description =cards.getDescription();
    public String methodToShowAllCardsNameAndDescription(String name,String description){
        allCardsNameAndDescription.put(name,description);
        return allCardsNameAndDescription.toString();
    }
}
