package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.SensorData;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {

}
