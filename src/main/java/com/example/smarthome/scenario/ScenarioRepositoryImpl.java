package com.example.smarthome.scenario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ScenarioRepositoryImpl implements ScenarioRepository{

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    @Transactional
    public Scenario saveScenario(Scenario scenario) {
        entityManager.persist(scenario);
        entityManager.flush();
        return scenario;
    }
}
