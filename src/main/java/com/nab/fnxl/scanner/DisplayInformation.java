package com.nab.fnxl.scanner;

import org.springframework.stereotype.Service;

/**
 * Created by svshinde83 on 25/02/2017.
 * <p>
 * Api to handle the user interactions
 */
@Service
public interface DisplayInformation {

    void promptUserInformation();

    void printExitMessage();
}
