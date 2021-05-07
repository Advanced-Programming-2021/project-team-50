package model;

public class NormalMonsters extends Monsters {

    abstract class BattleOx extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BattleOx");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1700;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("SS02-ENA02");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Beast-Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A monster with tremendous power, it destroys enemies with a swing of its axe.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class AxeRaider extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("AxeRaider");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1700;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1150;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("LCJW-EN007");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("An axe-wielding monster of tremendous strength and agility.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class HornImp extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("HornImp");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1300;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Fiend";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A small fiend that dwells in the dark, its single horn makes it a formidable opponent.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class SilverFang extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SilverFang");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 3;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1200;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 800;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("LCYW-EN004");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Beast";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A snow wolf that's beautiful to the eye, but absolutely vicious in battle.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class Fireyarou extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Fireyarou");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1300;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("AP08-EN015");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Pyro";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A malevolent creature wrapped in flames that attacks enemies with intense fire.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class CurtainOfDarkOnes extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("CurtainOfDarkOnes");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 2;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 600;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("AP03-EN014");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Spellcaster";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A curtain that a spellcaster made, it is said to raise a dark power.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class FeralImp extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("FeralImp");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1300;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("OP05-EN015");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Fiend";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A playful little fiend that lurks in the dark, waiting to attack an unwary enemy.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class DarkMagician extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("DarkMagician");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 7;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2500;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2100;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("YGLD-ENB02");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Spellcaster";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("The ultimate wizard in terms of attack and defense.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class Wattkid extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Wattkid");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 3;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1000;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("EU04-EN012");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Thunder";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A creature that electrocutes opponents with bolts of lightning.\n" +
                    "\n" +
                    "Note\n" +
                    "Card Name updated from \"Oscillo Hero #2\" on November 19, 2010.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class BabyDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BabyDragon");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 3;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1200;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 700;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("DLGI-EN033");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Dragon";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("Much more than just a child, this dragon is gifted with untapped power.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class HeroOfTheEast extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("HeroOfTheEast");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 3;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1100;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("LCJW-EN019");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("Feel da strength ah dis sword-swingin' samurai from da Far East.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class BattleWarrior extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BattleWarrior");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 3;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 700;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("NUMH-EN025");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A warrior that fights with his bare hands!!!");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class CrawlingDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("CrawlingDragon");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 5;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1600;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("MRD-EN012");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Dragon";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("This weakened dragon can no longer fly, but is still a deadly force to be reckoned with.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class FlameManipulator extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("FlameManipulator");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 3;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 900;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("LOB-E012");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Spellcaster";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\".");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class BlueEyesWhiteDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BlueEyesWhiteDragon");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 8;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 3000;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("LC01-EN004");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Dragon";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale.\n");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class CrabTurtle extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("CrabTurtle");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 7;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2550;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("SRI-069");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Aqua";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("This monster can only be Ritual Summoned with the Ritual Spell Card, \"Turtle Oath\". You must also offer monsters whose total Level Stars equal 8 or more as a Tribute from the field or your hand.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class SkullGuardian extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SkullGuardian");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 7;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2050;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("This monster can only be Ritual Summoned with the Ritual Spell Card, \"Novox's Prayer\". You must also offer monsters whose total Level Stars equal 7 or more as a Tribute from the field or your hand.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class SlutMachine extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SlutMachine");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 7;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2300;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("SBSC-EN025");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Machine";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("The machine's ability is said to vary according to its slot results.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class Haniwa extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Haniwa");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 2;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 500;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("TP7-EN016");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Rock";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("An earthen figure that protects the tomb of an ancient ruler.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class Bitron extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Bitron");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 2;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 200;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2000;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("USI8-EN005");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Cyberse";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A new species found in electronic space. There's not much information on it.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class Leotron extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Leotron");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("USI8-EN001");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Cyberse";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("A territorial electronic monster that guards its own domain.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class AlexandriteDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("AlexandriteDragon");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("LDK2-ENK12");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Dragon";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("Many of the czars' lost jewels can be found in the scales of this priceless dragon. Its creator remains a mystery, along with how they acquired the imperial treasures. But whosoever finds this dragon has hit the jackpot... whether they know it or not.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class WarriorDaiGrepher extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("WarriorDaiGrepher");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1700;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1600;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("SBAD-EN035");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("The warrior who can manipulate dragons. Nobody knows his mysterious past.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class DarkBlade extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("DarkBlade");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 4;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 1800;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1500;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("YSI4-EN005");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Warrior";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("They say he is a dragon-manipulating warrior from the dark world. His attack is tremendous, using his great swords with vicious power.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class Wattialdragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Wattialdragon");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 6;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2500;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1700;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("YSI4-EN001");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "Dragon";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("Capable of indefinite flight. Attacks by wrapping its body with electricity and ramming into opponents.\n" +
                    "IMPORTANT: Capturing the \"Wattaildragon\" is forbidden by the Ancient Rules and is a Level 6 offense, the minimum sentence for which is imprisonment for no less than 2500 heliocycles.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }

    abstract class SpiralSerpent extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SpiralSerpent");
        }

        public String getName() {
            return super.getName();
        }

        public void setLevel() {
            this.level = 8;
        }

        public int getLevel() {
            return this.level;
        }

        public void setAttackScore() {
            this.attackScore = 2900;
        }

        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2900;
        }

        public int getDefenceScore() {
            return this.defenceScore;
        }

        public void setId(String id) {
            super.setId("SDSI-EN007");
        }

        public String getId() {
            return super.getId();
        }

        public void setType() {
            this.type = "SeaSerpent";
        }

        public String getType() {
            return this.type;
        }

        public void setDescription(String description) {
            super.setDescription("When huge whirlpools lay cities asunder, it is the hunger of this sea serpent at work. No one has ever escaped its dreaded Spiral Wave to accurately describe the terror they experienced.");
        }

        public String getDescription() {
            return super.getDescription();
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
    }
}