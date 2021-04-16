package pl.adiks.springexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.adiks.springexceptionhandling.exception.OrderServiceException;
import pl.adiks.springexceptionhandling.model.OrderError;

@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(OrderServiceException.class)
    public ResponseEntity<Object> mapException(OrderServiceException ex) {

        OrderError error = new OrderError(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
