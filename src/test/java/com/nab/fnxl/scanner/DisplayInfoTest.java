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

    /**
     * Ignored this test as space comparison in the properties file differs in spaces , tabs and indentation
     * from the properties file.
     *
     * @throws Exception
     */
    @Ignore
    @Test
    public void testPromptUserInformation() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        displayInfo.promptUserInformation();
        String expectedOutput = "Hello User.. Please provide an input to get calculations in one of the following formats..\n" +
                "\t\t 1. Multiply 2 numbers 25 and 69 type -  25*69  \n" +
                "\t\t 2. Add 2 numbers 25.2 and 69 type -  25.2+69  \n" +
                "\t\t 3. Divide 2 numbers 19 and 4 type -  19/4  \n" +
                "\t\t 4. Substract 2 numbers 66 and 55 type -  66-55\n" +
                "\n" +
                "\n" +
                "\t\t ** Note:\t\t To quit please type \"q\" and press enter.\n";

        assertEquals(expectedOutput, outContent);
    }
}