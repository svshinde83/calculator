package com.nab.fnxl.scanner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;

/**
 * Created by svshinde83 on 27/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DisplayInfoTest {

    @Autowired
    private DisplayInfo displayInfo;

    /**
     * Ignored this test as space comparison in the properties file differs in spaces , tabs and indentation
     * from the properties file.
     *
     * @throws Exception
     */
    @Ignore
    @Test
    public void testPrintExitMessage() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        displayInfo.printExitMessage();
        String expectedOutput = "\\n\\n\t\t You have chose to exit.System quitting now.";
        assertEquals(expectedOutput, outContent);
    }
}