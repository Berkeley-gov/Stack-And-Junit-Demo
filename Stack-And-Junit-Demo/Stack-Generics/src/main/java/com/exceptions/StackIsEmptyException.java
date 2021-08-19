package com.exceptions;

public class StackIsEmptyException extends RuntimeException {
    public StackIsEmptyException() {
        super();
    }

    public StackIsEmptyException(String message) {
        super(message);
    }
}
