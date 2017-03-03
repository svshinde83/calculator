package com.nab.fnxl.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
public class CalculatorApplicationTest {

    @Autowired
    private CalculatorApplication calculatorApplication;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void test_init_negative_Operands() throws Exception {

        String input = "-1982*-e56";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals(null, result);
        assertEquals("Please provide natural numbers or any valid operation out of + or - or /  or *", outContent.toString().trim());
    }

    @Test
    public void test_init_invalid_Operator() throws Exception {

        String input = "546~588654.45";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals(null, result);
        assertEquals("Please provide natural numbers or any valid operation out of + or - or /  or *", outContent.toString().trim());
    }

    @Test
    public void test_init_first_negative_Operand() throws Exception {

        String input = "-487/13135";
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals(null, result);
        assertEquals("Please provide natural numbers or any valid operation out of + or - or /  or *", outContent.toString().trim());
    }

    /**
     * Ignored this test as it quits the test suite
     *
     * @throws Exception
     */
    @Ignore
    @Test
    public void test_init_q_quit() throws Exception {

        String input = "q";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        calculatorApplication.calculate(input);
    }

    @Test
    public void test_init_valid_division_Operator() throws Exception {

        String input = "22 / 56";
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals(result.toString(), "0.39");
    }

    @Test
    public void test_init_valid_addition_Operator() throws Exception {

        String input = "456.46+489";
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals("945.46", result.toString());
    }

    @Test
    public void test_init_valid_substraction_Operator() throws Exception {

        String input = "1564897-464";
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals("1564433", result.toString());
    }

    @Test
    public void test_init_valid_multiplication_Operator() throws Exception {

        String input = "54687*1132154.5";
        BigDecimal result = calculatorApplication.calculate(input);
        assertEquals("61914133141.5", result.toString());
    }
}