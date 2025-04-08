package com.hookhub.hookhub_backend.entity;

import java.util.Set;

import com.hookhub.hookhub_backend.enums.GearStatus;
import com.hookhub.hookhub_backend.enums.GearType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gears")
public class Gear {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_ID")
    private User users;
    @Enumerated(EnumType.STRING)
    private GearType gearType;
    @ManyToMany(mappedBy = "gears")
    private Set<SensorData> sensors;
    @Enumerated(EnumType.STRING)
    private GearStatus gearStatus;

}
