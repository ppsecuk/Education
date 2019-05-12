package com.tallinn.four.lectures.twentyfour;

import java.util.HashMap;

public class WizardShop {
    private HashMap<String,Integer> spellMap = new HashMap<>();
    public WizardShop(){
        spellMap.put("Lacarnum Inflamarae",25);
        spellMap.put("Lumos Solem", 45);
        spellMap.put("Everte Statum", 45);
        spellMap.put("Arania Exumai", 50);
        spellMap.put("Avada Kedavra", 100);
        spellMap.put("Vulnera Sanentur", 25);


    }

    public void printAllSpells(){
        System.out.println(spellMap);
    }

    public void buy(String requestedSpell,Wizard wizard){
        if(wizard.getListOfSpellsWizardKnows().contains(requestedSpell)){
            System.out.println("You already know this spell");
            return;
        }
        if(!spellMap.containsKey(requestedSpell)){
            System.out.println("This spell does not exist in the shop");
            return;
        }
        if(wizard.getMoney() < spellMap.get(requestedSpell)){
            System.out.println("The requested spell needs more money than you have");
            return;
        }

        System.out.println("You bought "+requestedSpell);
        int costOfSpell = spellMap.get(requestedSpell);
        int remainingMoney = wizard.getMoney()-costOfSpell;
        wizard.setMoney(remainingMoney);
        wizard.getListOfSpellsWizardKnows().add(requestedSpell);

    }






}
