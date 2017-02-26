package com.nab.fnxl.service.arithmetic;

import com.nab.fnxl.exceptions.OperationException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;

/**
 * Created by svshinde83 on 26/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SubstractionTest {

    @Autowired
    private Substraction subtract;

    private List<String> stringsDelimitedList;

    @Before
    public void setup() {
        stringsDelimitedList = new ArrayList<>(3);

    }

    @Test
    public void testFloatSubstraction() throws OperationException {
        stringsDelimitedList.add("798.5");
        stringsDelimitedList.add("4564.5465");
        assertEquals("-3766.0465",subtract.calculate(stringsDelimitedList).toPlainString());

    }


    @Test
    public void testWholeNumberSubstraction() throws OperationException {
        stringsDelimitedList.add("45");
        stringsDelimitedList.add("565");
        System.out.println(subtract.calculate(stringsDelimitedList));
        assertEquals("-520",subtract.calculate(stringsDelimitedList).toPlainString());

    }


    @Test
    public void testNegativeNumberSubstraction() throws OperationException {
        stringsDelimitedList.add("-654897");
        stringsDelimitedList.add("-15165465");
        assertEquals("14510568",subtract.calculate(stringsDelimitedList).toPlainString());
    }

    @Test
    public void testNegativePositiveNumberSubstraction() throws OperationException {
        stringsDelimitedList.add("-1254");
        stringsDelimitedList.add("54132");
        assertEquals("-55386",subtract.calculate(stringsDelimitedList).toPlainString());

    }

}