package model;

public class EffectiveMonsters extends Monsters {

    abstract class CommandKnight extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("CommandKnight");
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1000;
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 1000;
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public void setId(String id) {
            super.setId("LDK2-ENJ20");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("All Warrior monsters you control gain 400 ATK. If you control another monster, monsters your opponent controls cannot target this card for attacks.");
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

    }

    abstract class YomiShip extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("YomiShip");
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 1400;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 800;
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public void setType() {
            this.type = "Aqua";
        }

        @Override
        public void setId(String id) {
            super.setId("SBAD-EN024");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("If this card is destroyed by battle and sent to the GY: Destroy the monster that destroyed this card.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class Suijin extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("Suijin");
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2500;
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 2400;
        }

        @Override
        public void setId(String id) {
            super.setId("LCJW-EN226");
        }

        @Override
        public void setType() {
            this.type = "Aqua";
        }

        @Override
        public void setLevel() {
            this.level = 7;
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("During damage calculation in your opponent's turn, if this card is being attacked: You can target the attacking monster; make that target's ATK 0 during damage calculation only (this is a Quick Effect). This effect can only be used once while this card is face-up on the field.");
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getName() {
            return super.getName();
        }
    }

    abstract class ManEaterBug extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("ManEaterBug");
        }

        @Override
        public void setLevel() {
            this.level = 2;
        }

        @Override
        public void setType() {
            this.type = "Insect";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 600;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 450;
        }

        @Override
        public void setId(String id) {
            super.setId("DLGI-EN015");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("FLIP: Target 1 monster on the field; destroy it.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class GateGuardian extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("GateGuardian");
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 3750;
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 3400;
        }

        @Override
        public void setLevel() {
            this.level = 11;
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public void setId(String id) {
            super.setId("LCJW-EN223");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Cannot be Normal Summoned/Set. Must first be Special Summoned (from your hand) by Tributing 1 \"Sanga of the Thunder\", \"Kazejin\", and \"Suijin\".");
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }

    abstract class Scanner extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("Scanner");
        }

        @Override
        public void setLevel() {
            this.level = 1;
        }

        @Override
        public void setType() {
            this.type = "Machine";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 0;
        }

        @Override
        public void setId(String id) {
            super.setId("CRMS-EN032");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Once per turn, you can select 1 of your opponent's monsters that is removed from play. Until the End Phase, this card's name is treated as the selected monster's name, and this card has the same Attribute, Level, ATK, and DEF as the selected monster. If this card is removed from the field while this effect is applied, remove it from play.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class Marshmallon extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("Marshmallon");
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public void setType() {
            this.type = "Fairy";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 500;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 300;
        }

        @Override
        public void setId(String id) {
            super.setId("");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Cannot be destroyed by battle. After damage calculation, if this card was attacked, and was face-down at the start of the Damage Step: The attacking player takes 1000 damage.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class BeastKingBarbaros extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("BeastKingBarbaros");
        }

        @Override
        public void setLevel() {
            this.level = 8;
        }

        @Override
        public void setType() {
            this.type = "Beast-Warrior";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 1200;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 3000;
        }

        @Override
        public void setId(String id) {
            super.setId("YSIN-EN013");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("You can Normal Summon/Set this card without Tributing, but its original ATK becomes 1900. You can Tribute 3 monsters to Tribute Summon (but not Set) this card. If Summoned this way: Destroy all cards your opponent controls.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class TexChanger extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("TexChanger");
        }

        @Override
        public void setLevel() {
            this.level = 1;
        }

        @Override
        public void setType() {
            this.type = "Cyberse";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 100;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 100;
        }

        @Override
        public void setId(String id) {
            super.setId("YSI8-EN002");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Once per turn, when your monster is targeted for an attack: You can negate that attack, then Special Summon 1 Cyberse Normal Monster from your hand, Deck, or GY.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class TheCalculator extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("TheCalculator");
        }

        @Override
        public void setLevel() {
            this.level = 2;
        }

        @Override
        public void setType() {
            this.type = "Thunder";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 0;
        }

        @Override
        public void setId(String id) {
            super.setId("YSI5-ENY11");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("The ATK of this card is the combined Levels of all face-up monsters you control x 300.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class MirageDragon extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("MirageDragon");
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 600;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1600;
        }

        @Override
        public void setId(String id) {
            super.setId("YSI5-ENY06");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Your opponent cannot activate Trap Cards during the Battle Phase.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class HeraldOfCreation extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("HeraldOfCreation");
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public void setType() {
            this.type = "Spellcaster";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 600;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1800;
        }

        @Override
        public void setId(String id) {
            super.setId("SRO2-EN007");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("Once per turn: You can discard 1 card, then target 1 Level 7 or higher monster in your Graveyard; add that target to your hand.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class ExploderDragon extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("ExploderDragon");
        }

        @Override
        public void setLevel() {
            this.level = 3;
        }

        @Override
        public void setType() {
            this.type = "Dragon";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 0;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1000;
        }

        @Override
        public void setId(String id) {
            super.setId("YSI5-END10");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("If this card is destroyed by battle and sent to the Graveyard: Destroy the monster that destroyed it. Neither player takes any battle damage from attacks involving this attacking card.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class TerratigerTheEmpowredWorrier extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("TerratigerTheEmpowredWorrier");
        }

        @Override
        public void setLevel() {
            this.level = 4;
        }

        @Override
        public void setType() {
            this.type = "Warrior";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 1200;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 1800;
        }

        @Override
        public void setId(String id) {
            super.setId("");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("When this card is Normal Summoned: You can Special Summon 1 Level 4 or lower Normal Monster from your hand in Defense Position.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }

    abstract class TheTricky extends Monsters implements EffectiveMonster {
        @Override
        public void setName(String name) {
            super.setName("TheTricky");
        }

        @Override
        public void setLevel() {
            this.level = 5;
        }

        @Override
        public void setType() {
            this.type = "Spellcaster";
        }

        @Override
        public void setDefenceScore() {
            this.defenceScore = 1200;
        }

        @Override
        public void setAttackScore() {
            this.attackScore = 2000;
        }

        @Override
        public void setId(String id) {
            super.setId("LDK2-ENY15");
        }

        @Override
        public void setDescription(String description) {
            super.setDescription("You can Special Summon this card (from your hand) by discarding 1 card.");
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String getType() {
            return this.type;
        }

        @Override
        public String getDescription() {
            return super.getDescription();
        }

        @Override
        public String getId() {
            return super.getId();
        }

        @Override
        public int getLevel() {
            return this.level;
        }

        @Override
        public int getDefenceScore() {
            return this.defenceScore;
        }

        @Override
        public int getAttackScore() {
            return this.attackScore;
        }
    }
}