package com.kirana.register.exception;

/**
 * @author Modassir Ali
 * @created 27/12/23 2:54 am
 */

public class CustomBadRequestException extends RuntimeException {

    public CustomBadRequestException() {
        super();
    }

    public CustomBadRequestException(final String message) {
        super(message);
    }

    public CustomBadRequestException(final String message, Throwable cause) {
        super(message, cause);
    }
}
