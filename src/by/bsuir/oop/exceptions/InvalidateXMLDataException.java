package by.bsuir.oop.exceptions;

/**
 * Created by Иван on 28.02.2016.
 */
public class InvalidateXMLDataException extends Exception {

    public InvalidateXMLDataException(String message) {
        super(message);
    }

    public InvalidateXMLDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidateXMLDataException(Throwable cause) {
        super(cause);
    }
}
