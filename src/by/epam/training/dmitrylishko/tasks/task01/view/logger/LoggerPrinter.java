package by.epam.training.dmitrylishko.tasks.task01.view.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerPrinter {
    private static Logger logger = LogManager.getRootLogger();

    public void error(String message) {
        logger.error(message);
    }
}
