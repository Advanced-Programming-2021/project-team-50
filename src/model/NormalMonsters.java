package model;

public class NormalMonsters extends Monsters {

    abstract class BattleOx extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("BattleOx");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1700;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("SS02-ENA02");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Beast-Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A monster with tremendous power, it destroys enemies with a swing of its axe.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class AxeRaider extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("AxeRaider");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1700;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1150;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("LCJW-EN007");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("An axe-wielding monster of tremendous strength and agility.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class HornImp extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("HornImp");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1300;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Fiend";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A small fiend that dwells in the dark, its single horn makes it a formidable opponent.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class SilverFang extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("SilverFang");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1200;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 800;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("LCYW-EN004");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Beast";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A snow wolf that's beautiful to the eye, but absolutely vicious in battle.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Fireyarou extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("Fireyarou");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1300;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("AP08-EN015");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Pyro";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A malevolent creature wrapped in flames that attacks enemies with intense fire.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class CurtainOfDarkOnes extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("CurtainOfDarkOnes");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 2;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 600;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("AP03-EN014");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Spellcaster";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A curtain that a spellcaster made, it is said to raise a dark power.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class FeralImp extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("FeralImp");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1300;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("OP05-EN015");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Fiend";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A playful little fiend that lurks in the dark, waiting to attack an unwary enemy.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class DarkMagician extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("DarkMagician");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 7;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2500;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2100;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("YGLD-ENB02");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Spellcaster";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("The ultimate wizard in terms of attack and defense.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Wattkid extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("Wattkid");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1000;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("EU04-EN012");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Thunder";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A creature that electrocutes opponents with bolts of lightning.\n" +
                    "\n" +
                    "Note\n" +
                    "Card Name updated from \"Oscillo Hero #2\" on November 19, 2010.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class BabyDragon extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("BabyDragon");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1200;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 700;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("DLGI-EN033");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Much more than just a child, this dragon is gifted with untapped power.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class HeroOfTheEast extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("HeroOfTheEast");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1100;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("LCJW-EN019");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Feel da strength ah dis sword-swingin' samurai from da Far East.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class BattleWarrior extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("BattleWarrior");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 700;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("NUMH-EN025");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A warrior that fights with his bare hands!!!");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class CrawlingDragon extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("CrawlingDragon");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 5;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1600;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("MRD-EN012");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("This weakened dragon can no longer fly, but is still a deadly force to be reckoned with.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class FlameManipulator extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("FlameManipulator");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 900;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("LOB-E012");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Spellcaster";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\".");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class BlueEyesWhiteDragon extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("BlueEyesWhiteDragon");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 8;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 3000;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("LC01-EN004");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale.\n");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class CrabTurtle extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("CrabTurtle");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 7;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2550;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("SRI-069");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Aqua";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("This monster can only be Ritual Summoned with the Ritual Spell Card, \"Turtle Oath\". You must also offer monsters whose total Level Stars equal 8 or more as a Tribute from the field or your hand.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class SkullGuardian extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("SkullGuardian");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 7;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2050;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("This monster can only be Ritual Summoned with the Ritual Spell Card, \"Novox's Prayer\". You must also offer monsters whose total Level Stars equal 7 or more as a Tribute from the field or your hand.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class SlutMachine extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("SlutMachine");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 7;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2000;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2300;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("SBSC-EN025");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Machine";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("The machine's ability is said to vary according to its slot results.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Haniwa extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("Haniwa");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 2;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 500;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("TP7-EN016");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Rock";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("An earthen figure that protects the tomb of an ancient ruler.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Bitron extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("Bitron");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 2;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 200;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2000;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("USI8-EN005");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Cyberse";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A new species found in electronic space. There's not much information on it.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Leotron extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("Leotron");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2000;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("USI8-EN001");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Cyberse";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("A territorial electronic monster that guards its own domain.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class AlexandriteDragon extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("AlexandriteDragon");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2000;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("LDK2-ENK12");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Many of the czars' lost jewels can be found in the scales of this priceless dragon. Its creator remains a mystery, along with how they acquired the imperial treasures. But whosoever finds this dragon has hit the jackpot... whether they know it or not.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class WarriorDaiGrepher extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("WarriorDaiGrepher");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1700;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1600;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("SBAD-EN035");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("The warrior who can manipulate dragons. Nobody knows his mysterious past.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class DarkBlade extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("DarkBlade");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1800;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1500;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("YSI4-EN005");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("They say he is a dragon-manipulating warrior from the dark world. His attack is tremendous, using his great swords with vicious power.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Wattialdragon extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("Wattialdragon");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 6;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2500;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 1700;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("YSI4-EN001");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Capable of indefinite flight. Attacks by wrapping its body with electricity and ramming into opponents.\n" +
                    "IMPORTANT: Capturing the \"Wattaildragon\" is forbidden by the Ancient Rules and is a Level 6 offense, the minimum sentence for which is imprisonment for no less than 2500 heliocycles.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class SpiralSerpent extends Monsters implements NormalMonster {
        @Override
        public void setName(String name) {
            super.setName("SpiralSerpent");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setLevel() {
            this.level = 8;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2900;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        public void setDefenceScore() {
            this.defenceScore = 2900;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public void setId(String id) {
            super.setId("SDSI-EN007");
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public void setType() {
            this.type = "SeaSerpent";
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("When huge whirlpools lay cities asunder, it is the hunger of this sea serpent at work. No one has ever escaped its dreaded Spiral Wave to accurately describe the terror they experienced.");
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }
}