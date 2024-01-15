package com.example.smarthome.action;

import com.example.smarthome.device.Device;
import com.example.smarthome.devicestate.DeviceState;
import com.example.smarthome.scenario.entity.Scenario;
import com.example.smarthome.shared.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "action")
@SequenceGenerator(
        name="default_gen",
        sequenceName = "action_id_seq",
        allocationSize=1)
public class Action extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "scenario_id")
    private Scenario scenario;

    @OneToOne
    @JoinColumn(name = "device_id")
    private Device device;

    @OneToOne
    @JoinColumn(name = "devicestate_id")
    private DeviceState deviceState;

    private String settings;
}
