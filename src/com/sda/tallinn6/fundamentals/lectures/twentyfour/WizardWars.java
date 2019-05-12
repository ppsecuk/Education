package com.tallinn.four.lectures.twentyfour;

import java.util.Random;
import java.util.Scanner;

public class WizardWars {

    public static void main(String[] args) {
        CharacterCreation characterCreation = new CharacterCreation();
        System.out.println("Welcome to Wizard Wars. Lets create our character");
        Wizard player = new Wizard();
        Scanner scanner = new Scanner(System.in);

        while (player.getName() == null || player.getName().isEmpty()) {
            System.out.println("Please enter your characters' first name");
            String incomingFirstName = scanner.nextLine();
            if (characterCreation.validateName(incomingFirstName)) {
                player.setName(incomingFirstName);
            }
        }
        while (player.getSurname() == null || player.getSurname().isEmpty()) {
            System.out.println("Please enter your characters' surname");
            String incomingSurname = scanner.nextLine();
            if (characterCreation.validateSurname(incomingSurname)) {
                player.setSurname(incomingSurname);
            }
        }

        System.out.println("So " + player.getName() + " " + player.getSurname() + " Are you ready to dieee!");





//-----------------------------------------------------------------------------------------------------------------------------------
        WizardShop wizardShop = new WizardShop();
        System.out.println("Welcome to Wizard Shop. " + "Can I take your order? Write spell Name to buy.");
        wizardShop.printAllSpells();


        String incomingSpell = "";
        incomingSpell = scanner.nextLine();
        while (!incomingSpell.equalsIgnoreCase("done")) {
            //Checks and buys the spell for the wizard. Assigns to wizard
            //memory.
            wizardShop.buy(incomingSpell, player);
            System.out.println("Do you want to buy some more? " + "Write \"done\" if you are finished.");
            incomingSpell = scanner.nextLine();
        }
        System.out.println(player.getListOfSpellsWizardKnows());
//-----------------------------------------------------------------------------------------------------------------------------------
        Opponent opponent = new Opponent();
        System.out.println("Let the Duel Begin.");
        Spells spells = new Spells();


        while (player.getHealth() > 0 && opponent.getHealth() > 0) {

            System.out.println("Player Health: " + player.getHealth() + " Opponent Health: " + opponent.getHealth());

            Spell spellPlayer;
            Spell opponentSpell;

            System.out.println("Cast your Spell Player");
            incomingSpell = scanner.nextLine();
            if (player.getListOfSpellsWizardKnows().contains(incomingSpell)) {
                spellPlayer = spells.getSpell(incomingSpell);
            } else {
                System.out.println("You do not know this spell");
                //return to beginning to casting...
                continue;
            }

            String opponentIncomingSpell = opponent.decideSpellName(player, opponent);

            opponentSpell = spells.getSpell(opponentIncomingSpell);


            //Decide player or opponent spell will act first.
            boolean isPlayerFirst = false;

            if (spellPlayer.getSpeedRate() > opponentSpell.getSpeedRate()) {
                isPlayerFirst = false;
            } else if (spellPlayer.getSpeedRate() < opponentSpell.getSpeedRate()) {
                isPlayerFirst = true;
            } else {
                Random random = new Random();
                int randomChance = random.nextInt(2);
                if (randomChance == 0) {
                    isPlayerFirst = true;
                } else {
                    isPlayerFirst = false;
                }
            }


            if (isPlayerFirst) {
                boolean isFinished = actionPlayer(incomingSpell, player, opponent);
                if (isFinished) {
                    break;
                }
                isFinished = actionOpponent(opponentIncomingSpell, player, opponent);
                if (isFinished) {
                    break;
                }
            } else {
                boolean isFinished = actionOpponent(opponentIncomingSpell, player, opponent);
                if (isFinished) {
                    break;
                }
                isFinished = actionPlayer(incomingSpell, player, opponent);
                if (isFinished) {
                    break;
                }
            }
            System.out.println("---------------------------------------");
        }

        //Duel is over
        System.out.println("The duel is over");
        if (opponent.getHealth() <= 0) {
            System.out.println("You won");
        } else {
            System.out.println("You lost.");
        }
//-----------------------------------------------------------------------------------------------------------------------------------


    }

    private static boolean actionPlayer(String incomingSpell, Wizard player, Wizard opponent) {
        System.out.println("Player is casting "+incomingSpell);
        SpellUtilities spellUtilities = new SpellUtilities();
        int playerValue = spellUtilities.cast(incomingSpell);

        if (playerValue < 0) {
            System.out.println("Player spell caused damage: " + playerValue);
            int remainingOpponentHealth = opponent.getHealth() + playerValue;
            opponent.setHealth(remainingOpponentHealth);
            if (remainingOpponentHealth <= 0) {
                return true;
            }
        } else if (playerValue > 0) {
            System.out.println("Player spell healed: " + playerValue);
            int remainingPlayerHealth = player.getHealth() + playerValue;
            if (remainingPlayerHealth > 100) {
                player.setHealth(100);
            } else {
                player.setHealth(remainingPlayerHealth);
            }
        }
        return false;
    }

    private static boolean actionOpponent(String incomingSpell, Wizard player, Wizard opponent) {
        System.out.println("Opponent is casting "+incomingSpell);
        SpellUtilities spellUtilities = new SpellUtilities();
        //Player is alive and the opponent did not die so lets do the opponent spell.
        int opponentValue = spellUtilities.cast(incomingSpell);
        if (opponentValue < 0) {
            System.out.println("Opponent spell caused damage: " + opponentValue);
            int remainingPlayerHealth = player.getHealth() + opponentValue;
            player.setHealth(remainingPlayerHealth);
            if (remainingPlayerHealth <= 0) {
                return true;
            }
        } else if (opponentValue > 0) {
            System.out.println("Opponent spell healed: " + opponentValue);
            int remainingOpponentHealth = opponent.getHealth() + opponentValue;
            if (remainingOpponentHealth > 100) {
                opponent.setHealth(100);
            } else {
                opponent.setHealth(remainingOpponentHealth);
            }
        }
        return false;
    }
}
