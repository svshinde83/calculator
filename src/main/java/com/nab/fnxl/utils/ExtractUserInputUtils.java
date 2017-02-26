package com.nab.fnxl.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 * <p>
 * Helper utility functions class.
 */
@Component
public class ExtractUserInputUtils {

    /**
     * Extracts user input in a list of logical groups to compute
     * <p>
     * Checks if operation requested is
     * Substraction or
     * Division or
     * Multiplication or
     * Addition
     *
     * @param args accepts input in a String
     * @return List of operands and operation - operand - operand - operation
     */
    public List<String> getStringsDelimited(String args) {

        List<String> valuesAsList = new ArrayList<>(3);
        boolean containsSubstraction = args.contains("-");

        String[] valuesArray;
        if (containsSubstraction) {
            valuesArray = args.split("-");
            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("-");
        }

        boolean containsDivision = args.contains("/");
        if (containsDivision) {
            valuesArray = args.split("[/]+");

            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("/");
        }
        boolean containsMultiplication = args.contains("*");
        if (containsMultiplication) {
            valuesArray = args.split("\\*");
            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("*");
        }

        boolean containsAddition = args.contains("+");

        if (containsAddition) {
            valuesArray = args.split("\\+");
            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("+");
        }


        return valuesAsList;
    }

    /**
     * @param valuesAsList to return
     * @param valuesArray  accepts to convert
     */
    public void extractToList(List<String> valuesAsList, String[] valuesArray) {
        for (String aValues1 : valuesArray) {
            valuesAsList.add(aValues1.trim());
        }
    }
}
