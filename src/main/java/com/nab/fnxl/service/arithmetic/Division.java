package com.nab.fnxl.service.arithmetic;

import com.nab.fnxl.exceptions.OperationException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@Component
public class Division implements Operation {

    @Override
    public BigDecimal calculate(List<String> operandsList) throws OperationException {

        BigDecimal operand1 = new BigDecimal(operandsList.get(0));
        BigDecimal operand2 = new BigDecimal(operandsList.get(1));

        if (operand2.intValue() == 0) {

            throw new OperationException("Any number divided by 0 gives an infinite number ");
        }
        return operand1.divide(operand2, 2, RoundingMode.HALF_UP);
    }
}
