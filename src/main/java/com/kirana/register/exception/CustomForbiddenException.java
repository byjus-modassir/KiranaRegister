package com.kirana.register.exception;

/**
 * @author Modassir Ali
 * @created 27/12/23 3:04 am
 */

public class CustomForbiddenException extends RuntimeException{

	public CustomForbiddenException() {
		super();
	}

	public CustomForbiddenException(final String message) {
		super(message);
	}
	
	public CustomForbiddenException(final String message, Throwable cause) {
		super(message, cause);
	}
}
