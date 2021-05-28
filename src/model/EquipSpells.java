package model;

public class EquipSpells extends SpellAndTraps{
    abstract public static class SwordOfDarkDestruction extends SpellAndTraps {

        public static String getName() {
            return "SwordOfDarkDestruction";
        }

        public void setName(String cardName) {
            super.setName("SwordOfDarkDestruction");
        }

        public void setPrice() {
            super.setPrice(4300);
        }

        public int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Equip Spell";
        }

        public void setType(String cardType) {
            super.setType("Equip Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDY-020");
        }

        public static String getDescription() {
            return "Equip only to a DARK monster. It gains 400 ATK and loses 200 DEF.";
        }

        public void setDescription(String description) {
            super.setDescription("Equip only to a DARK monster. It gains 400 ATK and loses 200 DEF.");
        }

        public void addSpellCard() {
            super.addSpellCard("SwordOfDarkDestruction");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class BlackPendant extends SpellAndTraps {

        public static String getName() {
            return "BlackPendant";
        }

        public void setName(String cardName) {
            super.setName("BlackPendant");
        }

        public void setPrice() {
            super.setPrice(4300);
        }

        public int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Equip Spell";
        }

        public void setType(String cardType) {
            super.setType("Equip Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS15-ENY15");
        }

        public static String getDescription() {
            return "The equipped monster gains 500 ATK. When this card is sent from the field to the Graveyard: Inflict 500 damage to your opponent.";
        }

        public void setDescription(String description) {
            super.setDescription("The equipped monster gains 500 ATK. When this card is sent from the field to the Graveyard: Inflict 500 damage to your opponent.");
        }

        public void addSpellCard() {
            super.addSpellCard("BlackPendant");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class UnitedWeStand extends SpellAndTraps {

        public static String getName() {
            return "UnitedWeStand";
        }

        public void setName(String cardName) {
            super.setName("UnitedWeStand");
        }

        public void setPrice() {
            super.setPrice(4300);
        }

        public int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Equip Spell";
        }

        public void setType(String cardType) {
            super.setType("Equip Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS18-EN028");
        }

        public static String getDescription() {
            return "The equipped monster gains 800 ATK/DEF for each face-up monster you control.";
        }

        public void setDescription(String description) {
            super.setDescription("The equipped monster gains 800 ATK/DEF for each face-up monster you control.");
        }

        public void addSpellCard() {
            super.addSpellCard("UnitedWeStand");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class MagnumShield extends SpellAndTraps {

        public static String getName() {
            return "MagnumShield";
        }

        public void setName(String cardName) {
            super.setName("MagnumShield");
        }

        public void setPrice() {
            super.setPrice(4300);
        }

        public int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Equip Spell";
        }

        public void setType(String cardType) {
            super.setType("Equip Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("MP14-EN035");
        }

        public static String getDescription() {
            return "Equip only to a Warrior-Type monster. Apply this effect, depending on its battle position.\n" +
                    "●Attack Position: It gains ATK equal to its original DEF.\n" +
                    "●Defense Position: It gains DEF equal to its original ATK.";
        }

        public void setDescription(String description) {
            super.setDescription("Equip only to a Warrior-Type monster. Apply this effect, depending on its battle position.\n" +
                    "●Attack Position: It gains ATK equal to its original DEF.\n" +
                    "●Defense Position: It gains DEF equal to its original ATK.");
        }

        public void addSpellCard() {
            super.addSpellCard("MagnumShield");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}
