package com.example.smarthome.scenario;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;

public record ScenarioRequest(
        @NotEmpty(message = "Name should not be empty")
        @JsonProperty("name")
        String name) {
}
