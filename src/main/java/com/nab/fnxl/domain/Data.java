package com.nab.fnxl.domain;

import java.math.BigDecimal;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class Data {

    private BigDecimal operand1;
    private BigDecimal operand2;

    public Data(BigDecimal operand1, BigDecimal operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public BigDecimal getOperand1() {
        return operand1;
    }

    public BigDecimal getOperand2() {
        return operand2;
    }
}
