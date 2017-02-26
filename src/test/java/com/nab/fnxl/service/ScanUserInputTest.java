package com.nab.fnxl.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

/**
 * Created by svshinde83 on 26/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScanUserInputTest {

    @Autowired
    private ScanUserInput scanUserInput;

    @Ignore
    @Test
    public void test_init_q_quit() throws Exception {

        String input = "q";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        scanUserInput.init();

    }

    @Ignore
    @Test
    public void test_init_valid_Operand_Operator() throws Exception {

        String input = "22 / 56";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        scanUserInput.init();

    }

    @Ignore
    @Test
    public void test_init_invalid_Operands() throws Exception {

        String input = "-1982*-e56";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        scanUserInput.init();

    }

    @Ignore
    @Test
    public void test_init_invalid_Operator() throws Exception {

        String input = "546~588654.45";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        scanUserInput.init();

    }


}