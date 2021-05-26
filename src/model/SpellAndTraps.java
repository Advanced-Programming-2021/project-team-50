
package model;

class SpellAndTraps extends Cards{
    public String type  ;
    public String icon;
    public String spellCardName;

    //ArrayList

  public void setType(String cardType) { this.setName(cardType); }
    public static String getType() {
        return type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


}

//Spell
    public static void showCardInfo() {
        System.out.println("Name: " + getName() + "\n" +
                "Spell" +"\n" +
                "Type: " + getType() + "\n" +
                "Description: " + getDescription());
    }

    //Trap
    public static void showCardInfo() {
        System.out.println("Name: " + getName() + "\n" +
                "Trap" + "\n" +
                "Type: " + getType() + "\n" +
                "Description: " + getDescription());
    }