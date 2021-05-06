 package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class User {
    public  String userName ;
    public String userPassword ;
    public String nickName ;
    public int score ;
    public static int userId ;   //static member is created which is shared across all instances of the class.

    //HashMap
    //// Add keys and values (userName,userPassword )
    HashMap<String, String> userLogInInfo  = new HashMap<String, String>();

    //may change   ???? how should we log in actually
    public String LogIn (String userName,String userPassword){
        // a bunch of set Xs
        HashMap<String,String> userLogInInfo =new HashMap<>();
        userLogInInfo.put(userName,userPassword);
        return userLogInInfo.toString();
    }

    /// To store the user info  -> use a hash set in controller

    //user profile Add keys and values  (nickName,userPassword)
    HashMap<String,String>  profile =new HashMap<>();
    public String profile (String nickName,String userPassword){
        HashMap<String,String> userLogInInfo =new HashMap<>();
        userLogInInfo.put(nickName,userPassword);
        return userLogInInfo.toString();
    }

    //is it for score itself?
    //add keys and values nickName and score
    HashMap<String, Integer> scoreBoard = new HashMap<String, Integer>();
    public  String scoreBoar (String nickName,int score){
        scoreBoard.put(nickName,score);
        return scoreBoard.toString();
    }




    //user Account set and check

    public String getUserName() {
        return userName;
    }
    public void setUserName(String cardName) {
        this.userName= userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String cardName) {
        this.userPassword= userPassword;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String cardName) {
        this.nickName= nickName;
    }

    public int getScore(){return score;}
    public void setScore(int score){this.score=score;}

    //Tostring method  to show user info to pass it to view

//    public String toString(){//overriding the toString() method
//        return userName +" "+userPassword+" "+nickName+" "+score+" "+userId;
//         }

}

