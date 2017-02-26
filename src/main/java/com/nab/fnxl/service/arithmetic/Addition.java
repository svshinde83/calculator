package com.nab.fnxl.service.arithmetic;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class Addition implements Operation {

    @Override
    public BigDecimal calculate(List<String> operandsList) {

        BigDecimal operand1 = new BigDecimal(operandsList.get(0));
        BigDecimal operand2 = new BigDecimal(operandsList.get(1));

        return operand1.add(operand2);
    }
}
