package com.nab.fnxl.exceptions;

/**
 * Created by svshinde83 on 25/02/2017.
 * This class prints error messages caught while executing calculations
 */
public class OperationException extends Exception {
    public OperationException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
