package com.nab.fnxl.service.arithmetic;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 * <p>
 * This class does the substraction work.
 */
@Component
public class Substraction implements Operation {
    /**
     * @param operandsList accepts as a parameter
     * @return substraction calculations from the list
     */
    public BigDecimal calculate(List<String> operandsList) {

        BigDecimal operand1 = new BigDecimal(operandsList.get(0));
        BigDecimal operand2 = new BigDecimal(operandsList.get(1));

        return operand1.subtract(operand2);
    }
}
