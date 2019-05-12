package com.tallinn.four.lectures.twentyfour;


import java.util.Random;

public class SpellUtilities {
    Random random = new Random();
    Spells spells = new Spells();


    private int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            System.out.println("max must be greater than min");
            return 0;
        }
        //for 10 25 information it will be nextInt(16) = means that it return numbers including
        //0 to 15
        int numberGenerated = random.nextInt((max - min) + 1);
        return numberGenerated + min;

    }

    public int cast(String nameOfTheSpell){
        if(nameOfTheSpell==null || nameOfTheSpell.isEmpty()){
            System.out.println("There is no spell");
            return 0;
        }
        if(nameOfTheSpell.equals("Lacarnum Inflamarae") || nameOfTheSpell.equals("Lumos Solem") ||
                nameOfTheSpell.equals("Everte Statum") || nameOfTheSpell.equals("Arania Exumai")
                ||    nameOfTheSpell.equals("Avada Kedavra")
        ){
            return castDamage(nameOfTheSpell);
        }else if(nameOfTheSpell.equals("Vulnera Sanentur")){
            return castHealing(nameOfTheSpell);
        }else
        {
            System.out.println("You panicked and did not make any sense");
            return 0;
        }
    }

    /**
     * Generic damage creation.
     * @param nameOfSpell
     * @return
     */
    public int castDamage(String nameOfSpell){
        Spell castedSpell = spells.getSpellHashMap().get(nameOfSpell);

        int castRate = random.nextInt(100);
        if (castRate < castedSpell.getSuccessRate()) {
            System.out.println(castedSpell.getSpellWord()+" casted");
            if(castedSpell.getMaxSpellPower()==castedSpell.getMinSpellPower()){
                return (-1)*castedSpell.getMaxSpellPower();
            }else{
                return (-1)*getRandomNumberInRange(castedSpell.getMinSpellPower(),
                        castedSpell.getMaxSpellPower());
            }
         }
        System.out.println(castedSpell.getSpellWord()+" Casting failed.");
        return 0;
    }

    public int castHealing(String nameOfSpell){
        Spell castedSpell = spells.getSpellHashMap().get(nameOfSpell);

        int castRate = random.nextInt(100);
        boolean firstTime=true;
        int totalHealing = 0;
        int successRate=castedSpell.getSuccessRate();
        while(castRate<successRate){
            /**
             * Successful Spell cast
             */
            if(firstTime){
                firstTime=false;
                System.out.println(castedSpell.getSpellWord()+" casted");
            }
            int healing = getRandomNumberInRange(castedSpell.getMinSpellPower(),castedSpell.getMaxSpellPower());
            totalHealing = totalHealing + healing;
            System.out.println("Healing: "+healing);
            castRate = random.nextInt(100);
            successRate = successRate - getRandomNumberInRange(5,10);
        }
        if(totalHealing==0){
            System.out.println(castedSpell.getSpellWord()+" casting failed");
            return totalHealing;
        }else{
            return totalHealing;
        }
    }




}
