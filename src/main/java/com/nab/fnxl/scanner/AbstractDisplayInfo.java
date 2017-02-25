package com.nab.fnxl.scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public abstract class AbstractDisplayInfo implements DisplayInformation {

    @Value("${user.input.console.message}")
    private String displayQuitMessage;

    @Value("${user.console.exit.successfull}")
    private String consoleExitMessage;

    @Value("${user.input.console.message}")
    private String mainMessage;

    public String getMainMessage() {
        return mainMessage;
    }

    @Override
    public void promptUserInformation() {
        getMainMessage();
    }


    public String displayTerminateInfo() {
        return displayQuitMessage;
    }

    public String consoleExitMessage() {
        return consoleExitMessage;
    }

    public void printConsoleInformation(){
        System.out.println(mainMessage);
        System.out.println(displayQuitMessage);
    }

}
