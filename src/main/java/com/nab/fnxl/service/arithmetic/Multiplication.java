package com.nab.fnxl.service.arithmetic;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 * <p>
 * This class does the multiplication work.
 */
@Component
public class Multiplication implements Operation {

    /**
     * @param operandsList accepts as a parameter
     * @return multipication calculations from the list
     */
    public BigDecimal calculate(List<String> operandsList) {

        BigDecimal operand1 = new BigDecimal(operandsList.get(0));
        BigDecimal operand2 = new BigDecimal(operandsList.get(1));

        return operand1.multiply(operand2);
    }
}
