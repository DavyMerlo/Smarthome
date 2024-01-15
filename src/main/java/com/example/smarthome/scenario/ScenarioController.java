package com.example.smarthome.scenario;

import com.example.smarthome.shared.handler.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/scenarios")
@RequiredArgsConstructor
public class ScenarioController {

    private final ScenarioService scenarioService;

    @PostMapping()
    public ResponseEntity<?> saveScenario(@RequestBody ScenarioRequest request){
        var data = scenarioService.saveScenario(request);
        return ResponseHandler.generateResponse(true, HttpStatus.CREATED, data);
    }
}
