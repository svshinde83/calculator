package com.nab.fnxl.configurations;

import com.nab.fnxl.exceptions.OperationException;
import com.nab.fnxl.service.arithmetic.Addition;
import com.nab.fnxl.service.arithmetic.Division;
import com.nab.fnxl.service.arithmetic.Substraction;
import com.nab.fnxl.service.arithmetic.Multiplication;
import com.nab.fnxl.service.arithmetic.Operation;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by svshinde83 on 25/02/2017.
 * <p>
 * This is a factory pattern implementation to get Operations from an operationsMap.
 */
@Component
public class OperationFactory {

    private static final Logger logger = LoggerFactory.getLogger(OperationFactory.class);

    private static final Map<String, Operation> operationsMap = new HashMap() {{
        put("+", new Addition());
        put("-", new Substraction());
        put("*", new Multiplication());
        put("/", new Division());
    }};

    /**
     * @param key Operation key like : + or - to input
     * @return Operation associated with the key
     * @throws OperationException if the key is not found in the allowable list then throws exception.
     */
    public static Operation getOperation(String key) throws OperationException {
        logger.debug("fetching operation for key : {} ", key);
        Operation operation = operationsMap.get(key);

        if (null == operation) {

            logger.error("Operation not found for :{}", key);
            throw new OperationException("Operation could not be found for the key :" + key);
        }
        return operation;
    }


}
