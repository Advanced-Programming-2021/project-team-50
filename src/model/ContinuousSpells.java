package model;

public class ContinuousSpells extends SpellAndTraps{
    abstract public static class MessengerOfPeace extends SpellAndTraps {

        public static String getName() {
            return "MessengerOfPeace";
        }

        public void setName(String cardName) {
            super.setName("MessengerOfPeace");
        }

        public void setPrice() {
            super.setPrice(4000);
        }

        public static int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Continuous Spell";
        }

        public void setType(String cardType) {
            super.setType("Continuous Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("LDK2-ENY30");
        }

        public static String getDescription() {
            return "Monsters with 1500 or more ATK cannot declare an attack. Once per turn, during your Standby Phase, pay 100 LP or destroy this card.";
        }

        public void setDescription(String description) {
            super.setDescription("Monsters with 1500 or more ATK cannot declare an attack. Once per turn, during your Standby Phase, pay 100 LP or destroy this card.");
        }

        public void addSpellCard() {
            super.addSpellCard("MessengerOfPeace");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class SupplySquad extends SpellAndTraps {
        public static String getName() {
            return "SupplySquad";
        }

        public void setName(String cardName) {
            super.setName("SupplySquad");
        }

        public void setPrice() {
            super.setPrice(4000);
        }

        public static int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Continuous Spell";
        }

        public void setType(String cardType) {
            super.setType("Continuous Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS18-En032");
        }

        public static String getDescription() {
            return "Once per turn,if a monster(s) you control is destroyed by battle or card effect:Draw 1 card";
        }

        public void setDescription(String description) {
            super.setDescription("Once per turn,if a monster(s) you control is destroyed by battle or card effect:Draw 1 card");
        }

        public void addSpellCard() {
            super.addSpellCard("SupplySquad");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class SpellAbsorption extends SpellAndTraps {
        public static String getName() {
            return "SpellAbsorption";
        }

        public void setName(String cardName) {
            super.setName("SpellAbsorption");
        }

        public void setPrice() {
            super.setPrice(4000);
        }

        public static int getPrice() {
            return super.getPrice();
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Continuous Spell";
        }

        public void setType(String cardType) {
            super.setType("Continuous Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("DR3-159");
        }

        public static String getDescription() {
            return "Each time a Spell Card is activated, gain 500 LP immediately after it resolves.";
        }

        public void setDescription(String description) {
            super.setDescription("Each time a Spell Card is activated, gain 500 LP immediately after it resolves.");
        }

        public void addSpellCard() {
            super.addSpellCard("SpellAbsorption");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}



