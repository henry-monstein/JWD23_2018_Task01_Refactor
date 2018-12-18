package by.epam.training.dmitrylishko.tasks.task01.view.logger;

import org.testng.annotations.Test;

public class LoggerPrinterTest {

    @Test
    public void testPerformSomeTask() throws Exception {
        LoggerPrinter logger=new LoggerPrinter();
        logger.error("Some exception");
    }
}
