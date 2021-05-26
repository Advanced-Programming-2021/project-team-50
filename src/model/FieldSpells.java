package model;

public class FieldSpells extends SpellAndTraps{
    abstract public static class Umiiruka extends SpellAndTraps {

        public static String getName() {
            return "Umiruka";
        }

        public void setName(String cardName) {
            super.setName("Umiruka");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Field Spell";
        }

        public void setType(String cardType) {
            super.setType("Field Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SRL-EN097");
        }

        public static String getDescription() {
            return "Increase the ATK of all WATER monsters by 500 points and decrease their DEF by 400 points.";
        }

        public void setDescription(String description) {
            super.setDescription("Increase the ATK of all WATER monsters by 500 points and decrease their DEF by 400 points.");
        }

        public void addSpellCard() {
            super.addSpellCard("Umiruka");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class ClosedForest extends SpellAndTraps {

        public static String getName() {
            return "ClosedForest";
        }

        public void setName(String cardName) {
            super.setName("ClosedForest");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Field Spell";
        }

        public void setType(String cardType) {
            super.setType("Field Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("BP03-EN171");
        }

        public static String getDescription() {
            return "All Beast-Type monsters you control gain 100 ATK for each monster in your Graveyard. Field Spell Cards cannot be activated. Field Spell Cards cannot be activated during the turn this card is destroyed.";
        }

        public void setDescription(String description) {
            super.setDescription("All Beast-Type monsters you control gain 100 ATK for each monster in your Graveyard. Field Spell Cards cannot be activated. Field Spell Cards cannot be activated during the turn this card is destroyed.");
        }

        public void addSpellCard() {
            super.addSpellCard("ClosedForest");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class Forest extends SpellAndTraps {

        public static String getName() {
            return "Forest";
        }

        public void setName(String cardName) {
            super.setName("Forest");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Field Spell";
        }

        public void setType(String cardType) {
            super.setType("Field Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SS03-ENB17");
        }

        public static String getDescription() {
            return "All Insect, Beast, Plant, and Beast-Warrior monsters on the field gain 200 ATK/DEF.";
        }

        public void setDescription(String description) {
            super.setDescription("All Insect, Beast, Plant, and Beast-Warrior monsters on the field gain 200 ATK/DEF.");
        }

        public void addSpellCard() {
            super.addSpellCard("Forest");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class Yami extends SpellAndTraps {

        public static String getName() {
            return "Yami";
        }

        public void setName(String cardName) {
            super.setName("Yami");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Field Spell";
        }

        public void setType(String cardType) {
            super.setType("Field Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SS01-ENC13");
        }

        public static String getDescription() {
            return "All Fiend and Spellcaster monsters on the field gain 200 ATK/DEF, also all Fairy monsters on the field lose 200 ATK/DEF.";
        }

        public void setDescription(String description) {
            super.setDescription("All Fiend and Spellcaster monsters on the field gain 200 ATK/DEF, also all Fairy monsters on the field lose 200 ATK/DEF.");
        }

        public void addSpellCard() {
            super.addSpellCard("Yami");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}
