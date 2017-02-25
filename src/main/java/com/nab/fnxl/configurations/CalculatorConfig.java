package com.nab.fnxl.configurations;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public class CalculatorConfig {

    @Value("#{'${user.input.regex.pattern}'.split(',')}")
    private List<String> myList;

    public List<String> getMyList() {
        return myList;
    }

}
