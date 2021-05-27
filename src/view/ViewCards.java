package view;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static model.EffectiveMonsters.*;
import static model.NormalMonsters.*;
import static model.Cards.*;
import static model.EffectiveMonster.*;
import static model.NormalMonster.*;
import static model.NormalSpellsAndTraps.*;
import static model.NormalSpells.*;

public class ViewCards {

    private ViewCards(Scanner scanner) {
        this.scanner = scanner;
    }

    private static ViewCards instance;
    private Scanner scanner;

    public static ViewCards getInstance(Scanner scanner) {
        if (instance == null) {
            instance = new ViewCards(scanner);
        }
        instance.scanner = scanner;
        return instance;
    }

    public static void showCardInfo(String input) {
        String[] line2 = input.split(" ");
        line2 = line2[2].split("<");
        line2 = line2[1].split(">");
        name = line2[0];
        showCard(name);

    }

    public ArrayList<String> ListOfCardsInfo = new ArrayList<>();
    public HashMap<String, String> card = new HashMap<>();

    public static void showCard(String name) { // delete String cardInfo as an input
        Cards cards = new Cards();
        if (!allCardsName.contains(name)) {
            System.out.println("Invalid card name!");
        } else if (cards.allMonsterCardsName.contains(name)) {
            switch (name) {
                case "CommandKnight":
                    CommandKnight.showCardInfo();
                case "YomiShip":
                    YomiShip.showCardInfo();
                case "Suijin":
                    Suijin.showCardInfo();
                case "ManEaterBug":
                    ManEaterBug.showCardInfo();
                case "GateGuardian":
                    GateGuardian.showCardInfo();
                case "Scanner":
                    Scannner.showCardInfo();
                case "Marshmallon":
                    Marshmallon.showCardInfo();
                case "BeastKingBarbaros":
                    BeastKingBarbaros.showCardInfo();
                case "TexChanger":
                    TexChanger.showCardInfo();
                case "TheCalculator":
                    TheCalculator.showCardInfo();
                case "MirageDragon":
                    MirageDragon.showCardInfo();
                case "HeraldOfCreation":
                    HeraldOfCreation.showCardInfo();
                case "ExploderDragon":
                    ExploderDragon.showCardInfo();
                case "TerratigerTheEmpowredWorrier":
                    TerratigerTheEmpowredWorrier.showCardInfo();
                case "TheTricky":
                    TheTricky.showCardInfo();
                case "BattleOx":
                    BattleOx.showCardInfo();
                case "AxeRaider":
                    AxeRaider.showCardInfo();
                case "HornImp":
                    HornImp.showCardInfo();
                case "SilverFang":
                    SilverFang.showCardInfo();
                case "Fireyarou":
                    Fireyarou.showCardInfo();
                case "CurtainOfDarkOnes":
                    CurtainOfDarkOnes.showCardInfo();
                case "FeralImp":
                    FeralImp.showCardInfo();
                case "DarkMagician":
                    DarkMagician.showCardInfo();
                case "Wattkid":
                    Wattkid.showCardInfo();
                case "BabyDragon":
                    BabyDragon.showCardInfo();
                case "HeroOfTheEast":
                    HeroOfTheEast.showCardInfo();
                case "BattleWarrior":
                    BattleWarrior.showCardInfo();
                case "CrawlingDragon":
                    CrawlingDragon.showCardInfo();
                case "FlameManipulator":
                    FlameManipulator.showCardInfo();
                case "BlueEyesWhiteDragon":
                    BlueEyesWhiteDragon.showCardInfo();
                case "CrabTurtle":
                    CrabTurtle.showCardInfo();
                case "SkullGuardian":
                    SkullGuardian.showCardInfo();
                case "SlutMachine":
                    SlutMachine.showCardInfo();
                case "Haniwa":
                    Haniwa.showCardInfo();
                case "Bitron":
                    Bitron.showCardInfo();
                case "Leotron":
                    Leotron.showCardInfo();
                case "AlexandriteDragon":
                    AlexandriteDragon.showCardInfo();
                case "WarriorDaiGrepher":
                    WarriorDaiGrepher.showCardInfo();
                case "DarkBlade":
                    DarkBlade.showCardInfo();
                case "Wattialdragon":
                    Wattialdragon.showCardInfo();
                case "SpiralSerpent":
                    SpiralSerpent.showCardInfo();
            }
        } else if (cards.allTrapCardsName.contains(name)) {
            switch (name) {
                case "MagicCylinder":
                    NormalTraps.MagicCylinder.showCardInfo();
                case "MirrorForce":
                    NormalTraps.MirrorForce.showCardInfo();
                case "MindCrush":
                    NormalTraps.MindCrush.showCardInfo();
                case "TrapHole":
                    NormalTraps.TrapHole.showCardInfo();
                case "TorrentialTribute":
                    NormalTraps.TorrentialTribute.showCardInfo();
                case "TimeSeal":
                    NormalTraps.TimeSeal.showCardInfo();
                case "NegateAttack":
                    NormalTraps.NegateAttack.showCardInfo();
                case "SolemnWarning":
                    NormalTraps.SolemnWarning.showCardInfo();
                case "MagicJammer":
                    NormalTraps.MagicJammer.showCardInfo();
                case "CallOfTheHaunted":
                    NormalTraps.CallOfTheHaunted.showCardInfo();
            }
        } else if (cards.allSpellCardsName.contains(name)) {
            switch (name) {
                case "MonsterReborn":
                    MonsterReborn.showCardInfo();
                case "TerraForming":
                    TerraForming.showCardInfo();
                case "PotOfGreed":
                    PotOfGreed.showCardInfo();
                case "Raigeki":
                    Raigeki.showCardInfo();
                case "ChangeOfHeart":
                    ChangeOfHeart.showCardInfo();
                case "HarpiesFeatherDuster":
                    HarpiesFeatherDuster.showCardInfo();
                case "SwordOfRevealingLight":
                    SwordOfRevealingLight.showCardInfo();
                case "DarkHole":
                    DarkHole.showCardInfo();
                case "SupplySquad":
                    SupplySquad.showCardInfo();
                case "SpellAbsorption":
                    SpellAbsorption.showCardInfo();
                case "AdvancedRitualArt":
                    RitualSpells.AdvancedRitualArt.showCardInfo();
                case "Umiiruka":
                    FieldSpells.Umiiruka.showCardInfo();
                case "ClosedForest":
                    FieldSpells.ClosedForest.showCardInfo();
                case "Forest":
                    FieldSpells.Forest.showCardInfo();
                case "Yami":
                    FieldSpells.Yami.showCardInfo();
                case "MessengerOfPeace":
                    ContinuousSpells.MessengerOfPeace.showCardInfo();
                case "TwinTwisters":
                    QuickPlaySpells.TwinTwisters.showCardInfo();
                case "MysticalSpaceTyphoon":
                    QuickPlaySpells.MysticalSpaceTyphoon.showCardInfo();
                case "RingOfDefence":
                    QuickPlaySpells.RingOfDefence.showCardInfo();
                case "SwordOfDarkDestruction":
                    EquipSpells.SwordOfDarkDestruction.showCardInfo();
                case "BlackPendant":
                    EquipSpells.BlackPendant.showCardInfo();
                case "UnitedWeStand":
                    EquipSpells.UnitedWeStand.showCardInfo();
                case "MagnumShield":
                    EquipSpells.MagnumShield.showCardInfo();
            }
        }
/*
    public String showCardInfo(HashMap card) {
    }

    public String showAndIntroduceCardsToTheUser(ArrayList cardName) {
    }

 */
    }
}