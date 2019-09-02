import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Lab1 Tests
 */
public class Lab1Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private static final String TEST_STRING = "Hello World";

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Should print TEST_STRING
     */
    @Test
    public void shouldPrintString() {
        Lab1.printString(TEST_STRING);
        assertEquals(TEST_STRING, outContent.toString());
    }

    /**
     * Executes main and checks for TEST_STRING
     */
    @Test
    public void shouldExecuteMain() {
        String[] mainTestArgs = new String[] {};
        Lab1.main(mainTestArgs);
        assertEquals(TEST_STRING, outContent.toString());
    }
}