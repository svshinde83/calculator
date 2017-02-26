package com.nab.fnxl.service.arithmetic;

import com.nab.fnxl.exceptions.OperationException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by svshinde83 on 26/02/2017.
 */
public class DivisionTest {


    private Operation div;

    private List<String> stringsDelimitedList;

    @Before
    public void setup() {
        div = new Division();
        stringsDelimitedList = new ArrayList<>(3);

    }

    @Test
    public void testFloatSum() throws OperationException {
        stringsDelimitedList.add("7.2345");
        stringsDelimitedList.add("2");
        BigDecimal result = div.calculate(stringsDelimitedList);
        Assert.assertEquals(new BigDecimal("3.62"),result);

    }


    @Test
    public void testWholeNumberSum() throws OperationException {
        stringsDelimitedList.add("87");
        stringsDelimitedList.add("566");
        BigDecimal result = div.calculate(stringsDelimitedList);
        Assert.assertEquals(new BigDecimal("0.15"),result);
    }


    @Test
    public void testNegativeNumberSum() throws OperationException {
        stringsDelimitedList.add("-456.5");
        stringsDelimitedList.add("-889798");
        BigDecimal result = div.calculate(stringsDelimitedList);
        Assert.assertEquals(new BigDecimal("0.00"),result);
    }

    @Test
    public void testNegativePositiveNumberSum() throws OperationException {
        stringsDelimitedList.add("-15546");
        stringsDelimitedList.add("8972");
        BigDecimal result = div.calculate(stringsDelimitedList);
        Assert.assertEquals(new BigDecimal("-1.73"),result);

    }

}