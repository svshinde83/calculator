package com.nab.fnxl.validations;

import java.util.List;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 * <p>
 * Helper utility functions class.
 */
@Component
public class ValidationUtil {


    @Value("${user.input.regex.pattern}")
    private List<String> myList;


    /**
     * Returns the regex read from myList
     *
     * @return Regex List to return
     */
    public List<String> getMyList() {
        return myList;
    }

    /**
     * Validates user input against the business rules implemented in the regex.
     * Allows 1-9 or any float number as 1st parameter
     * Allows only any of the +/-* operations
     * Pattern is compared with the user input to determine the validity
     *
     * @param userInput accepts String input
     * @return
     */
    public boolean validateUserInput(String userInput) {
        boolean isValid = false;
        for (String regex : myList) {

            if (Pattern.matches(regex, userInput)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
