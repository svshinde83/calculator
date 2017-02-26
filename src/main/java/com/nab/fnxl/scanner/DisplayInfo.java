package com.nab.fnxl.scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public class DisplayInfo implements DisplayInformation {

    @Value("${user.console.exit.message}")
    private String displayQuitMessage;


    @Value("${user.console.exit.successful}")
    private String exitMessage;


    @Value("${user.input.console.message}")
    private String mainMessage;

    public void printExitMessage() {
        System.out.println(exitMessage);
    }


    @Override
    public void promptUserInformation() {
        System.out.println(mainMessage);
        System.out.println(displayQuitMessage);
    }

}
