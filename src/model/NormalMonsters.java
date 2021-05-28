package model;

public class NormalMonsters extends Monsters {

    abstract public static class BattleOx extends Monsters implements NormalMonster {

        public void setName(String name) {
            super.setName("BattleOx");
        }

        public static String getName() {
            return "BattleOx";
        }

        public void setPrice() {
            super.setPrice(2900);
        }

        public static int getPrice() {
            return 2900;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1700;
        }

        public static int getAttackScore() {
            return 1700;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public static int getDefenceScore() {
            return 1000;
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

        public static String getType() {
            return "Beast-Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("A monster with tremendous power, it destroys enemies with a swing of its axe.");
        }

        public static String getDescription() {
            return "A monster with tremendous power, it destroys enemies with a swing of its axe.";
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

    abstract public static class AxeRaider extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("AxeRaider");
        }

        public static String getName() {
            return "AxeRaider";
        }

        public void setLevel() {
            this.level = 4;
        }

        public void setPrice() {
            super.setPrice(3100);
        }

        public static int getPrice() {
            return 3100;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1700;
        }

        public static int getAttackScore() {
            return 1700;
        }

        public void setDefenceScore() {
            this.defenceScore = 1150;
        }

        public static int getDefenceScore() {
            return 1150;
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

        public static String getType() {
            return "Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("An axe-wielding monster of tremendous strength and agility.");
        }

        public static String getDescription() {
            return "An axe-wielding monster of tremendous strength and agility.";
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

    abstract public static class HornImp extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("HornImp");
        }

        public static String getName() {
            return "HornImp";
        }

        public void setPrice() {
            super.setPrice(2500);
        }

        public static int getPrice() {
            return 2500;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1300;
        }

        public static int getAttackScore() {
            return 1300;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public static int getDefenceScore() {
            return 1000;
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

        public static String getType() {
            return "Fiend";
        }

        public void setDescription(String description) {
            super.setDescription("A small fiend that dwells in the dark, its single horn makes it a formidable opponent.");
        }

        public static String getDescription() {
            return "A small fiend that dwells in the dark, its single horn makes it a formidable opponent.";
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

    abstract public static class SilverFang extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SilverFang");
        }

        public static String getName() {
            return "SilverFang";
        }

        public void setPrice() {
            super.setPrice(1700);
        }

        public static int getPrice() {
            return 1700;
        }

        public void setLevel() {
            this.level = 3;
        }

        public static int getLevel() {
            return 3;
        }

        public void setAttackScore() {
            this.attackScore = 1200;
        }

        public static int getAttackScore() {
            return 1200;
        }

        public void setDefenceScore() {
            this.defenceScore = 800;
        }

        public static int getDefenceScore() {
            return 800;
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

        public static String getType() {
            return "Beast";
        }

        public void setDescription(String description) {
            super.setDescription("A snow wolf that's beautiful to the eye, but absolutely vicious in battle.");
        }

        public static String getDescription() {
            return "A snow wolf that's beautiful to the eye, but absolutely vicious in battle.";
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

    abstract public static class Fireyarou extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Fireyarou");
        }

        public static String getName() {
            return "Fireyarou";
        }

        public void setPrice() {
            super.setPrice(2500);
        }

        public static int getPrice() {
            return 2500;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1300;
        }

        public static int getAttackScore() {
            return 1300;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public static int getDefenceScore() {
            return 1000;
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

        public static String getType() {
            return "Pyro";
        }

        public void setDescription(String description) {
            super.setDescription("A malevolent creature wrapped in flames that attacks enemies with intense fire.");
        }

        public static String getDescription() {
            return "A malevolent creature wrapped in flames that attacks enemies with intense fire.";
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

    abstract public static class CurtainOfDarkOnes extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("CurtainOfDarkOnes");
        }

        public static String getName() {
            return "CurtainOfDarkOnes";
        }

        public void setPrice() {
            super.setPrice(700);
        }

        public static int getPrice() {
            return 700;
        }

        public void setLevel() {
            this.level = 2;
        }

        public static int getLevel() {
            return 2;
        }

        public void setAttackScore() {
            this.attackScore = 600;
        }

        public static int getAttackScore() {
            return 600;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public static int getDefenceScore() {
            return 500;
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

        public static String getType() {
            return "Spellcaster";
        }

        public void setDescription(String description) {
            super.setDescription("A curtain that a spellcaster made, it is said to raise a dark power.");
        }

        public static String getDescription() {
            return "A curtain that a spellcaster made, it is said to raise a dark power.";
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

    abstract public static class FeralImp extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("FeralImp");
        }

        public static String getName() {
            return "FeralImp";
        }

        public void setPrice() {
            super.setPrice(2800);
        }

        public static int getPrice() {
            return 2800;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1300;
        }

        public static int getAttackScore() {
            return 1300;
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        public static int getDefenceScore() {
            return 1400;
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

        public static String getType() {
            return "Fiend";
        }

        public void setDescription(String description) {
            super.setDescription("A playful little fiend that lurks in the dark, waiting to attack an unwary enemy.");
        }

        public static String getDescription() {
            return "A playful little fiend that lurks in the dark, waiting to attack an unwary enemy.";
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

    abstract public static class DarkMagician extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("DarkMagician");
        }

        public static String getName() {
            return "DarkMagician";
        }

        public void setPrice() {
            super.setPrice(8300);
        }

        public static int getPrice() {
            return 8300;
        }

        public void setLevel() {
            this.level = 7;
        }

        public static int getLevel() {
            return 7;
        }

        public void setAttackScore() {
            this.attackScore = 2500;
        }

        public static int getAttackScore() {
            return 2500;
        }

        public void setDefenceScore() {
            this.defenceScore = 2100;
        }

        public static int getDefenceScore() {
            return 2100;
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

        public static String getType() {
            return "Spellcaster";
        }

        public void setDescription(String description) {
            super.setDescription("The ultimate wizard in terms of attack and defense.");
        }

        public static String getDescription() {
            return "The ultimate wizard in terms of attack and defense.";
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

    abstract public static class Wattkid extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Wattkid");
        }

        public static String getName() {
            return "Wattkid";
        }

        public void setPrice() {
            super.setPrice(1300);
        }

        public static int getPrice() {
            return 1300;
        }

        public void setLevel() {
            this.level = 3;
        }

        public static int getLevel() {
            return 3;
        }

        public void setAttackScore() {
            this.attackScore = 1000;
        }

        public static int getAttackScore() {
            return 1000;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public static int getDefenceScore() {
            return 500;
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

        public static String getType() {
            return "Thunder";
        }

        public void setDescription(String description) {
            super.setDescription("A creature that electrocutes opponents with bolts of lightning.\n" +
                    "\n" +
                    "Note\n" +
                    "Card Name updated from \"Oscillo Hero #2\" on November 19, 2010.");
        }

        public static String getDescription() {
            return "A creature that electrocutes opponents with bolts of lightning.\n" +
                    "\n" +
                    "Note\n" +
                    "Card Name updated from \"Oscillo Hero #2\" on November 19, 2010.";
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

    abstract public static class BabyDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BabyDragon");
        }

        public static String getName() {
            return "BabyDragon";
        }

        public void setPrice() {
            super.setPrice(1600);
        }

        public static int getPrice() {
            return 1600;
        }

        public void setLevel() {
            this.level = 3;
        }

        public static int getLevel() {
            return 3;
        }

        public void setAttackScore() {
            this.attackScore = 1200;
        }

        public static int getAttackScore() {
            return 1200;
        }

        public void setDefenceScore() {
            this.defenceScore = 700;
        }

        public static int getDefenceScore() {
            return 700;
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

        public static String getType() {
            return "Dragon";
        }

        public void setDescription(String description) {
            super.setDescription("Much more than just a child, this dragon is gifted with untapped power.");
        }

        public static String getDescription() {
            return "Much more than just a child, this dragon is gifted with untapped power.";
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

    abstract public static class HeroOfTheEast extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("HeroOfTheEast");
        }

        public static String getName() {
            return "HeroOfTheEast";
        }

        public void setPrice() {
            super.setPrice(1700);
        }

        public static int getPrice() {
            return 1700;
        }

        public void setLevel() {
            this.level = 3;
        }

        public static int getLevel() {
            return 3;
        }

        public void setAttackScore() {
            this.attackScore = 1100;
        }

        public static int getAttackScore() {
            return 1100;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public static int getDefenceScore() {
            return 1000;
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

        public static String getType() {
            return "Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("Feel da strength ah dis sword-swingin' samurai from da Far East.");
        }

        public static String getDescription() {
            return "Feel da strength ah dis sword-swingin' samurai from da Far East.";
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

    abstract public static class BattleWarrior extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BattleWarrior");
        }

        public static String getName() {
            return "BattleWarrior";
        }

        public void setPrice() {
            super.setPrice(1300);
        }

        public static int getPrice() {
            return 1300;
        }

        public void setLevel() {
            this.level = 3;
        }

        public static int getLevel() {
            return 3;
        }

        public void setAttackScore() {
            this.attackScore = 700;
        }

        public static int getAttackScore() {
            return 700;
        }

        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        public static int getDefenceScore() {
            return 1000;
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

        public static String getType() {
            return "Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("A warrior that fights with his bare hands!!!");
        }

        public static String getDescription() {
            return "A warrior that fights with his bare hands!!!";
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

    abstract public static class CrawlingDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("CrawlingDragon");
        }

        public static String getName() {
            return "CrawlingDragon";
        }

        public void setPrice() {
            super.setPrice(3900);
        }

        public static int getPrice() {
            return 3900;
        }

        public void setLevel() {
            this.level = 5;
        }

        public static int getLevel() {
            return 5;
        }

        public void setAttackScore() {
            this.attackScore = 1600;
        }

        public static int getAttackScore() {
            return 1600;
        }

        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        public static int getDefenceScore() {
            return 1400;
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

        public static String getType() {
            return "Dragon";
        }

        public void setDescription(String description) {
            super.setDescription("This weakened dragon can no longer fly, but is still a deadly force to be reckoned with.");
        }

        public static String getDescription() {
            return "This weakened dragon can no longer fly, but is still a deadly force to be reckoned with.";
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

    abstract public static class FlameManipulator extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("FlameManipulator");
        }

        public static String getName() {
            return "FlameManipulator";
        }

        public void setPrice() {
            super.setPrice(1500);
        }

        public static int getPrice() {
            return 1500;
        }

        public void setLevel() {
            this.level = 3;
        }

        public static int getLevel() {
            return 3;
        }

        public void setAttackScore() {
            this.attackScore = 900;
        }

        public static int getAttackScore() {
            return 900;
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        public static int getDefenceScore() {
            return 100;
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

        public static String getType() {
            return "Spellcaster";
        }

        public void setDescription(String description) {
            super.setDescription("This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\".");
        }

        public static String getDescription() {
            return "This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\".";
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

    abstract public static class BlueEyesWhiteDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("BlueEyesWhiteDragon");
        }

        public static String getName() {
            return "BlueEyesWhiteDragon";
        }

        public void setPrice() {
            super.setPrice(11300);
        }

        public static int getPrice() {
            return 11300;
        }

        public void setLevel() {
            this.level = 8;
        }

        public static int getLevel() {
            return 8;
        }

        public void setAttackScore() {
            this.attackScore = 3000;
        }

        public static int getAttackScore() {
            return 3000;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        public static int getDefenceScore() {
            return 2500;
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

        public static String getType() {
            return "Dragon";
        }

        public void setDescription(String description) {
            super.setDescription("This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale.");
        }

        public static String getDescription() {
            return "This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale.";
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

    abstract public static class CrabTurtle extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("CrabTurtle");
        }

        public static String getName() {
            return "CrabTurtle";
        }

        public void setPrice() {
            super.setPrice(10200);
        }

        public static int getPrice() {
            return 10200;
        }

        public void setLevel() {
            this.level = 7;
        }

        public static int getLevel() {
            return 7;
        }

        public void setAttackScore() {
            this.attackScore = 2550;
        }

        public static int getAttackScore() {
            return 2550;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        public static int getDefenceScore() {
            return 2500;
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

        public static String getType() {
            return "Aqua";
        }

        public void setDescription(String description) {
            super.setDescription("This monster can only be Ritual Summoned with the Ritual Spell Card, \"Turtle Oath\". You must also offer monsters whose total Level Stars equal 8 or more as a Tribute from the field or your hand.");
        }

        public static String getDescription() {
            return "This monster can only be Ritual Summoned with the Ritual Spell Card, \"Turtle Oath\". You must also offer monsters whose total Level Stars equal 8 or more as a Tribute from the field or your hand.";
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

    abstract public static class SkullGuardian extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SkullGuardian");
        }

        public static String getName() {
            return "SkullGuardian";
        }

        public void setPrice() {
            super.setPrice(7900);
        }

        public static int getPrice() {
            return 7900;
        }

        public void setLevel() {
            this.level = 7;
        }

        public static int getLevel() {
            return 7;
        }

        public void setAttackScore() {
            this.attackScore = 2050;
        }

        public static int getAttackScore() {
            return 2050;
        }

        public void setDefenceScore() {
            this.defenceScore = 2500;
        }

        public static int getDefenceScore() {
            return 2500;
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

        public static String getType() {
            return "Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("This monster can only be Ritual Summoned with the Ritual Spell Card, \"Novox's Prayer\". You must also offer monsters whose total Level Stars equal 7 or more as a Tribute from the field or your hand.");
        }

        public static String getDescription() {
            return "This monster can only be Ritual Summoned with the Ritual Spell Card, \"Novox's Prayer\". You must also offer monsters whose total Level Stars equal 7 or more as a Tribute from the field or your hand.";
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

    abstract public static class SlutMachine extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SlutMachine");
        }

        public static String getName() {
            return "SlutMachine";
        }

        public void setPrice() {
            super.setPrice(7500);
        }

        public static int getPrice() {
            return 7500;
        }

        public void setLevel() {
            this.level = 7;
        }

        public static int getLevel() {
            return 7;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public static int getAttackScore() {
            return 2000;
        }

        public void setDefenceScore() {
            this.defenceScore = 2300;
        }

        public static int getDefenceScore() {
            return 2300;
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

        public static String getType() {
            return "Machine";
        }

        public void setDescription(String description) {
            super.setDescription("The machine's ability is said to vary according to its slot results.");
        }

        public static String getDescription() {
            return "The machine's ability is said to vary according to its slot results.";
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

    abstract public static class Haniwa extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Haniwa");
        }

        public static String getName() {
            return "Haniwa";
        }

        public void setPrice() {
            super.setPrice(600);
        }

        public static int getPrice() {
            return 600;
        }

        public void setLevel() {
            this.level = 2;
        }

        public static int getLevel() {
            return 2;
        }

        public void setAttackScore() {
            this.attackScore = 500;
        }

        public static int getAttackScore() {
            return 500;
        }

        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        public static int getDefenceScore() {
            return 500;
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

        public static String getType() {
            return "Rock";
        }

        public void setDescription(String description) {
            super.setDescription("An earthen figure that protects the tomb of an ancient ruler.");
        }

        public static String getDescription() {
            return "An earthen figure that protects the tomb of an ancient ruler.";
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

    abstract public static class Bitron extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Bitron");
        }

        public static String getName() {
            return "Bitron";
        }

        public void setPrice() {
            super.setPrice(1000);
        }

        public static int getPrice() {
            return 1000;
        }

        public void setLevel() {
            this.level = 2;
        }

        public static int getLevel() {
            return 2;
        }

        public void setAttackScore() {
            this.attackScore = 200;
        }

        public static int getAttackScore() {
            return 200;
        }

        public void setDefenceScore() {
            this.defenceScore = 2000;
        }

        public static int getDefenceScore() {
            return 2000;
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

        public static String getType() {
            return "Cyberse";
        }

        public void setDescription(String description) {
            super.setDescription("A new species found in electronic space. There's not much information on it.");
        }

        public static String getDescription() {
            return "A new species found in electronic space. There's not much information on it.";
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

    abstract public static class Leotron extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Leotron");
        }

        public static String getName() {
            return "Leotron";
        }

        public void setPrice() {
            super.setPrice(2500);
        }

        public static int getPrice() {
            return 2500;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public static int getAttackScore() {
            return 2000;
        }

        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        public static int getDefenceScore() {
            return 0;
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

        public static String getType() {
            return "Cyberse";
        }

        public void setDescription(String description) {
            super.setDescription("A territorial electronic monster that guards its own domain.");
        }

        public static String getDescription() {
            return "A territorial electronic monster that guards its own domain.";
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

    abstract public static class AlexandriteDragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("AlexandriteDragon");
        }

        public static String getName() {
            return "AlexandriteDragon";
        }

        public void setPrice() {
            super.setPrice(2600);
        }

        public static int getPrice() {
            return 2600;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 2000;
        }

        public static int getAttackScore() {
            return 2000;
        }

        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        public static int getDefenceScore() {
            return 100;
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

        public static String getType() {
            return "Dragon";
        }

        public void setDescription(String description) {
            super.setDescription("Many of the czars' lost jewels can be found in the scales of this priceless dragon. Its creator remains a mystery, along with how they acquired the imperial treasures. But whosoever finds this dragon has hit the jackpot... whether they know it or not.");
        }

        public static String getDescription() {
            return "Many of the czars' lost jewels can be found in the scales of this priceless dragon. Its creator remains a mystery, along with how they acquired the imperial treasures. But whosoever finds this dragon has hit the jackpot... whether they know it or not.";
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

    abstract public static class WarriorDaiGrepher extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("WarriorDaiGrepher");
        }

        public static String getName() {
            return "WarriorDaiGrepher";
        }

        public void setPrice() {
            super.setPrice(3400);
        }

        public static int getPrice() {
            return 3400;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1700;
        }

        public static int getAttackScore() {
            return 1700;
        }

        public void setDefenceScore() {
            this.defenceScore = 1600;
        }

        public static int getDefenceScore() {
            return 1600;
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

        public static String getType() {
            return "Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("The warrior who can manipulate dragons. Nobody knows his mysterious past.");
        }

        public static String getDescription() {
            return "The warrior who can manipulate dragons. Nobody knows his mysterious past.";
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

    abstract public static class DarkBlade extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("DarkBlade");
        }

        public static String getName() {
            return "DarkBlade";
        }

        public void setPrice() {
            super.setPrice(3500);
        }

        public static int getPrice() {
            return 3500;
        }

        public void setLevel() {
            this.level = 4;
        }

        public static int getLevel() {
            return 4;
        }

        public void setAttackScore() {
            this.attackScore = 1800;
        }

        public static int getAttackScore() {
            return 1800;
        }

        public void setDefenceScore() {
            this.defenceScore = 1500;
        }

        public static int getDefenceScore() {
            return 1500;
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

        public static String getType() {
            return "Warrior";
        }

        public void setDescription(String description) {
            super.setDescription("They say he is a dragon-manipulating warrior from the dark world. His attack is tremendous, using his great swords with vicious power.");
        }

        public static String getDescription() {
            return "They say he is a dragon-manipulating warrior from the dark world. His attack is tremendous, using his great swords with vicious power.";
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

    abstract public static class Wattialdragon extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("Wattialdragon");
        }

        public static String getName() {
            return "Wattialdragon";
        }

        public void setPrice() {
            super.setPrice(5800);
        }

        public static int getPrice() {
            return 5800;
        }

        public void setLevel() {
            this.level = 6;
        }

        public static int getLevel() {
            return 6;
        }

        public void setAttackScore() {
            this.attackScore = 2500;
        }

        public static int getAttackScore() {
            return 2500;
        }

        public void setDefenceScore() {
            this.defenceScore = 1700;
        }

        public static int getDefenceScore() {
            return 1700;
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

        public static String getType() {
            return "Dragon";
        }

        public void setDescription(String description) {
            super.setDescription("Capable of indefinite flight. Attacks by wrapping its body with electricity and ramming into opponents.\n" +
                    "IMPORTANT: Capturing the \"Wattaildragon\" is forbidden by the Ancient Rules and is a Level 6 offense, the minimum sentence for which is imprisonment for no less than 2500 heliocycles.");
        }

        public static String getDescription() {
            return "Capable of indefinite flight. Attacks by wrapping its body with electricity and ramming into opponents.\n" +
                    "IMPORTANT: Capturing the \"Wattaildragon\" is forbidden by the Ancient Rules and is a Level 6 offense, the minimum sentence for which is imprisonment for no less than 2500 heliocycles.";
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

    abstract public static class SpiralSerpent extends Monsters implements NormalMonster {
        public void setName(String name) {
            super.setName("SpiralSerpent");
        }

        public static String getName() {
            return "SpiralSerpent";
        }

        public void setPrice() {
            super.setPrice(11700);
        }

        public static int getPrice() {
            return 11700;
        }

        public void setLevel() {
            this.level = 8;
        }

        public static int getLevel() {
            return 8;
        }

        public void setAttackScore() {
            this.attackScore = 2900;
        }

        public static int getAttackScore() {
            return 2900;
        }

        public void setDefenceScore() {
            this.defenceScore = 2900;
        }

        public static int getDefenceScore() {
            return 2900;
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

        public static String getType() {
            return "SeaSerpent";
        }

        public void setDescription(String description) {
            super.setDescription("When huge whirlpools lay cities asunder, it is the hunger of this sea serpent at work. No one has ever escaped its dreaded Spiral Wave to accurately describe the terror they experienced.");
        }

        public static String getDescription() {
            return "When huge whirlpools lay cities asunder, it is the hunger of this sea serpent at work. No one has ever escaped its dreaded Spiral Wave to accurately describe the terror they experienced.";
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