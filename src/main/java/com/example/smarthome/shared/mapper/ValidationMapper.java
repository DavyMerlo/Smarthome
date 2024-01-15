package com.example.smarthome.shared.mapper;


import com.example.smarthome.shared.validators.ValidationErrorItems;
import jakarta.validation.ConstraintViolation;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ValidationMapper<T> implements Function<ConstraintViolation<T>, ValidationErrorItems> {

    @Override
    public ValidationErrorItems apply(ConstraintViolation<T> violation) {
        return new ValidationErrorItems(
                violation.getPropertyPath().toString(),
                violation.getMessage()
        );
    }
}