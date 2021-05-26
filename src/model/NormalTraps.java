package model;

public class NormalTraps extends SpellAndTraps{
    abstract public static class MagicCylinder extends SpellAndTraps {

        public static String getName() {
            return "MagicCylinder";
        }

        public void setName(String cardName) {
            super.setName("MagicCylinder");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDMY-EN038");
        }

        public static String getDescription() {
            return "When an opponent's monster declares an attack: Target the attacking monster; negate the attack, and if you do, inflict damage to your opponent equal to its ATK.";
        }

        public void setDescription(String description) {
            super.setDescription("When an opponent's monster declares an attack: Target the attacking monster; negate the attack, and if you do, inflict damage to your opponent equal to its ATK.");
        }

        public void addSpellCard() {
            super.addSpellCard("MagicCylinder");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class MirrorForce extends SpellAndTraps {

        public static String getName() {
            return "MirrorForce";
        }

        public void setName(String cardName) {
            super.setName("MirrorForce");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS18-EN036");
        }

        public static String getDescription() {
            return "When an opponent's monster declares an attack: Destroy all your opponent's Attack Position monsters.";
        }

        public void setDescription(String description) {
            super.setDescription("When an opponent's monster declares an attack: Destroy all your opponent's Attack Position monsters.");
        }

        public void addSpellCard() {
            super.addSpellCard("MirrorForce");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class MindCrush extends SpellAndTraps {

        public static String getName() {
            return "MindCrush";
        }

        public void setName(String cardName) {
            super.setName("MindCrush");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SR06-EN037");
        }

        public static String getDescription() {
            return "Declare 1 card name; if that card is in your opponent's hand, they must discard all copies of it, otherwise you discard 1 random card.";
        }

        public void setDescription(String description) {
            super.setDescription("Declare 1 card name; if that card is in your opponent's hand, they must discard all copies of it, otherwise you discard 1 random card.");
        }

        public void addSpellCard() {
            super.addSpellCard("MindCrush");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TrapHole extends SpellAndTraps {

        public static String getName() {
            return "TrapHole";
        }

        public void setName(String cardName) {
            super.setName("TrapHole");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS15-ENY17");
        }

        public static String getDescription() {
            return "When your opponent Normal or Flip Summons 1 monster with 1000 or more ATK: Target that monster; destroy that target.\n" +;
        }

        public void setDescription(String description) {
            super.setDescription("When your opponent Normal or Flip Summons 1 monster with 1000 or more ATK: Target that monster; destroy that target.\n" +);
        }

        public void addSpellCard() {
            super.addSpellCard("TrapHole");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TorrentialTribute extends SpellAndTraps {

        public static String getName() {
            return "TorrentialTribute";
        }

        public void setName(String cardName) {
            super.setName("TorrentialTribute");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS18-EN037");
        }

        public static String getDescription() {
            return "When a monster(s) is Summoned: Destroy all monsters on the field.";
        }

        public void setDescription(String description) {
            super.setDescription("When a monster(s) is Summoned: Destroy all monsters on the field.");
        }

        public void addSpellCard() {
            super.addSpellCard("TorrentialTribute");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TimeSeal extends SpellAndTraps {

        public static String getName() {
            return "TimeSeal";
        }

        public void setName(String cardName) {
            super.setName("TimeSeal");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("DB1-EN071");
        }

        public static String getDescription() {
            return "Skip the Draw Phase of your opponent's next turn.";
        }

        public void setDescription(String description) {
            super.setDescription("Skip the Draw Phase of your opponent's next turn.");
        }

        public void addSpellCard() {
            super.addSpellCard("TimeSeal");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class NegateAttack extends SpellAndTraps {

        public static String getName() {
            return "NegateAttack";
        }

        public void setName(String cardName) {
            super.setName("NegateAttack");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDKS-EN032");
        }

        public static String getDescription() {
            return "When an opponent's monster declares an attack: Target the attacking monster; negate the attack, then end the Battle Phase.";
        }

        public void setDescription(String description) {
            super.setDescription("When an opponent's monster declares an attack: Target the attacking monster; negate the attack, then end the Battle Phase.");
        }

        public void addSpellCard() {
            super.addSpellCard("NegateAttack");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class SolemnWarning extends SpellAndTraps {

        public static String getName() {
            return "SolemnWarning";
        }

        public void setName(String cardName) {
            super.setName("SolemnWarning");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("SDCH-EN036");
        }

        public static String getDescription() {
            return "When a monster(s) would be Summoned, OR when a Spell/Trap Card, or monster effect, is activated that includes an effect that Special Summons a monster(s): Pay 2000 LP; negate the Summon or activation, and if you do, destroy it.";
        }

        public void setDescription(String description) {
            super.setDescription("When a monster(s) would be Summoned, OR when a Spell/Trap Card, or monster effect, is activated that includes an effect that Special Summons a monster(s): Pay 2000 LP; negate the Summon or activation, and if you do, destroy it.");
        }

        public void addSpellCard() {
            super.addSpellCard("SolemnWarning");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class MagicJammer extends SpellAndTraps {

        public static String getName() {
            return "MagicJammer";
        }

        public void setName(String cardName) {
            super.setName("MagicJammer");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("YS14-EN039");
        }

        public static String getDescription() {
            return "When a Spell Card is activated: Discard 1 card; negate the activation, and if you do, destroy it.";
        }

        public void setDescription(String description) {
            super.setDescription("When a Spell Card is activated: Discard 1 card; negate the activation, and if you do, destroy it.");
        }

        public void addSpellCard() {
            super.addSpellCard("MagicJammer");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class CallOfTheHaunted extends SpellAndTraps {

        public static String getName() {
            return "CallOfTheHaunted";
        }

        public void setName(String cardName) {
            super.setName("CallOfTheHaunted");
        }

        public String getIcon() {
            return super.getIcon();
        }

        public void setIcon(String icon) {
            super.setIcon("Trap");
        }

        public static String getType() {
            return "Normal Trap";
        }

        public void setType(String cardType) {
            super.setType("Normal Trap");
        }

        public String getId() {
            return super.getId();
        }

        public void setId(String id) {
            super.setId("LART-EN009");
        }

        public static String getDescription() {
            return "Activate this card by targeting 1 monster in your GY; Special Summon that target in Attack Position. When this card leaves the field, destroy that monster. When that monster is destroyed, destroy this card.";
        }

        public void setDescription(String description) {
            super.setDescription("Activate this card by targeting 1 monster in your GY; Special Summon that target in Attack Position. When this card leaves the field, destroy that monster. When that monster is destroyed, destroy this card.");
        }

        public void addSpellCard() {
            super.addSpellCard("CallOfTheHaunted");
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Trap" +"\n" +
                    "Type: " + getType() + "\n" +
                    "Description: " + getDescription());
        }
    }
}
