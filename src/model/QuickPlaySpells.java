package model;

public class QuickPlaySpells extends SpellAndTraps{
    abstract public static class TwinTwisters extends SpellAndTraps {

        public static String getName() {
            return "TwinTwisters";
        }

        public void setName(String cardName) {
            super.setName("TwinTwisters");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Quick Play Spell";
        }

        public void setType(String cardType) {
            super.setType("Quick Play Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDSH-EN032");
        }

        public static String getDescription() {
            return "Discard 1 card, then target up to 2 Spells/Traps on the field; destroy them.";
        }

        public void setDescription(String description) {
            super.setDescription("Discard 1 card, then target up to 2 Spells/Traps on the field; destroy them.");
        }

        public void addSpellCard() {
            super.addSpellCard("TwinTwisters");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class MysticalSpaceTyphoon extends SpellAndTraps {

        public static String getName() {
            return "MysticalSpaceTyphoon";
        }

        public void setName(String cardName) {
            super.setName("MysticalSpaceTyphoon");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Quick Play Spell";
        }

        public void setType(String cardType) {
            super.setType("Quick Play Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDSA-EN033");
        }

        public static String getDescription() {
            return "Target 1 Spell/Trap on the field; destroy that target.";
        }

        public void setDescription(String description) {
            super.setDescription("Target 1 Spell/Trap on the field; destroy that target.");
        }

        public void addSpellCard() {
            super.addSpellCard("MysticalSpaceTyphoon");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class RingOfDefence extends SpellAndTraps {

        public static String getName() {
            return "RingOfDefence";
        }

        public void setName(String cardName) {
            super.setName("RingOfDefence");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Quick Play Spell";
        }

        public void setType(String cardType) {
            super.setType("Quick Play Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("LCKC-EN033");
        }

        public static String getDescription() {
            return "When a Trap effect that inflicts damage is activated: Make that effect damage 0.";
        }

        public void setDescription(String description) {
            super.setDescription("When a Trap effect that inflicts damage is activated: Make that effect damage 0.");
        }

        public void addSpellCard() {
            super.addSpellCard("RingOfDefence");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}
