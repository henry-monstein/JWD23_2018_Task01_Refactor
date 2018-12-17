package by.epam.training.dmitrylishko.task01.view;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class PrinterTest {
    @Test
    public void testMessageWrite() {
        String[] message = {"Test print to file"};
        Printer printer = new Printer();
        Read read = new Read();
        printer.printToFile(message);
        assertEquals(read.readFromFile(Printer.DEFAULT_FIlE_NAME),message);
    }

    @Test
    public void testMessagesWrite() {
        String[] messages = {"Test print to file",
                            "Second line",
                            "Third line",
                            "Another line"};
        Printer printer = new Printer();
        Read read = new Read();
        printer.printToFile(messages);
        assertEquals(read.readFromFile(Printer.DEFAULT_FIlE_NAME),messages);
    }
}
