package exception;

import java.text.ParseException;

public class BirthdayFormatException extends Exception {
    public BirthdayFormatException() {
    }

    public BirthdayFormatException(String message) {
        super(message);
    }


}
