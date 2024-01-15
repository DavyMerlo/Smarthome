package com.example.smarthome.deviceType;

import com.example.smarthome.devicestate.DeviceStateEnum;
import com.example.smarthome.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "device_type")
@SequenceGenerator(
        name="default_gen",
        sequenceName = "device-type_id_seq",
        allocationSize=1)
public class DeviceType extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private DeviceTypeEnum type;
}
