package com.tallinn.four.lectures.twentyfour;

import java.util.ArrayList;
import java.util.List;

public class Wizard {
    private int health = 100;
    private int money = 100;
    private String name;
    private String surname;
    private List<String> listOfSpellsWizardKnows = new ArrayList<>();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getListOfSpellsWizardKnows() {
        return listOfSpellsWizardKnows;
    }

    public void setListOfSpellsWizardKnows(List<String> listOfSpellsWizardKnows) {
        this.listOfSpellsWizardKnows = listOfSpellsWizardKnows;
    }
}
