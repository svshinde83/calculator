package com.nab.fnxl.validations;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@RunWith(SpringRunner.class)

public class ValidationUtilTest {


    private ValidationUtil util;

    @Before
    public void setUp() {
        util = new ValidationUtil();
    }

    @Ignore
    @Test
    public void testValidateUserInput() throws Exception {

        util.validateUserInput("25*88");

    }
}