package com.nab.fnxl.service;

import com.nab.fnxl.configurations.OperationFactory;
import com.nab.fnxl.exceptions.OperationException;
import com.nab.fnxl.scanner.DisplayInfo;
import com.nab.fnxl.service.arithmetic.Operation;
import com.nab.fnxl.utils.ExtractUserInputUtils;
import com.nab.fnxl.validations.ValidationUtil;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


/**
 * Created by svshinde83 on 25/02/2017.
 */
@Service
@ComponentScan
@Qualifier(value = "scanUserInput")
public class ScanUserInput {

    private static final Logger logger = LoggerFactory.getLogger(ScanUserInput.class);

    @Autowired
    private ValidationUtil validationUtil;

    @Autowired
    private DisplayInfo displayInfo;

    @Autowired
    private ExtractUserInputUtils extractUserInputUtils;

    private String userInput;

    /**
     * Reads the user input on command line / terminal
     *
     * @return
     */
    public String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine().trim();
        return userInput;
    }

    /**
     * This function executes the calculator flow.
     * 1. Prompts the user to enter input to calculate.
     * 2. Reads the user input
     * 3. Checks if the user wants to quit the app.
     * 4. Validate the user input
     * 5. Extract the user Input into a List to compute further
     * 6.Calculate the operands using the operator.
     * 7. Handles if any invalid input entered or if any exceptions during calculations.
     */
    public void init() {
        while (true) {

            try {
                displayInfo.promptUserInformation();
                String userInput = readUserInput();

                if (userInput.equalsIgnoreCase("q")) {
                    displayInfo.printExitMessage();
                    System.exit(1);
                }

                boolean isValidUserInput = validationUtil.validateUserInput(userInput);

                if (isValidUserInput) {
                    List<String> stringsDelimited = extractUserInputUtils.getStringsDelimited(userInput.trim());
                    System.out.println(stringsDelimited.toString());

                    Operation operation = OperationFactory.getOperation(stringsDelimited.get(2));
                    logger.debug("Got operation : " + operation);
                    BigDecimal result = operation.calculate(stringsDelimited);
                    System.out.println("Result : " + result);

                } else {
                    System.out.println("Please provide natural numbers or any valid operation out of + or - or /  or *");
                }
            } catch (OperationException e) {
                System.out.println("Please provide natural numbers or any valid operation out of + or - or /  or * ");
            }

        }
    }
}
