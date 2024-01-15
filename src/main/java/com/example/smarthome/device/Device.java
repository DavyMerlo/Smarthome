package com.example.smarthome.device;

import com.example.smarthome.deviceType.DeviceType;
import com.example.smarthome.devicestate.DeviceState;
import com.example.smarthome.room.Room;
import com.example.smarthome.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "device")
@SequenceGenerator(
        name="default_gen",
        sequenceName = "device_id_seq",
        allocationSize=1)
public class Device extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    private String name;

    private UUID address;

    @OneToOne
    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "devicetype_id")
    private DeviceType deviceType;

    @OneToOne
    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "devicestate_id")
    private DeviceState deviceState;

    private String settings;
}
