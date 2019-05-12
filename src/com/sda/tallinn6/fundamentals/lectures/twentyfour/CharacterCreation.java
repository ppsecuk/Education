package com.tallinn.four.lectures.twentyfour;

/***
 * validate name
 * validate surname
 *
 */
public class CharacterCreation {

    public boolean validateName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            System.out.println("First name is not suitable. You did not enter any name");
            return false;
        }

        if (firstName.contains(" ")) {
            System.out.println("First name must not contain any space");
            return false;
        }
        String filteredName = eraseNonLetters(firstName);
        if (!firstName.equalsIgnoreCase(filteredName)) {
            System.out.println("First name is not suitable. No numbers/Punctuations");
            return false;
        }
        return true;
    }

    public boolean validateSurname(String surname){
        if (surname == null || surname.isEmpty()) {
            System.out.println("Surname is not suitable. You did not enter any name");
            return false;
        }
        String filteredName = eraseNonLetters(surname);
        if (!surname.equalsIgnoreCase(filteredName)) {
            System.out.println("Surname is not suitable. No numbers/Punctuations");
            return false;
        }
        return true;
    }

    private String eraseNonLetters(String word){
        //Original value Murat1!
        String result = word.replaceAll("\\d",""); //Murat!
        result = result.replaceAll("\\p{Punct}",""); //Murat
        return result;
    }




}
