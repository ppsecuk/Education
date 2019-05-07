package com.tallinn.four.lectures.seventeen;

public class ExamQuestion {
    public static void main(String[] args) {
        String someString = null;
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.print(someString);
    }

    void print(String someString){

        if(someString.equalsIgnoreCase("Heidi") && someString!=null){
            System.out.println(someString.toLowerCase());
        }
        if(someString!=null && someString.equalsIgnoreCase("Heidi")){
            System.out.println(someString.toLowerCase());
        }



    }
}
