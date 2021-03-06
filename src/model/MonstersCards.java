package model;

import java.util.Scanner;
import model.MonsterCard;


public class MonstersCards {

    private MonstersCards(Scanner scanner) {
        this.scanner = scanner;
    }

    private static MonstersCards instance;
    private Scanner scanner;
    private MonsterCard card;

    public void addCards() {
        new MonsterCard("Yomi Ship", 3, "WATER", "Aqua",
                "Effect", 800, 1400,
                "If this card is destroyed by battle and sent to the GY: Destroy the monster that destroyed this card.",
                1700,"SBAD-EN024");
        new MonsterCard("Suijin",7,"WATER","Aqua",
                "Effect",2500, 2400,
                "During damage calculation in your opponent's turn, if this card is being attacked: You can target the attacking monster; make that target's ATK 0 during damage calculation only (this is a Quick Effect). This effect can only be used once while this card is face-up on the field.",
                8700,"LCJW-EN226");
        new MonsterCard("Man-Eater Bug",2,"EARTH","Insect",
                "Effect",450,600,
                "FLIP: Target 1 monster on the field; destroy that target.",
                600,"DLGI-EN015");
        new MonsterCard("Gate Guardian",11,"DARK","Warrior",
                "Effect",3750,3400,
                "Cannot be Normal Summoned/Set. Must first be Special Summoned (from your hand) by Tributing 1 \"Sanga of the Thunder\",\"Kazejin\", and \"Suijin\".",
                20000,"LCJW-EN223");
        new MonsterCard("Scanner",1,"LIGHT","Machine",
                "Effect",0,0,
                "Once per turn, you can select 1 of your opponent's monsters that is removed from play. Until the End Phase, this card's name is treated as the selected monster's name, and this card has the same Attribute, Level, ATK, and DEF as the selected monster. If this card is removed from the field while this effect is applied, remove it from play.",
                8000,"CRMS-EN032");
        new MonsterCard("Marshmallon", 3,"LIGHT","Fairy",
                "Effect",300,500,
                "Cannot be destroyed by battle. After damage calculation, if this card was attacked, and was face-down at the start of the Damage Step: The attacking player takes 1000 damage.",
                700,"");
        new MonsterCard("Beast King Barbaros",8,"EARTH","Beast-Warrior",
                "Effect",3000,1200,
                "You can Normal Summon/Set this card without Tributing, but its original ATK becomes 1900. You can Tribute 3 monsters to Tribute Summon (but not Set) this card. If Summoned this way: Destroy all cards your opponent controls.",
                9200,"YSIN-EN013");
        new MonsterCard("Texchanger",1,"DARK","Cyberse",
                "Effect",100,100,
                "Once per turn, when your monster is targeted for an attack: You can negate that attack, then Special Summon 1 Cyberse Normal Monster from your hand, Deck, or GY.",
                200,"YSI8-EN002");
        new MonsterCard("The Calculator",2,"LIGHT","Thunder",
                "Effect",0,0,
                "The ATK of this card is the combined Levels of all face-up monsters you control x 300.",
                8000,"YSI5-ENY11");
        new MonsterCard("Mirage Dragon",4,"LIGHT","Dragon",
                "Effect",1600,600,
                "Your opponent cannot activate Trap Cards during the Battle Phase.",
                2500,"YSI5-ENY06");
        new MonsterCard("Herald of Creation",4,"LIGHT","Spellcaster",
                "Effect",1800,600,
                "Once per turn: You can discard 1 card, then target 1 Level 7 or higher monster in your Graveyard; add that target to your hand.",
                2700,"SRO2-EN007");
        new MonsterCard("Exploder Dragon",3,"EARTH","Dragon",
                "Effect",1000,0,
                "If this card is destroyed by battle and sent to the Graveyard: Destroy the monster that destroyed it. Neither player takes any battle damage from attacks involving this attacking card.",
                1000,"YSI5-END10");
        new MonsterCard("Terratiger, the Empowered Warrior",4,"\tEARTH","Warrior",
                "Effect",1800,1200,
                "When this card is Normal Summoned: You can Special Summon 1 Level 4 or lower Normal Monster from your hand in Defense Position.",
                3200,"");
        new MonsterCard("The Tricky",5,"WIND","Spellcaster",
                "Effect",2000,1200,
                "You can Special Summon this card (from your hand) by discarding 1 card.",
                4300,"LDK2-ENY15");
        new MonsterCard("Command Knight",4,"Fire","Warrior",
                "Effect",1000,1000,
                "All Warrior-Type monsters you control gain 400 ATK. If you control another monster, monsters your opponent controls cannot target this card for an attack.",
                2100,"LDK2-ENJ20");
        new MonsterCard("Battle Ox", 4, "EARHT", "Beast-Warrior",
                "Normal", 1700, 1000,
                "A monster with tremendous power, it destroys enemies with a swing of its axe.,",
                2900, "SS02-ENA02");
        new MonsterCard("Axe Raider", 4, "EARHT", "Warrior",
                "Normal", 1700,1150,
                "An axe-wielding monster of tremendous strength and agility.",
                3100, "LCJW-EN007");
        new MonsterCard("Horn Imp", 4, "DARK", "Fiend",
                "Normal", 1300,100,
                "A small fiend that dwells in the dark, its single horn makes it a formidable opponent.",
                2500, "");
        new MonsterCard("Silver Fang", 3, "EARTH","Beast",
                "Normal", 1200,800,
                "A snow wolf that's beautiful to the eye, but absolutely vicious in battle.",
                1700, "LCYW-EN004");
        new MonsterCard("Fireyarou", 4, "FIRE","Pyro",
                "Normal",1300,1000,
                "A malevolent creature wrapped in flames that attacks enemies with intense fire.",
                2500, "AP08-EN015");
        new MonsterCard("Curtain of the dark ones", 2,"DARK","Spellcaster",
                "Normal", 600, 500,
                "A curtain that a spellcaster made, it is said to raise a dark power.",
                700,"AP03-EN014");
        new MonsterCard("Feral Imp",4,"DARK","Fiend",
                "Normal", 1300,1400,
                "A playful little fiend that lurks in the dark, waiting to attack an unwary enemy.",
                2800,"OP05-EN015");
        new MonsterCard("Dark magician",7,"DARK","Spellcaster",
                "Normal", 2500, 2100,
                "The ultimate wizard in terms of attack and defense.",
                8300,"YGLD-ENB02");
        new MonsterCard("Wattkid",3, "LIGHT", "Thunder",
                "Normal", 1000,500,
                "A creature that electrocutes opponents with bolts of lightning.",
                1300,"EU04-EN012");
        new MonsterCard("Baby dragon",3,"WIND", "Dragon",
                "Normal", 1200,700,
                "Much more than just a child, this dragon is gifted with untapped power.",
                1600,"DLGI-EN033");
        new MonsterCard("Hero of the east",3,"EARTH","Warrior",
                "Normal",1100,1000,
                "Feel da strength ah dis sword-swinging samurai from da Far East.",
                1700, "LCJW-EN019");
        new MonsterCard("Battle warrior", 3,"EARTH","Warrior",
                "Normal",700,1000,
                "A warrior that fights with his bare hands!!!",
                1300,"NUMH-EN025");
        new MonsterCard("Crawling dragon",5,"EARTH","Dragon",
                "Normal",1600,1400,
                "This weakened dragon can no longer fly, but is still a deadly force to be reckoned with.",
                3900, "MRD-EN012");
        new MonsterCard("Flame manipulator",3, "FIRE","Spellcaster",
                "Normal",900,1000,
                "This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\".",
                1500, "LOB-E012");
        new MonsterCard("Blue-Eyes white dragon",8, "LIGHT","Dragon",
                "Normal", 3000,2500,
                "This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale.",
                11300,"LC01-EN004");
        new MonsterCard("Crab Turtle",8,"WATER", "Aqua",
                "Ritual",2550,2500,
                "This monster can only be Ritual Summoned with the Ritual Spell Card,Turtle Oath\". You must also offer monsters whose total Level Stars equal 8 or more as a Tribute from the field or your hand.",
                10200,"SRI-069");
        new MonsterCard("Skull Guardian",7, "LIGHT","Warrior",
                "Ritual",2050,2500,
                "This monster can only be Ritual Summoned with the Ritual Spell Card,\"Novox's Prayer\". You must also offer monsters whose total Level Stars equal 7 or more as a Tribute from the field or your hand.",
                7900,"");
        new MonsterCard("Slot Machine",7,"DARK","Machine",
                "Normal",2000,2300,
                "The machine's ability is said to vary according to its slot results.",
                7500,"SBSC-EN025");
        new MonsterCard("Haniwa",2,"EARTH","Rock",
                "Normal",500,500,
                "An earthen figure that protects the tomb of an ancient ruler.",
                600,"TP7-EN016");
        new MonsterCard("Bitron",2,"EARTH","Cyberse",
                "Normal",200,2000,
                "A new species found in electronic space. There's not much information on it.",
                1000,"USI8-EN005");
        new MonsterCard("Leotron",4,"EARTH","Cyberse",
                "Normal",2000,0,
                "A territorial electronic monster that guards its own domain.",
                2500,"USI8-EN001");
        new MonsterCard("Alexandrite Dragon",4,"LIGHT","Dragon",
                "Normal",2000,100,
                "Many of the czars' lost jewels can be found in the scales of this priceless dragon. Its creator remains a mystery, along with how they acquired the imperial treasures. But whosoever finds this dragon has hit the jackpot... whether they know it or not.",
                2600,"LDK2-ENK12");
        new MonsterCard("Warrior Dai Grepher",4,"EARTH","Warrior",
                "Normal",1700,1600,
                "The warrior who can manipulate dragons. Nobody knows his mysterious past.",
                3400,"SBAD-EN035");
        new MonsterCard("Dark Blade",4,"DARK","Warrior",
                "Normal",1800,1500,
                "They say he is a dragon-manipulating warrior from the dark world. His attack is tremendous, using his great swords with vicious power.",
                3500,"YSI4-EN005");
        new MonsterCard("Wattaildragon",6,"LIGHT","Dragon",
                "Normal",2500,1000,
                "Capable of indefinite flight. Attacks by wrapping its body with electricity and ramming into opponents. IMPORTANT: Capturing the \"Wattaildragon\" is forbidden by the Ancient Rules and is a Level 6 offense, the minimum sentence for which is imprisonment for no less than 2500 heliocycles.",
                5800,"YSI4-EN001");
        new MonsterCard("Spiral Serpent",8,"WATER","Sea Serpent",
                "Normal",2900,2900,
                "When huge whirlpools lay cities asunder, it is the hunger of this sea serpent at work. No one has ever escaped its dreaded Spiral Wave to accurately describe the terror they experienced.",
                11700,"SDSI-EN007");
    }
}