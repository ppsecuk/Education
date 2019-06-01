package com.sda.tallinn6.fundamentals.practical.advanced;

public class JavaProgramUtilities {

    public static int countVowels(String str1)
    {
        int count = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
