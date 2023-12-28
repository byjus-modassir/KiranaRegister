package com.kirana.register.exception;
/**
 * @author Modassir Ali
 * @created 27/12/23 2:59 am
 */

public class CustomInternalServerException extends RuntimeException {

	public CustomInternalServerException() {
		super();
	}

	public CustomInternalServerException(final String message) {
		super(message);
	}

	public CustomInternalServerException(final String message, Throwable cause) {
		super(message, cause);
	}
}
