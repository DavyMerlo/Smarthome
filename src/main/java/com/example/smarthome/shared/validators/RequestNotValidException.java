package com.example.smarthome.shared.validators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class RequestNotValidException extends RuntimeException{

    private Set<ValidationErrorItems> validationErrors;
}
