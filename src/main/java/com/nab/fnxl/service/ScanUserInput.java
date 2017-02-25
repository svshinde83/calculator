package com.nab.fnxl.service;

import java.util.Scanner;
import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Service
public class ScanUserInput {

    public String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();

        return userInput;
    }

    public void init() {
        String userInput = readUserInput();
    }
}
