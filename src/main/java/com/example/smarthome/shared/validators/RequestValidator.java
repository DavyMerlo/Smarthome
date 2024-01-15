package com.example.smarthome.shared.validators;

public interface RequestValidator<T> {

    void validate (T request);
}
