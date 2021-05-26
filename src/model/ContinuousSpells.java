package model;

public class ContinuousSpells extends SpellAndTraps{
    abstract public static class MessengerOfPeace extends SpellAndTraps {

        public static String getName() {
            return "MessengerOfPeace";
        }

        public void setName(String cardName) {
            super.setName("MessengerOfPeace");
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
}
