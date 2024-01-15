package com.example.smarthome.shared.exceptionresponse;

import com.example.smarthome.shared.validators.ValidationErrorItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Set;

@Data
@Getter
@Builder
public class ValidationErrorResponse {

    @JsonProperty("errors")
    private Set<ValidationErrorItems> validationErrors;

    @JsonProperty("isSuccessful")
    private Boolean isSuccessful;

    @JsonProperty("status")
    private Short status;
}
