package com.example.smarthome.scenario;

import com.example.smarthome.action.Action;
import com.example.smarthome.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "scenario")
@SequenceGenerator(
        name="default_gen",
        sequenceName = "scenario_id_seq",
        allocationSize=1)
public class Scenario extends BaseEntity {

    private String name;

    @Getter
    @OneToMany(mappedBy = "scenario", cascade = CascadeType.ALL)
    private List<Action> actions;

    @Builder
    public Scenario(String name) {
        this.name = name;
    }
}
