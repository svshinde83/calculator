package com.nab.fnxl.validations;

import java.util.List;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public class ValidationUtil {


    @Value("#{'${user.input.regex.pattern}'.split(',')}")
    private List<String> myList;


    public List<String> getMyList() {
        return myList;
    }

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
