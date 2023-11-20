package com.lucky.personmanagement.shared.exceptions.handlers;

import com.lucky.personmanagement.shared.exceptions.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class PersonNotFoundExceptionHandler extends RuntimeException{

    @ExceptionHandler(value = PersonNotFoundExceptionHandler.class)
    public ResponseEntity<Object> exception(PersonNotFoundException exception) {
        return new ResponseEntity<>("Person not found", HttpStatus.BAD_REQUEST);
    }
}
