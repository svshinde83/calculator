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
public class MultiplicationTest {

    @Autowired
    private Multiplication multiply;

    private List<String> stringsDelimitedList;

    @Before
    public void setup() {
        stringsDelimitedList = new ArrayList<>(3);
    }

    @Test
    public void testFloatMultiplication() throws OperationException {
        stringsDelimitedList.add("9845.5");
        stringsDelimitedList.add("23154.5");
        assertEquals("227967629.75", multiply.calculate(stringsDelimitedList).toPlainString());

    }

    @Test
    public void testWholeNumberMultiplication() throws OperationException {
        stringsDelimitedList.add("984");
        stringsDelimitedList.add("123");
        assertEquals("121032", multiply.calculate(stringsDelimitedList).toPlainString());

    }


    @Test
    public void testNegativeNumberMultiplication() throws OperationException {
        stringsDelimitedList.add("-12.5");
        stringsDelimitedList.add("-898");
        assertEquals("11225.0", multiply.calculate(stringsDelimitedList).toPlainString());
    }

    @Test
    public void testNegativePositiveNumberMultiplication() throws OperationException {
        stringsDelimitedList.add("-89");
        stringsDelimitedList.add("56");
        assertEquals("-4984", multiply.calculate(stringsDelimitedList).toPlainString());
    }

}