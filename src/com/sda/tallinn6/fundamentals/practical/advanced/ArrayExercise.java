package com.sda.tallinn6.fundamentals.practical.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayExercise {
    public static void main(String[] args) {

        Double[] studentScores = {70D, 80D, 90D};
        String[] studentNames = {"John", "David", "Tomas"};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println(studentScores[i]);
        }

        //double sum = DoubleStream.of(studentScores).sum();
        //System.out.println("The sum is " + sum);

        List<String> arrayListOfNames = Arrays.asList(studentNames);
        List<Double> arrayListOfScores = Arrays.asList(studentScores);

    }
}
