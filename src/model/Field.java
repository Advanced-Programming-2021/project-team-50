package model;

import java.util.HashMap;

public class Field {
public String myNickName;
public String myLifePoint;
public String opponentNickName;
public String opponentLifePoint;
    // at the bottom of the page we should have our nickname and life point
    HashMap<String, Integer> myInfo = new HashMap<>();
    HashMap<String,Integer> opponentInfo=new HashMap<>();

    public HashMap<String, Integer> getMyInfo() {
        return myInfo;
    }

    public void setMyInfo(HashMap<String, Integer> myInfo) {
        this.myInfo = myInfo;
    }

    public HashMap<String, Integer> getOpponentInfo() {
        return opponentInfo;
    }

    public void setOpponentInfo(HashMap<String, Integer> opponentInfo) {
        this.opponentInfo = opponentInfo;
    }

    //my info
    public String getMyNickName() {
        return myNickName;
    }

    public void setMyNickName(String myNickName) {
        this.myNickName = myNickName;
    }

    public String getMyLifePoint() {
        return myLifePoint;
    }

    public void setMyLifePoint(String myLifePoint) {
        this.myLifePoint = myLifePoint;
    }
    //opponent info


    public String getOpponentNickName() {
        return opponentNickName;
    }

    public void setOpponentNickName(String opponentNickName) {
        this.opponentNickName = opponentNickName;
    }

    public String getOpponentLifePoint() {
        return opponentLifePoint;
    }

    public void setOpponentLifePoint(String opponentLifePoint) {
        this.opponentLifePoint = opponentLifePoint;
    }
}