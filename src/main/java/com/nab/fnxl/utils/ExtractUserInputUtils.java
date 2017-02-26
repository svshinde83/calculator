package com.nab.fnxl.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public class ExtractUserInputUtils {

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
            valuesArray = args.split("/+");
            extractToList(valuesAsList, valuesArray);
            valuesAsList.add("+");
        }


        return valuesAsList;
    }

    private void extractToList(List<String> valuesAsList, String[] valuesArray) {
        for (String aValues1 : valuesArray) {
            valuesAsList.add(aValues1.trim());
        }
    }
}
