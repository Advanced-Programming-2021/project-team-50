package model;

public class NormalSpells extends SpellAndTraps {
    abstract public static class MonsterReborn extends SpellAndTraps {

        public static String getName() {
            return "MonsterReborn";
        }

        public void setName(String cardName) {
            super.setName("MonsterReborn");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("LED7-EN012");
        }

        public static String getDescription() {
            return "Target 1 monster in either GY;Special Summon it.";
        }

        public void setDescription(String description) {
            super.setDescription("Target 1 monster in either GY;Special Summon it.");
        }

        public void addSpellCard() {
            super.addSpellCard("MonsterReborn");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TerraForming extends SpellAndTraps {

        public static String getName() {
            return "TerraForming";
        }

        public void setName(String cardName) {
            super.setName("TerraForming");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDCH-EN024");
        }

        public static String getDescription() {
            return "Add 1 Field Spell from you Deck to your hand";
        }

        public void setDescription(String description) {
            super.setDescription("Add 1 Field Spell from you Deck to your hand");
        }

        public void addSpellCard() {
            super.addSpellCard("TerraForming");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class PotOfGreed extends SpellAndTraps {

        public static String getName() {
            return "PotOfGreed";
        }

        public void setName(String cardName) {
            super.setName("PotOfGreed");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YGLD-ENB26");
        }

        public static String getDescription() {
            return "Draw 2 cards";
        }

        public void setDescription(String description) {
            super.setDescription("Draw 2 cards");
        }

        public void addSpellCard() {
            super.addSpellCard("PotOfGreed");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class Raigeki extends SpellAndTraps {
        public static String getName() {
            return "Raigeki";
        }

        public void setName(String cardName) {
            super.setName("Raigeki");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDCH-EN021");
        }

        public static String getDescription() {
            return "Destroy all monsters your apponent controls.";
        }

        public void setDescription(String description) {
            super.setDescription("Destroy all monsters your apponent controls.");
        }

        public void addSpellCard() {
            super.addSpellCard("Raigeki");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class ChangeOfHeart extends SpellAndTraps {

        public static String getName() {
            return "ChangeOfHeart";
        }

        public void setName(String cardName) {
            super.setName("ChangeOfHeart");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("LCYW-EN124");
        }

        public static String getDescription() {
            return "Target 1 monster your opponent controls; take control of it until the End Phase";
        }

        public void setDescription(String description) {
            super.setDescription("Target 1 monster your opponent controls; take control of it until the End Phase");
        }

        public void addSpellCard() {
            super.addSpellCard("ChangeOfHeart");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class HarpiesFeatherDuster extends SpellAndTraps {

        public static String getName() {
            return "HarpiesFeatherDuster";
        }

        public void setName(String cardName) {
            super.setName("Harpie'sFeatherDuster");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("MAGO-EN042");
        }

        public static String getDescription() {
            return "Destroy all spells and Traps your opponent controls.";
        }

        public void setDescription(String description) {
            super.setDescription("Destroy all spells and Traps your opponent controls.");
        }

        public void addSpellCard() {
            super.addSpellCard("HarpiesFeatherDuster");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class SwordOfRevealingLight extends SpellAndTraps {
        public static String getName() {
            return "SwordOfRevealingLight";
        }

        public void setName(String cardName) {
            super.setName("SwordOfRevealingLight");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("LEDD-ENA25");
        }

        public static String getDescription() {
            return "After this card's activation, it remains on the field ,but destroy it during the End Phase of your opponet's 3rd turn .When this card is activated : If your apponent controls a face-down monster, flip all monsters they control face-up.While this card is face-up on the field, you opponent's monsters cannot declare attack. ";
        }

        public void setDescription(String description) {
            super.setDescription("After this card's activation, it remains on the field ,but destroy it during the End Phase of your opponet's 3rd turn .When this card is activated : If your apponent controls a face-down monster, flip all monsters they control face-up.While this card is face-up on the field, you opponent's monsters cannot declare attack. ");
        }

        public void addSpellCard() {
            super.addSpellCard("SwordOfRevealingLight");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class DarkHole extends SpellAndTraps {

        public static String getName() {
            return "DarkHole";
        }

        public void setName(String cardName) {
            super.setName("DarkHole");
        }

        public void setPrice() {
            super.setPrice(2500);
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
            return "Normal Spell";
        }

        public void setType(String cardType) {
            super.setType("Normal Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("OPE2-ENO22");
        }

        public static String getDescription() {
            return "Destroy all monsters on the field.";
        }

        public void setDescription(String description) {
            super.setDescription("Destroy all monsters on the field.");
        }

        public void addSpellCard() {
            super.addSpellCard("DarkHole");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" + "\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}