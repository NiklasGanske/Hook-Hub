package com.hookhub.hookhub_backend.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.SensorData;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {
    @SuppressWarnings("null")
    Optional<SensorData> findById(Long id);
}
