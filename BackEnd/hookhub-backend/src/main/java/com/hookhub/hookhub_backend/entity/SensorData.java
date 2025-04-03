package com.hookhub.hookhub_backend.entity;

import java.time.LocalDateTime;

import com.hookhub.hookhub_backend.enums.SensorType;

import jakarta.persistence.Entity;
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
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    private Long gearId;
    private SensorType sensorType;
    private String value;
    private LocalDateTime timepStamp;

}
