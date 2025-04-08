package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.Gear;

public interface GearRepository extends JpaRepository<Gear, Long> {

}
