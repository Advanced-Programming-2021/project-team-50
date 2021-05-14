package model;

public class EffectiveMonsters extends Monsters {

    abstract public static class CommandKnight extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("CommandKnight");
        }

        public void setAttackScore() {
            this.attackScore = 1000;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public void setLevel() {
            this.level = 4;
        }

        public void setType() {
            this.type = "Warrior";
        }

        public void setId(String id) {
            super.setId("LDK2-ENJ20");
        }

        public void setDescription(String description) {
            super.setDescription("All Warrior monsters you control gain 400 ATK. If you control another monster, monsters your opponent controls cannot target this card for attacks.");
        }

        public static int getAttackScore() {
            return 1000;
        }

        public static int getDefenceScore() {
            return 1000;
        }

        public static int getLevel() {
            return 4;
        }

        public String getId() {
            return super.getId();
        }

        public static String getName() {
            return "CommandKnight";
        }

        public static String getType() {
            return "Warrior";
        }

        public static String getDescription() {
            return "All Warrior monsters you control gain 400 ATK. If you control another monster, monsters your opponent controls cannot target this card for attacks.";
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class YomiShip extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("YomiShip");
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        public void setAttackScore() {
            this.attackScore = 800;
        }

        public void setLevel() {
            this.level = 3;
        }

        public void setType() {
            this.type = "Aqua";
        }

        public void setId(String id) {
            super.setId("SBAD-EN024");
        }

        public void setDescription(String description) {
            super.setDescription("If this card is destroyed by battle and sent to the GY: Destroy the monster that destroyed this card.");
        }

        public static String getName() {
            return "YomiShip";
        }

        public static String getType() {
            return "Aqua";
        }

        public static String getDescription() {
            return "If this card is destroyed by battle and sent to the GY: Destroy the monster that destroyed this card.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 3;
        }

        public static int getDefenceScore() {
            return 1400;
        }

        public static int getAttackScore() {
            return 800;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class Suijin extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("Suijin");
        }

        public void setAttackScore() {
            this.attackScore = 2500;
        }

        public void setDefenceScore() {
            this.defenceScore = 2400;
        }

        public void setId(String id) {
            super.setId("LCJW-EN226");
        }

        public void setType() {
            this.type = "Aqua";
        }

        public void setLevel() {
            this.level = 7;
        }

        public void setDescription(String description) {
            super.setDescription("During damage calculation in your opponent's turn, if this card is being attacked: You can target the attacking monster; make that target's ATK 0 during damage calculation only (this is a Quick Effect). This effect can only be used once while this card is face-up on the field.");
        }

        public static int getAttackScore() {
            return 2500;
        }

        public static int getDefenceScore() {
            return 2400;
        }

        public static int getLevel() {
            return 7;
        }

        public String getId() {
            return super.getId();
        }

        public static String getDescription() {
            return "During damage calculation in your opponent's turn, if this card is being attacked: You can target the attacking monster; make that target's ATK 0 during damage calculation only (this is a Quick Effect). This effect can only be used once while this card is face-up on the field.";
        }

        public static String getType() {
            return "Aqua";
        }

        public static String getName() {
            return "Suijin";
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class ManEaterBug extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("ManEaterBug");
        }

        public void setLevel() {
            this.level = 2;
        }

        public void setType() {
            this.type = "Insect";
        }

        public void setDefenceScore() {
            this.defenceScore = 600;
        }

        public void setAttackScore() {
            this.attackScore = 450;
        }

        public void setId(String id) {
            super.setId("DLGI-EN015");
        }

        public void setDescription(String description) {
            super.setDescription("FLIP: Target 1 monster on the field; destroy it.");
        }

        public static String getName() {
            return "ManEaterBug";
        }

        public static String getType() {
            return "Insect";
        }

        public static String getDescription() {
            return "FLIP: Target 1 monster on the field; destroy it.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 2;
        }

        public static int getDefenceScore() {
            return 600;
        }

        public static int getAttackScore() {
            return 450;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class GateGuardian extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("GateGuardian");
        }

        public void setAttackScore() {
            this.attackScore = 3750;
        }

        public void setDefenceScore() {
            this.defenceScore = 3400;
        }

        public void setLevel() {
            this.level = 11;
        }

        public void setType() {
            this.type = "Warrior";
        }

        public void setId(String id) {
            super.setId("LCJW-EN223");
        }

        public void setDescription(String description) {
            super.setDescription("Cannot be Normal Summoned/Set. Must first be Special Summoned (from your hand) by Tributing 1 \"Sanga of the Thunder\", \"Kazejin\", and \"Suijin\".");
        }

        public static String getType() {
            return "Warrior";
        }

        public String getId() {
            return super.getId();
        }

        public static int getDefenceScore() {
            return 3400;
        }

        public static int getAttackScore() {
            return 3750;
        }

        public static int getLevel() {
            return 11;
        }

        public static String getName() {
            return "GateGuardian";
        }

        public static String getDescription() {
            return "Cannot be Normal Summoned/Set. Must first be Special Summoned (from your hand) by Tributing 1 \"Sanga of the Thunder\", \"Kazejin\", and \"Suijin\".";
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class Scanner extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("Scanner");
        }

        public void setLevel() {
            this.level = 1;
        }

        public void setType() {
            this.type = "Machine";
        }

        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        public void setAttackScore() {
            this.attackScore = 0;
        }

        public void setId(String id) {
            super.setId("CRMS-EN032");
        }

        public void setDescription(String description) {
            super.setDescription("Once per turn, you can select 1 of your opponent's monsters that is removed from play. Until the End Phase, this card's name is treated as the selected monster's name, and this card has the same Attribute, Level, ATK, and DEF as the selected monster. If this card is removed from the field while this effect is applied, remove it from play.");
        }

        public static String getName() {
            return "Scanner";
        }

        public static String getType() {
            return "Machine";
        }

        public static String getDescription() {
            return "Once per turn, you can select 1 of your opponent's monsters that is removed from play. Until the End Phase, this card's name is treated as the selected monster's name, and this card has the same Attribute, Level, ATK, and DEF as the selected monster. If this card is removed from the field while this effect is applied, remove it from play.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 1;
        }

        public static int getDefenceScore() {
            return 0;
        }

        public static int getAttackScore() {
            return 0;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class Marshmallon extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("Marshmallon");
        }

        public void setLevel() {
            this.level = 3;
        }

        public void setType() {
            this.type = "Fairy";
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public void setAttackScore() {
            this.attackScore = 300;
        }

        public void setId(String id) {
            super.setId("");
        }

        public void setDescription(String description) {
            super.setDescription("Cannot be destroyed by battle. After damage calculation, if this card was attacked, and was face-down at the start of the Damage Step: The attacking player takes 1000 damage.");
        }

        public static String getName() {
            return "Marshmallon";
        }

        public static String getType() {
            return "Fairy";
        }

        public static String getDescription() {
            return "Cannot be destroyed by battle. After damage calculation, if this card was attacked, and was face-down at the start of the Damage Step: The attacking player takes 1000 damage.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 3;
        }

        public static int getDefenceScore() {
            return 500;
        }

        public static int getAttackScore() {
            return 300;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class BeastKingBarbaros extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("BeastKingBarbaros");
        }

        public void setLevel() {
            this.level = 8;
        }

        public void setType() {
            this.type = "Beast-Warrior";
        }

        public void setDefenceScore() {
            this.defenceScore = 1200;
        }

        public void setAttackScore() {
            this.attackScore = 3000;
        }

        public void setId(String id) {
            super.setId("YSIN-EN013");
        }

        public void setDescription(String description) {
            super.setDescription("You can Normal Summon/Set this card without Tributing, but its original ATK becomes 1900. You can Tribute 3 monsters to Tribute Summon (but not Set) this card. If Summoned this way: Destroy all cards your opponent controls.");
        }

        public static String getName() {
            return "BeastKingBarbaros";
        }

        public static String getType() {
            return "Beast-Warrior";
        }

        public static String getDescription() {
            return "You can Normal Summon/Set this card without Tributing, but its original ATK becomes 1900. You can Tribute 3 monsters to Tribute Summon (but not Set) this card. If Summoned this way: Destroy all cards your opponent controls.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 8;
        }

        public static int getDefenceScore() {
            return 1200;
        }

        public static int getAttackScore() {
            return 3000;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TexChanger extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("TexChanger");
        }

        public void setLevel() {
            this.level = 1;
        }

        public void setType() {
            this.type = "Cyberse";
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        public void setAttackScore() {
            this.attackScore = 100;
        }

        public void setId(String id) {
            super.setId("YSI8-EN002");
        }

        public void setDescription(String description) {
            super.setDescription("Once per turn, when your monster is targeted for an attack: You can negate that attack, then Special Summon 1 Cyberse Normal Monster from your hand, Deck, or GY.");
        }

        public static String getName() {
            return "TexChanger";
        }

        public static String getType() {
            return "Cyberse";
        }

        public static String getDescription() {
            return "Once per turn, when your monster is targeted for an attack: You can negate that attack, then Special Summon 1 Cyberse Normal Monster from your hand, Deck, or GY.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 1;
        }

        public static int getDefenceScore() {
            return 100;
        }

        public static int getAttackScore() {
            return 100;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TheCalculator extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("TheCalculator");
        }

        public void setLevel() {
            this.level = 2;
        }

        public void setType() {
            this.type = "Thunder";
        }

        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        public void setAttackScore() {
            this.attackScore = 0;
        }

        public void setId(String id) {
            super.setId("YSI5-ENY11");
        }

        public void setDescription(String description) {
            super.setDescription("The ATK of this card is the combined Levels of all face-up monsters you control x 300.");
        }

        public static String getName() {
            return "TheCalculator";
        }

        public static String getType() {
            return "Thunder";
        }

        public static String getDescription() {
            return "The ATK of this card is the combined Levels of all face-up monsters you control x 300.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 2;
        }

        public static int getDefenceScore() {
            return 0;
        }

        public static int getAttackScore() {
            return 0;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class MirageDragon extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("MirageDragon");
        }

        public void setLevel() {
            this.level = 4;
        }

        public void setType() {
            this.type = "Dragon";
        }

        public void setDefenceScore() {
            this.defenceScore = 600;
        }

        public void setAttackScore() {
            this.attackScore = 1600;
        }

        public void setId(String id) {
            super.setId("YSI5-ENY06");
        }

        public void setDescription(String description) {
            super.setDescription("Your opponent cannot activate Trap Cards during the Battle Phase.");
        }

        public static String getName() {
            return "MirageDragon";
        }

        public static String getType() {
            return "Dragon";
        }

        public static String getDescription() {
            return "Your opponent cannot activate Trap Cards during the Battle Phase.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 4;
        }

        public static int getDefenceScore() {
            return 600;
        }

        public static int getAttackScore() {
            return 1600;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class HeraldOfCreation extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("HeraldOfCreation");
        }

        public void setLevel() {
            this.level = 4;
        }

        public void setType() {
            this.type = "Spellcaster";
        }

        public void setDefenceScore() {
            this.defenceScore = 600;
        }

        public void setAttackScore() {
            this.attackScore = 1800;
        }

        public void setId(String id) {
            super.setId("SRO2-EN007");
        }

        public void setDescription(String description) {
            super.setDescription("Once per turn: You can discard 1 card, then target 1 Level 7 or higher monster in your Graveyard; add that target to your hand.");
        }

        public static String getName() {
            return "HeraldOfCreation";
        }

        public static String getType() {
            return "Spellcaster";
        }

        public static String getDescription() {
            return "Once per turn: You can discard 1 card, then target 1 Level 7 or higher monster in your Graveyard; add that target to your hand.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 4;
        }

        public static int getDefenceScore() {
            return 600;
        }

        public static int getAttackScore() {
            return 1800;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class ExploderDragon extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("ExploderDragon");
        }

        public void setLevel() {
            this.level = 3;
        }

        public void setType() {
            this.type = "Dragon";
        }

        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        public void setAttackScore() {
            this.attackScore = 1000;
        }

        public void setId(String id) {
            super.setId("YSI5-END10");
        }

        public void setDescription(String description) {
            super.setDescription("If this card is destroyed by battle and sent to the Graveyard: Destroy the monster that destroyed it. Neither player takes any battle damage from attacks involving this attacking card.");
        }

        public static String getName() {
            return "ExploderDragon";
        }

        public static String getType() {
            return "Dragon";
        }

        public static String getDescription() {
            return "If this card is destroyed by battle and sent to the Graveyard: Destroy the monster that destroyed it. Neither player takes any battle damage from attacks involving this attacking card.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 3;
        }

        public static int getDefenceScore() {
            return 0;
        }

        public static int getAttackScore() {
            return 1000;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TerratigerTheEmpowredWorrier extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("TerratigerTheEmpowredWorrier");
        }

        public void setLevel() {
            this.level = 4;
        }

        public void setType() {
            this.type = "Warrior";
        }

        public void setDefenceScore() {
            this.defenceScore = 1200;
        }

        public void setAttackScore() {
            this.attackScore = 1800;
        }

        public void setId(String id) {
            super.setId("");
        }

        public void setDescription(String description) {
            super.setDescription("When this card is Normal Summoned: You can Special Summon 1 Level 4 or lower Normal Monster from your hand in Defense Position.");
        }

        public static String getName() {
            return "TerratigerTheEmpowredWorrier";
        }

        public static String getType() {
            return "Warrior";
        }

        public static String getDescription() {
            return "When this card is Normal Summoned: You can Special Summon 1 Level 4 or lower Normal Monster from your hand in Defense Position.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 4;
        }

        public static int getDefenceScore() {
            return 1200;
        }

        public static int getAttackScore() {
            return 1800;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }

    abstract public static class TheTricky extends Monsters implements EffectiveMonster {
        public void setName(String name) {
            super.setName("TheTricky");
        }

        public void setLevel() {
            this.level = 5;
        }

        public void setType() {
            this.type = "Spellcaster";
        }

        public void setDefenceScore() {
            this.defenceScore = 1200;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public void setId(String id) {
            super.setId("LDK2-ENY15");
        }

        public void setDescription(String description) {
            super.setDescription("You can Special Summon this card (from your hand) by discarding 1 card.");
        }

        public static String getName() {
            return "TheTricky";
        }

        public static String getType() {
            return "Spellcaster";
        }

        public static String getDescription() {
            return "You can Special Summon this card (from your hand) by discarding 1 card.";
        }

        public String getId() {
            return super.getId();
        }

        public static int getLevel() {
            return 5;
        }

        public static int getDefenceScore() {
            return 1200;
        }

        public static int getAttackScore() {
            return 2000;
        }

        public void addCardName() {
            allCardsName.add(getName());
        }

        public void addCardId() {
            allCardsId.add(getId());
        }

        public void addCard() {
            listOfCards.add(toString());
        }

        public void addMonsterCard() {
            super.addMonsterCard();
        }

        public static void showCardInfo() {
            System.out.println("Name: " + getName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Type: " + getType() + "\n" +
                    "ATK: " + getAttackScore() + "\n" +
                    "DEF: " + getDefenceScore() + "\n" +
                    "Description: " + getDescription());
        }
    }
}