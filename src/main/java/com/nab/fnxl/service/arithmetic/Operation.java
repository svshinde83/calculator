package com.nab.fnxl.service.arithmetic;

import com.nab.fnxl.exceptions.OperationException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public interface Operation {

    BigDecimal calculate(List<String> operandsList) throws OperationException;
}
