package com.example.smarthome.scenario;

public interface ScenarioService {

    ScenarioResponse<ScenarioData> saveScenario(ScenarioRequest request);
}
