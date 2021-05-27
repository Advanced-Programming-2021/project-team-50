package controller;

import view.WelcomeMenu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private static final ArrayList<User> allUsers;

    static {
        allUsers = new ArrayList<>();
    }

    private String nickname;
    private String username;
    private String password;
    private int score;

    public User(String nickname, String username, String password, int score) {
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.score = score;

        allUsers.add(this);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static boolean isUsernameUnique(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }
        return true;
    }

    public static boolean doesUsernameExists(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassword(String username, String password) {
        for (User user : allUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                if (user.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkPasswordPattern(String password) {
        Pattern passwordPattern = Pattern.compile("[0-9]{1,3}[A-Z][a-z]{5,10}");
        Matcher checkPassword = passwordPattern.matcher(password);

        if (checkPassword.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static User getUser(String username, String password) {
        for (User user : allUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }

    public static User getUserByUsername(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }

    public static boolean isNicknameUnique(String name) {
        for (User user : allUsers) {
            if (user.getNickname().equals(name)) {
                return false;
            }
        }
        return true;
    }
}