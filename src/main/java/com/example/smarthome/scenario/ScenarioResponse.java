package com.example.smarthome.scenario;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScenarioResponse<T> {

    private T scenario;
}
