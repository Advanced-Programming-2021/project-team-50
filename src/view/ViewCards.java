package view;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;

import static model.EffectiveMonsters.*;
import static model.NormalMonsters.*;
import static model.Cards.*;
import static model.EffectiveMonster.*;
import static model.NormalMonster.*;

public class ViewCards {
    public ArrayList<String> ListOfCardsInfo = new ArrayList<>();
    public HashMap<String, String> card = new HashMap<>();

    public String showCard(String name) { // delete String cardInfo as an input
        Cards cards = new Cards();
        if (!cards.allCardsName.contains(name)) {
            return "Invalid card name!";
        }
        else if (cards.allMonsterCardsName.contains(name)) {
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
                    Scanner.showCardInfo();
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
    }
        else if ()
/*
    public String showCardInfo(HashMap card) {
    }

    public String showAndIntroduceCardsToTheUser(ArrayList cardName) {
    }

 */
}