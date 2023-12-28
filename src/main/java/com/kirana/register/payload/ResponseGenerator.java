package com.kirana.register.payload;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Modassir Ali
 * @created 27/12/23 3:10 am
 */

@Getter
public class ResponseGenerator<T> {

    ResponseEntity<CustomApiResponse<T>> response;

    public ResponseGenerator(final HttpStatus httpStatus, final T data) {
        CustomApiResponse<T> customApiResponse = new CustomApiResponse<>(data);
        this.response = new ResponseEntity<>(customApiResponse, httpStatus);
    }

    public ResponseGenerator(final HttpStatus httpStatus, final String message) {
        CustomApiResponse<T> customApiResponse = new CustomApiResponse<>(message);
        this.response = new ResponseEntity<>(customApiResponse, httpStatus);
    }

    public ResponseGenerator(final HttpStatus httpStatus, final T data, final String message) {
        CustomApiResponse<T> customApiResponse = new CustomApiResponse<>(message, data);
        this.response = new ResponseEntity<>(customApiResponse, httpStatus);
    }
}
