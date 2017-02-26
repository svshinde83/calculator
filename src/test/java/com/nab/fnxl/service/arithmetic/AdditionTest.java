package com.nab.fnxl.service.arithmetic;

import com.nab.fnxl.exceptions.OperationException;
import com.nab.fnxl.service.arithmetic.Addition;
import com.nab.fnxl.service.arithmetic.Operation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdditionTest {

    @Autowired
    private Addition add;

    private List<String> stringsDelimitedList;

    @Before
    public void setup() {
        stringsDelimitedList = new ArrayList<>(3);

    }

    @Test
    public void testFloatSum() throws OperationException {
        stringsDelimitedList.add("22.5");
        stringsDelimitedList.add("36.5");
        assertEquals("59.0", add.calculate(stringsDelimitedList).toPlainString());
    }


    @Test
    public void testWholeNumberSum() throws OperationException {
        stringsDelimitedList.add("45");
        stringsDelimitedList.add("565");
        assertEquals("610", add.calculate(stringsDelimitedList).toPlainString());

    }


    @Test
    public void testNegativeNumberSum() throws OperationException {
        stringsDelimitedList.add("-12.5");
        stringsDelimitedList.add("-898");
        assertEquals("-910.5", add.calculate(stringsDelimitedList).toPlainString());
    }

    @Test
    public void testNegativePositiveNumberSum() throws OperationException {
        stringsDelimitedList.add("-89");
        stringsDelimitedList.add("56");
        assertEquals("-33", add.calculate(stringsDelimitedList).toPlainString());

    }

}