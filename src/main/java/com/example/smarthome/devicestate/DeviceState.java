package com.example.smarthome.devicestate;

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
@Table(name = "device_state")
@SequenceGenerator(
        name="default_gen",
        sequenceName = "device-state_id_seq",
        allocationSize=1)
public class DeviceState extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private DeviceStateEnum state;
}