package com.nab.fnxl.configurations;

import com.nab.fnxl.exceptions.OperationException;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.mockito.Mockito;


import static com.nab.fnxl.configurations.OperationFactory.getOperation;
import static org.junit.Assert.*;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class OperationFactoryTest {

    private OperationFactory operationFactory;

    @Before
    public void setUp() {
        operationFactory = new OperationFactory();
    }


    @Test
    public void testGetAddition() throws OperationException {
        System.out.println(OperationFactory.getOperation("+").getClass());
    }

    @Test(expected = OperationException.class)
    public void testGetAdditionWithUnknownKey() throws OperationException {

        Mockito.doThrow(OperationException.class).when(OperationFactory.getOperation("!"));

    }


}