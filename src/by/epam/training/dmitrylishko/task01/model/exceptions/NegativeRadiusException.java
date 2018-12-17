package by.epam.training.dmitrylishko.task01.model.exceptions;

public class NegativeRadiusException extends Exception {
    public NegativeRadiusException() {
    }

    public NegativeRadiusException(String message, Throwable exception) {
        super(message, exception);
    }

    public NegativeRadiusException(String message) {
        super(message);
    }

    public NegativeRadiusException(Throwable exception) {
        super(exception);
    }
}
