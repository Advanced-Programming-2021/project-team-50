package model;

public class MonsterZone extends GameMatt{

    //is this right ? to change the number of cards is only 5
//how to set the number 5?
    int numberOfCardsInZone=5;

    @Override
    public void setNumberOfCardsInZone(int numberOfCardsInZone) {
        this.numberOfCardsInZone = numberOfCardsInZone;
    }

    @Override
    public int getNumberOfCardsInZone() {
        return super.getNumberOfCardsInZone();
    }


    //???
    String gameZone="MonsterZone";
    @Override
    public void setGameZone(String gameZone) {
        super.setGameZone(gameZone);
    }
  }


