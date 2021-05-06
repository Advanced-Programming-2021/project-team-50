
package model;

class SpellAndTraps extends Cards{
    public String type  ;
    public String icon;
    public String spellCardName;

    //ArrayList

  public void setType(String cardType) { this.setName(cardType); }
    public String getType() {
        return type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


}