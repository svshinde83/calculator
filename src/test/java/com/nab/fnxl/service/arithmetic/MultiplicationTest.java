package com.nab.fnxl.service.arithmetic;

import com.nab.fnxl.exceptions.OperationException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by svshinde83 on 26/02/2017.
 */
public class MultiplicationTest {


    private Operation multiply;

    private List<String> stringsDelimitedList;

    @Before
    public void setup() {
        multiply = new Multiplication();
        stringsDelimitedList = new ArrayList<>(3);

    }

    @Test
    public void testFloatSum() throws OperationException {
        stringsDelimitedList.add("22.5");
        stringsDelimitedList.add("36.5");
        System.out.println(multiply.calculate(stringsDelimitedList));

    }


    @Test
    public void testWholeNumberSum() throws OperationException {
        stringsDelimitedList.add("45");
        stringsDelimitedList.add("565");
        System.out.println(multiply.calculate(stringsDelimitedList));

    }


    @Test
    public void testNegativeNumberSum() throws OperationException {
        stringsDelimitedList.add("-12.5");
        stringsDelimitedList.add("-898");
        System.out.println(multiply.calculate(stringsDelimitedList));
    }

    @Test
    public void testNegativePositiveNumberSum() throws OperationException {
        stringsDelimitedList.add("-89");
        stringsDelimitedList.add("56");
        System.out.println(multiply.calculate(stringsDelimitedList));

    }

}