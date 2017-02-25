package com.nab.fnxl.scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Service
public class DisplayArithmeticInfo extends AbstractDisplayInfo {

    @Value("${user.input.console.message}")
    private String message;

    public String getMainMessage() {
        return message;
    }


    @Override
    public void promptUserInformation() {
        System.out.println(getMainMessage());
    }
}
