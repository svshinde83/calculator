package com.nab.fnxl.validations;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidationUtilTest {

    @Autowired
    private ValidationUtil util;

    @Before
    public void setUp() {
        //util = new ValidationUtil();
    }

    @Test
    public void testValidateUserInput() throws Exception {

        util.validateUserInput("25*88");
    }
}