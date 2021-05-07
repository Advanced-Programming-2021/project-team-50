package model;

public class FieldZone extends GameMatt {
    public String fieldName;


    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    //is this right ? to change the number of cards is only 1
//how to set the number 1?
    int numberOfCardsInZone = 1;

    @Override
    public void setNumberOfCardsInZone(int numberOfCardsInZone) {
        this.numberOfCardsInZone = numberOfCardsInZone;
    }

    @Override
    public int getNumberOfCardsInZone() {
        return super.getNumberOfCardsInZone();
    }


    //???
    String gameZone = "fieldZone";

    @Override
    public void setGameZone(String gameZone) {
        super.setGameZone(gameZone);
    }
//if for the first time  ?????

    public void addCardsToZone(String cardNameToAdd, String cardNameToRemove) {
        listCardName.remove(cardNameToRemove);
        listCardName.add(cardNameToAdd);
    }

}
