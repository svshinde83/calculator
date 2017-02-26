package com.nab.fnxl.utils;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

/**
 * Created by svshinde83 on 27/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExtractUserInputUtilsTest {


    @Autowired
    private ExtractUserInputUtils utils;


    @Test
    public void testGetStringsDelimitedSubstraction() throws Exception {
        List<String> stringsDelimited = utils.getStringsDelimited("456 / 5464");
        assertEquals("[456, 5464, /]", stringsDelimited.toString());
    }

    @Test
    public void testGetStringsDelimitedmMultiplication() throws Exception {
        List<String> stringsDelimited = utils.getStringsDelimited("1235 * 9999");
        assertEquals("[1235, 9999, *]", stringsDelimited.toString());
    }


    @Test
    public void testGetStringsDelimitedAddition() throws Exception {
        List<String> stringsDelimited = utils.getStringsDelimited("1983000 + 00000");
        assertEquals("[1983000, 00000, +]", stringsDelimited.toString());
    }


    @Test
    public void testGetStringsDelimitedDivision() throws Exception {
        List<String> stringsDelimited = utils.getStringsDelimited("252 - 199.33");
        assertEquals("[252, 199.33, -]", stringsDelimited.toString());
    }

}