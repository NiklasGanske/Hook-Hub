package com.hookhub.hookhub_backend.entity;

import java.time.LocalDateTime;
import com.hookhub.hookhub_backend.enums.SensorType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    @JoinColumn(name = "gear_ID")
    private Long gearId;
    @Enumerated(EnumType.STRING)
    private SensorType sensorType;
    private String value;
    private LocalDateTime timepStamp;

}
