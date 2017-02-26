package com.nab.fnxl.domain;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Component;


import static org.junit.Assert.assertEquals;

/**
 * Created by svshinde83 on 27/02/2017.
 */
public class DataTest {

    private Data data;


    @Before
    public void setup() {
        data = new Data(new BigDecimal(21.0), new BigDecimal(999.5));

    }

    @Test
    public void testGetOperand1() throws Exception {
        assertEquals("21", data.getOperand1().toPlainString());
        assertEquals("999.5", data.getOperand2().toPlainString());
    }

}