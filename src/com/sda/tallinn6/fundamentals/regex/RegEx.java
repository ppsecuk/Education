package com.sda.tallinn6.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegEx {
    public static boolean isMatch(String regex, String text){
        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(text);
        int matches = 0;
        while (matcher.find()){
            matches++;
        }
        return matches > 0;
    }

    public static void main(String[] args) {
        System.out.println(" AbcDef .cD - dot mean it's searchin any characters");
        System.out.println(isMatch(".cD", "AbcDef"));
        System.out.println(isMatch("cD.", "AbcDef"));

        System.out.println(isMatch("[zyx]Blabla", "xBlaBala")); // it searches for zBlabla, yBlabla or xBlabla

    }
}
