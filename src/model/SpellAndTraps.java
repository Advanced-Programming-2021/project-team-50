
package model;

class SpellAndTraps extends Cards {
    public static String type;
    public String icon;
    public String spellCardName;

    //ArrayList

    public void setType(String cardType) {
        this.setName(cardType);
    }

    public static String getType() {
        return type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    //Spell
    public static void showSpellCardInfo() {
        System.out.println("Name: " + getName() + "\n" +
                "Spell" + "\n" +
                "Type: " + getType() + "\n" +
                "Description: ");
    }

    //Trap
    public static void showTrapCardInfo() {
        System.out.println("Name: " + getName() + "\n" +
                "Trap" + "\n" +
                "Type: " + getType() + "\n" +
                "Description: ");
    }
}