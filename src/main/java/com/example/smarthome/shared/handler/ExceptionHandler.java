package com.example.smarthome.shared.handler;

import ch.qos.logback.core.spi.ErrorCodes;
import com.example.smarthome.shared.exceptionresponse.ApiErrorResponse;
import com.example.smarthome.shared.exceptionresponse.ValidationErrorResponse;
import com.example.smarthome.shared.validators.RequestNotValidException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleUnknownException(
            final Exception exception,
            final HttpServletRequest request
    ) {
        var response = ApiErrorResponse.builder()
                .errorCode(ErrorCodes.EMPTY_MODEL_STACK)
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .statusName(HttpStatus.INTERNAL_SERVER_ERROR.name())
                .path(request.getRequestURI())
                .method(request.getMethod())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(RequestNotValidException.class)
    public ResponseEntity<?> handleException(RequestNotValidException exception){

        var response = ValidationErrorResponse.builder()
                .validationErrors(exception.getValidationErrors())
                .isSuccessful(false)
                .status((short) HttpStatus.BAD_REQUEST.value())
                .build();

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
