package by.bsuir.oop.exceptions;

/**
 * Created by Иван on 29.02.2016.
 */
public class CreatorException extends Exception {
    public CreatorException(String message) {
        super(message);
    }

    public CreatorException(String message, Throwable cause) {
        super(message, cause);
    }


    public CreatorException(Throwable cause) {
        super(cause);
    }
}
