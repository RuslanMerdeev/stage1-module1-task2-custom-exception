package com.epam.mjc.exception;

/**
 * Used if student with certain id has not been found
 */
public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(Long id, Throwable cause) {
        super(String.format("Could not find student with ID %s", id), cause);
    }
}
