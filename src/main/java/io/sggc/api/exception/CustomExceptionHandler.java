package io.sggc.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;
import org.springframework.web.server.ServerWebInputException;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ServerWebInputException.class)
    public ResponseEntity serverWebInputException(ServerWebInputException e) {
        if (e instanceof WebExchangeBindException) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(getValidationErrors((WebExchangeBindException) e));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    private List<ValidationError> getValidationErrors(WebExchangeBindException ex) {
        return ex.getFieldErrors().stream()
                .map(fieldError -> new ValidationError(fieldError.getField(), fieldError.getDefaultMessage()))
                .collect(Collectors.toList());
    }
}
