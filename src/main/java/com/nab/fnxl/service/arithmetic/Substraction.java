package com.nab.fnxl.service.arithmetic;

import java.math.BigDecimal;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class Substraction implements  Operation{
    @Override
    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2) {
        return operand1.subtract(operand2);
    }
}
