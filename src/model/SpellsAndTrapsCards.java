package model;

import java.util.Scanner;

public class SpellsAndTrapsCards {

    private SpellsAndTrapsCards(Scanner scanner) {
        this.scanner = scanner;
    }

    private static SpellsAndTrapsCards instance;
    private Scanner scanner;
    private SpellAndTrapCard card;

    public void addCard() {
        new SpellAndTrapCard("Trap Hole","Trap","Normal",
                "When your opponent Normal or Flip Summons 1 monster with 1000 or more ATK: Target that monster; destroy that target.",
                "Unlimited",2000);
        new SpellAndTrapCard("Mirror Force","Trap","Normal",
                "When an opponent's monster declares an attack: Destroy all your opponent's Attack Position monsters.",
                "Unlimited",2000);
        new SpellAndTrapCard("Magic Cylinder","Trap","Normal",
                "When an opponent's monster declares an attack: Target the attacking monster; negate the attack, and if you do, inflict damage to your opponent equal to its ATK.",
                "Unlimited",2000);
        new SpellAndTrapCard("Mind Crush","Trap","Normal",
                "Declare 1 card name; if that card is in your opponent's hand, they must discard all copies of it, otherwise you discard 1 random card.",
                "Unlimited",2000);
        new SpellAndTrapCard("Torrential Tribute","Trap","Normal",
                "When a monster(s) is Summoned: Destroy all monsters on the field.",
                "Unlimited",2000);
        new SpellAndTrapCard("Time Seal","Trap","Normal",
                "Skip the Draw Phase of your opponent's next turn.",
                "Limited", 2000);
        new SpellAndTrapCard("Negate Attack", "Trap","Counter",
                "When an opponent's monster declares an attack: Target the attacking monster; negate the attack, then end the Battle Phase.",
                "Unlimited",3000);
        new SpellAndTrapCard("Solemn Warning","Trap","Counter",
                "When a monster(s) would be Summoned, OR when a Spell/Trap Card, or monster effect, is activated that includes an effect that Special Summons a monster(s): Pay 2000 LP; negate the Summon or activation, and if you do, destroy it.",
                "Unlimited",3000);
        new SpellAndTrapCard("Magic Jamamer","Trap","Counter",
                "When a Spell Card is activated: Discard 1 card; negate the activation, and if you do, destroy it.",
                "Unlimited",3000);
        new SpellAndTrapCard("Call of The Haunted","Trap","Continuous",
                "Activate this card by targeting 1 monster in your GY; Special Summon that target in Attack Position. When this card leaves the field, destroy that monster. When that monster is destroyed, destroy this card.",
                "Unlimited",3500);
        new SpellAndTrapCard("Vanity's Emptiness","Trap","Continuous",
                "Neither player can Special Summon monsters. If a card is sent from the Deck or the field to your Graveyard: Destroy this card.",
                "Unlimited",3500);
        new SpellAndTrapCard("Wall of Revealing Light","Trap","Continuous",
                "Activate by paying any multiple of 1000 Life Points. Monsters your opponent controls cannot attack if their ATK is less than or equal to the amount you paid.",
                "Unlimited",3500);
        new SpellAndTrapCard("Monster Reborn","Spell", "Normal",
                "Target 1 monster in either GY; Special Summon it.",
                "Limited",2500);
        new SpellAndTrapCard("Terraforming","Spell", "Normal",
                "Add 1 Field Spell from your Deck to your hand.",
                "Limited",2500);
        new SpellAndTrapCard("Pot of Greed","Spell", "Normal",
                "Draw 2 cards.",
                "Limited",2500);
        new SpellAndTrapCard("Raigeki","Spell", "Normal",
                "Destroy all monsters your opponent controls.",
                "Limited",2500);
        new SpellAndTrapCard("Change of Heart","Spell", "Normal",
                "Target 1 monster your opponent controls; take control of it until the End Phase.",
                "Limited",2500);
        new SpellAndTrapCard("Swords of Revealing Light","Spell", "Normal",
                "After this card's activation, it remains on the field, but destroy it during the End Phase of your opponent's 3rd turn. When this card is activated: If your opponent controls a face-down monster, flip all monsters they control face-up. While this card is face-up on the field, your opponent's monsters cannot declare an attack.",
                "Unlimited",2500);
        new SpellAndTrapCard("Harpie's Feather Duster","Spell", "Normal",
                "Destroy all Spells and Traps your opponent controls.",
                "Limited",2500);
        new SpellAndTrapCard("Dark Hole","Spell", "Normal",
                "Destroy all monsters on the field.",
                "Unlimited",2500);
        new SpellAndTrapCard("Supply Squad","Spell", "Continuous",
                "Once per turn, if a monster(s) you control is destroyed by battle or card effect: Draw 1 card.",
                "Unlimited",4000);
        new SpellAndTrapCard("Spell Absorption","Spell", "Continuous",
                "Each time a Spell Card is activated, gain 500 Life Points immediately after it resolves.",
                "Unlimited",4000);
        new SpellAndTrapCard("Messenger of peace","Spell", "Continuous",
                "Monsters with 1500 or more ATK cannot declare an attack. Once per turn, during your Standby Phase, pay 100 LP or destroy this card.",
                "Unlimited",4000);
        new SpellAndTrapCard("Twin Twisters","Spell", "Quick-play",
                "Discard 1 card, then target up to 2 Spells/Traps on the field; destroy them.",
                "Unlimited",3500);
        new SpellAndTrapCard("Mystical space typhoon","Spell", "Quick-play",
                "Target 1 Spell/Trap on the field; destroy that target.",
                "Unlimited",3500);
        new SpellAndTrapCard("Ring of defense","Spell", "Quick-play",
                "When a Trap effect that inflicts damage is activated: Make that effect damage 0.",
                "Unlimited",3500);
        new SpellAndTrapCard("Yami","Spell", "Field",
                "All Fiend and Spellcaster monsters on the field gain 200 ATK/DEF, also all Fairy monsters on the field lose 200 ATK/DEF.",
                "Unlimited",4300);
        new SpellAndTrapCard("Forest","Spell", "Field",
                "All Insect, Beast, Plant, and Beast-Warrior monsters on the field gain 200 ATK/DEF.",
                "Unlimited",4300);
        new SpellAndTrapCard("Closed Forest","Spell", "Field",
                "All Beast-Type monsters you control gain 100 ATK for each monster in your Graveyard. Field Spell Cards cannot be activated. Field Spell Cards cannot be activated during the turn this card is destroyed.",
                "Unlimited",4300);
        new SpellAndTrapCard("Umiiruka","Spell", "Field",
                "Increase the ATK of all WATER monsters by 500 points and decrease their DEF by 400 points.",
                "Unlimited",4300);
        new SpellAndTrapCard("Sword of dark destruction","Spell", "Equip",
                "A DARK monster equipped with this card increases its ATK by 400 points and decreases its DEF by 200 points.",
                "Unlimited",4300);
        new SpellAndTrapCard("Black Pendant","Spell", "Equip",
                "The equipped monster gains 500 ATK. When this card is sent from the field to the Graveyard: Inflict 500 damage to your opponent.",
                "Unlimited",4300);
        new SpellAndTrapCard("United We Stand","Spell", "Equip",
                "The equipped monster gains 800 ATK/DEF for each face-up monster you control.",
                "Unlimited",4300);
        new SpellAndTrapCard("Magnum Shield","Spell", "Equip",
                "Equip only to a Warrior-Type monster. Apply this effect, depending on its battle position. ● Attack Position: It gains ATK equal to its original DEF. ● Defense Position: It gains DEF equal to its original ATK.",
                "Unlimited",4300);
        new SpellAndTrapCard("Advanced Ritual Art","Spell", "Ritual",
                "This card can be used to Ritual Summon any 1 Ritual Monster. You must also send Normal Monsters from your Deck to the Graveyard whose total Levels equal the Level of that Ritual Monster.",
                "Unlimited",3000);
    }
}
