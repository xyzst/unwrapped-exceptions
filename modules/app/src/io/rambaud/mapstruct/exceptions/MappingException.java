package io.rambaud.mapstruct.exceptions;

public class MappingException extends Exception {

    public MappingException(String message, Throwable cause) {
        super(message, cause);
    }

    public MappingException(String message) {
        super(message);
    }
}
