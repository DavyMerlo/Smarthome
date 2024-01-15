package com.example.smarthome.room;

import com.example.smarthome.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "room")
@SequenceGenerator(
        name="default_gen",
        sequenceName = "room_id_seq",
        allocationSize=1)
public class Room extends BaseEntity {

    private String name;
}
