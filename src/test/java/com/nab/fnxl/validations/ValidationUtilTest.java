package com.nab.fnxl.validations;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by svshinde83 on 25/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidationUtilTest {

    @Autowired
    private ValidationUtil util;

    @Test
    public void testValidUserInput() throws Exception {

        assertTrue(util.validateUserInput("25*88"));
    }


    @Test
    public void testInValidUserInput() throws Exception {

        assertFalse(util.validateUserInput("456~879874"));
    }

    @Test
    public void testList(){
        assertEquals("^[0-9]+[.]?[0-9]* ?[/*+-] ?[0-9]+[.]?[0-9]*$",util.getMyList().get(0));
    }
}