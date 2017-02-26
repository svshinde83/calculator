package com.nab.fnxl.configurations;

import com.nab.fnxl.exceptions.OperationException;
import com.nab.fnxl.service.arithmetic.Addition;
import com.nab.fnxl.service.arithmetic.Operation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.springframework.util.Assert.isTrue;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationFactoryTest {

    private OperationFactory operationFactory;

    @Test
    public void testGetAddition() throws OperationException {
        Class<? extends Operation> operation = OperationFactory.getOperation("+").getClass();
        assertEquals("com.nab.fnxl.service.arithmetic.Addition",operation.getCanonicalName());
    }


    @Test
    public void testGetSubstraction() throws OperationException {
        Class<? extends Operation> operation = OperationFactory.getOperation("-").getClass();
        assertEquals("com.nab.fnxl.service.arithmetic.Substraction",operation.getCanonicalName());
    }

    @Test
    public void testDivision() throws OperationException {
        Class<? extends Operation> operation = OperationFactory.getOperation("/").getClass();
        assertEquals("com.nab.fnxl.service.arithmetic.Division",operation.getCanonicalName());
    }

    @Test
    public void testGetMultiplication() throws OperationException {
        Class<? extends Operation> operation = OperationFactory.getOperation("*").getClass();
        assertEquals("com.nab.fnxl.service.arithmetic.Multiplication",operation.getCanonicalName());
    }


    @Test(expected = OperationException.class)
    public void testGetAdditionWithUnknownKey() throws OperationException {
        doThrow(OperationException.class).when(OperationFactory.getOperation("!"));
        operationFactory.getOperation("!");
    }

}