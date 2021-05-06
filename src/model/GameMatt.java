package model;

import java.util.ArrayList;
import java.util.HashMap;

public class GameMatt extends Field{
    public int numberOfCardsInZone;
    public String cardState;
    public String horizentalOrVerticalPosition;
    public String gameZone;
    //method to show cards in the required zone
    public HashMap <String,String> cardsInfo=new HashMap<>();
    public String showCardInfo(String cardName,String cardDescription){
        cardsInfo.put(cardName,cardDescription);
        return cardsInfo.toString();
    }
    //arraylist to add all cards to each zone
    //should it be a method with a loop to add
    //cards to it ?
    // int numberOfCardsInZone =arraylist.size();
    //pubilc void addCardsToZone(){
    // for()
    //.add
    // }

    ArrayList<String> listCardName=new ArrayList<>();//arrayList of all cards
   //method to add cards to zone
    public void addCardsToZone(String cardName){
        for(int i=0;i<numberOfCardsInZone;i++){
            listCardName.add(cardName);
        }
    }
    //method to remove cards from the zone
    public void removeCardsFromZone(String cardName){
        for (int j=0;j<numberOfCardsInZone;j++){
            listCardName.remove(cardName);
        }

    }

    //method to add or remove one card   as many as you want

    public int getNumberOfCardsInZone() {
        return numberOfCardsInZone;
    }

    public void setNumberOfCardsInZone(int numberOfCardsInZone) {
        this.numberOfCardsInZone = numberOfCardsInZone;
    }

    public ArrayList<String> getListCardName() {
        return listCardName;
    }

    public void setCardsInfo(HashMap<String, String> cardsInfo) {
        this.cardsInfo = cardsInfo;
    }

    public HashMap<String, String> getCardsInfo() {
        return cardsInfo;
    }

    public void setListCardName(ArrayList<String> listCardName) {
        this.listCardName = listCardName;
    }

    public String getCardState() {
        return cardState;
    }

    public void setCardState(String cardState) {
        this.cardState = cardState;
    }


    public String getGameZone() {
        return gameZone;
    }

    public void setGameZone(String gameZone) {
        this.gameZone = gameZone;
    }

    public String getHorizentalOrVerticalPosition() {
        return horizentalOrVerticalPosition;
    }

    public void setHorizentalOrVerticalPosition(String horizentalOrVerticalPosition) {
        this.horizentalOrVerticalPosition = horizentalOrVerticalPosition;
    }
}

