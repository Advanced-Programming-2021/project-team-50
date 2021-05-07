package model;

public class MainDeck extends Deck{

    //is this right ? to change the number of cards is only 5
//how to set the number 40 to 60??
    int numberOfCardsInZone;


    @Override
    public void setNumberOfCardsInZone(int numberOfCardsInZone) {
        this.numberOfCardsInZone = numberOfCardsInZone;
    }

    @Override
    public int getNumberOfCardsInZone() {
        return super.getNumberOfCardsInZone();
    }


    //???
    String gameZone="MainDeck";
    @Override
    public void setGameZone(String gameZone) {
        super.setGameZone(gameZone);
    }


}
