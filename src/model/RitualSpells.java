package model;

public class RitualSpells extends SpellAndTraps{
    abstract public static class AdvancedRitualArt extends SpellAndTraps {

        public static String getName() {
            return "AdvancedRitualArt";
        }

        public void setName(String cardName) {
            super.setName("AdvancedRitualArt");
        }

        public void setPrice() {
            super.setPrice(3000);
        }

        public static int getPrice() {
            return 3000;
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Spell");
        }

        public static String getType() {
            return "Ritual Spell";
        }

        public void setType(String cardType) {
            super.setType("Ritual Spell");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("DUSA-EN063");
        }

        public static String getDescription() {
            return "This card is used to Ritual Summon any 1 Ritual Monster. You must also send Normal Monsters from your Deck to the GY whose total Levels equal the Level of that Ritual Monster.";
        }

        public void setDescription(String description) {
            super.setDescription("This card is used to Ritual Summon any 1 Ritual Monster. You must also send Normal Monsters from your Deck to the GY whose total Levels equal the Level of that Ritual Monster.");
        }

        public void addSpellCard() {
            super.addSpellCard("AdvancedRitualArt");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Spell" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}
