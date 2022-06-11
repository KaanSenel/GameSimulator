package com.player;

import com.game.Game;

import java.util.ArrayList;

public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private long validationNumber;
    private int birthdayYear;
    ArrayList<Game> gameList=new ArrayList<>();

    public Player(int id, String firstName, String lastName, long validationNumber, int birthdayYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.validationNumber = validationNumber;
        this.birthdayYear = birthdayYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getValidationNumber() {
        return validationNumber;
    }

    public void setValidationNumber(long validationNumber) {
        this.validationNumber = validationNumber;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public ArrayList<Game> getGameList() {
        return gameList;
    }

    public void setGameList(Game game) {
        this.gameList.add(game);
    }
}
