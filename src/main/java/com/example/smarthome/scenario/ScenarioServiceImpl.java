package com.example.smarthome.scenario;

import com.example.smarthome.scenario.entity.Scenario;
import com.example.smarthome.shared.validators.RequestValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScenarioServiceImpl implements ScenarioService{

    private final ScenarioRepository scenarioRepository;
    private final ScenarioMapper scenarioMapper;
    private final RequestValidator<ScenarioRequest> scenarioReqValidator;

    @Override
    public ScenarioResponse<ScenarioData> saveScenario(ScenarioRequest request) {
        scenarioReqValidator.validate(request);
        Scenario saved = scenarioRepository.saveScenario(scenarioMapper.apply(request));
        return scenarioMapper.mapResponse(saved);
    }
}
