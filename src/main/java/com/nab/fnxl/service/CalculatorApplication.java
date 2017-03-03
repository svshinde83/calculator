package com.nab.fnxl.service;

import com.nab.fnxl.configurations.OperationFactory;
import com.nab.fnxl.exceptions.OperationException;
import com.nab.fnxl.scanner.DisplayInfo;
import com.nab.fnxl.service.arithmetic.Operation;
import com.nab.fnxl.utils.ExtractUserInputUtils;
import com.nab.fnxl.validations.ValidationUtil;
import java.math.BigDecimal;
import java.util.List;
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
@Qualifier(value = "calculatorApplication")
public class CalculatorApplication {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorApplication.class);

    @Autowired
    private ValidationUtil validationUtil;

    @Autowired
    private DisplayInfo displayInfo;

    @Autowired
    private ExtractUserInputUtils extractUserInputUtils;

    public BigDecimal calculate(String userInput) {

        BigDecimal result = null;
        try {
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
                result = operation.calculate(stringsDelimited);
                System.out.println("Result : " + result);

            } else {
                System.out.println("Please provide natural numbers or any valid operation out of + or - or /  or *");
            }
        } catch (OperationException e) {
            System.out.println("Please provide natural numbers or any valid operation from + or - or /  or * ");
        }

        return result;
    }
}
