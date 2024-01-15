package com.example.smarthome.scenario;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ScenarioRequest(
        @JsonProperty("name") String name) {
}
