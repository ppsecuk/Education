package com.tallinn.four.lectures.twentyfour;


import java.util.HashMap;

public class Spells {
    HashMap<String,Spell> spellHashMap = new HashMap<>();

    public Spells(){
        Spell insertThis = new Spell("Lacarnum Inflamarae",25,10,16,70,1);
        spellHashMap.put("Lacarnum Inflamarae",insertThis);
        spellHashMap.put("Lumos Solem",new Spell("Lumos Solem",45,17,23,65,2));
        spellHashMap.put("Everte Statum",new Spell("Everte Statum",45,23,29,60,3));
        spellHashMap.put("Arania Exumai",new Spell("Arania Exumai",50,30,36,55,4));
        spellHashMap.put("Avada Kedavra",new Spell("Avada Kedavra",100,100,100,10,5));
        spellHashMap.put("Vulnera Sanentur",new Spell("Vulnera Sanentur",25,10,20,70,1));
    }

    public HashMap<String, Spell> getSpellHashMap() {
        return spellHashMap;
    }

    public void setSpellHashMap(HashMap<String, Spell> spellHashMap) {
        this.spellHashMap = spellHashMap;
    }

    public Spell getSpell(String spellName){
        Spell spell = spellHashMap.get(spellName);
        if(spell==null){
            System.out.println("Spell does not exist");
            return null;
        }else{
            return spell;
        }

    }
}
