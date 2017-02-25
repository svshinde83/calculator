package com.nab.fnxl.service.arithmetic;

import java.math.BigDecimal;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public interface Operation {

    BigDecimal calculate(BigDecimal operand1, BigDecimal operand2);
}
