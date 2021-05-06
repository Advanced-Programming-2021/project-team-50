package model;

public class AccessoryDeck extends Deck{

    //is this right ? to change the number of cards is only 5
//how to set the number 15?
    int 0<=numberOfCardsInZone<=15;

    @Override
    public void setNumberOfCardsInZone(int numberOfCardsInZone) {
        this.numberOfCardsInZone = numberOfCardsInZone;
    }

    @Override
    public int getNumberOfCardsInZone() {
        return super.getNumberOfCardsInZone();
    }


    //???
    String gameZone="AccessoryDeck";
    @Override
    public void setGameZone(String gameZone) {
        super.setGameZone(gameZone);
    }
}
