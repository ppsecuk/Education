package com.tallinn.four.lectures.twentyfour;


import java.util.Random;

public class Opponent extends Wizard {

    public String decideSpellName(Wizard player, Wizard opponent) {
        /**
         * Task1: If health of opponent below 45
         * 50% change to cast healing
         * 50% there will be below decision
         * he will get players health
         * if playerHealth is below 11 he will castFlame
         * else if playerHealth is below 17 he will castLightening
         * else if playerHealth is below 23 he will castWind
         * else if playerHealth is below 30 he will castFireball
         * else if playerHealth is below 65 he will castDeath
         * else castHealing
         */
        //Lacarnum Inflamarae   Flame
        //Lumos Solem           Lightening
        //Everte Statum         Wind
        //Arania Exumai         Fireball
        //Avada Kedavra         Death
        //Vulnera Sanentur      Healing
        SpellUtilities spellUtilities = new SpellUtilities();
        Random random = new Random();
        if (opponent.getHealth() < 45) {
            int decisionRate = random.nextInt(100);
            if (decisionRate < 50) {
                return "Vulnera Sanentur";
            } else {
                int playerHealth = player.getHealth();

                if (playerHealth < 11) {
                    return "Lacarnum Inflamarae";
                } else if (playerHealth < 17) {
                    return "Lumos Solem";
                } else if (playerHealth < 23) {
                    return "Everte Statum";
                } else if (playerHealth < 30) {
                    return "Arania Exumai";
                } else if (playerHealth < 65) {
                    return "Avada Kedavra";
                } else {
                    return "Vulnera Sanentur";
                }
            }
        } else if (opponent.getHealth() > player.getHealth()) {
            /**
             *  Task2: If health of opponent bigger than the player
             *          25% change to castLightening
             *          25% to castFireball
             *          25% to castWind
             *          25% to castFlmae
             *
             */
            //Lacarnum Inflamarae   Flame
            //Lumos Solem           Lightening
            //Everte Statum         Wind
            //Arania Exumai         Fireball
            //Avada Kedavra         Death
            //Vulnera Sanentur      Healing
            int decisionRate = random.nextInt(100);
            if (decisionRate < 25) {
                return "Lacarnum Inflamarae";
            } else if (decisionRate < 50) {
                return "Lumos Solem";
            } else if (decisionRate < 75) {
                return "Everte Statum";
            }  else {
                return "Lumos Solem";
            }
        } else {
            /**
             *  Task3: rest of the conditions
             *          20% change to castLightening
             *          15% to castFireball
             *          20% to castWind
             *          25% to castFlame
             *          20% to cast healing
             */
            //Lumos Solem           Lightening
            //Arania Exumai         Fireball
            //Everte Statum         Wind
            //Lacarnum Inflamarae   Flame
            //Vulnera Sanentur      Healing
            int decisionRate = random.nextInt(100);
            if (decisionRate < 20) {
                return "Lumos Solem";
            } else if (decisionRate < 35) {
                return "Arania Exumai";
            } else if (decisionRate < 55) {
                return "Everte Statum";
            } else if (decisionRate < 80) {
                return "Lacarnum Inflamarae";
            } else {
                return "Vulnera Sanentur";
            }

        }
    }

}
