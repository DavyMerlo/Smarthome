package com.example.smarthome.scenario;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScenarioServiceImpl implements ScenarioService{

    private final ScenarioRepository scenarioRepository;
    private final ScenarioMapper scenarioMapper;

    @Override
    public ScenarioResponse<ScenarioData> saveScenario(ScenarioRequest request) {
        Scenario saved = scenarioRepository.saveScenario(scenarioMapper.apply(request));
        return scenarioMapper.mapResponse(saved);
    }
}
