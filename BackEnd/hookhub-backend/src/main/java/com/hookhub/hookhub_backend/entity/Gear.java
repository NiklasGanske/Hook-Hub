package com.hookhub.hookhub_backend.entity;

import com.hookhub.hookhub_backend.enums.GearStatus;
import com.hookhub.hookhub_backend.enums.GearType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gear {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Long userId;
    private GearType gearType;
    private String sensorId;
    private GearStatus gearStatus;

}
