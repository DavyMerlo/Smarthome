package com.example.smarthome.scenario;

import com.example.smarthome.scenario.entity.Scenario;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ScenarioMapper implements Function<ScenarioRequest, Scenario> {

    @Override
    public Scenario apply(ScenarioRequest request) {
        return new Scenario(request.name());
    }

    public ScenarioResponse<ScenarioData> mapResponse(Scenario scenario) {
        return ScenarioResponse.<ScenarioData>builder()
                .scenario(new ScenarioData(scenario.getId(), scenario.getName()))
                .build();
    }
}
