package com.hookhub.hookhub_backend.entity;

import java.time.LocalDateTime;
import java.util.Set;
import com.hookhub.hookhub_backend.enums.SensorType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Table;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sensors")
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    private Set<Gear> gears;
    @Enumerated(EnumType.STRING)
    private SensorType sensorType;
    private String sensorValue;
    private LocalDateTime timepStamp;

}
