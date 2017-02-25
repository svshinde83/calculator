package com.nab.fnxl.service;

import com.nab.fnxl.service.arithmetic.Addition;
import com.nab.fnxl.service.arithmetic.Operation;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by svshinde83 on 25/02/2017.
 */
public class AdditionTest {

    private Operation add;


    @Before
    public void setup(){
            add = new Addition();

    }
    @Test
    public void testFloatSum(){
        System.out.println(add.calculate(new BigDecimal(22.5), new BigDecimal(36.5)));

    }


    @Test
    public void testWholeNumberSum(){
        System.out.println(add.calculate(new BigDecimal(45), new BigDecimal(565)));

    }


    @Test
    public void testNegativeNumberSum(){
        System.out.println(add.calculate(new BigDecimal(-12.5), new BigDecimal(-898)));
    }

    @Test
    public void testNegativePositiveNumberSum(){
        System.out.println(add.calculate(new BigDecimal(-89), new BigDecimal(56)));

    }



}