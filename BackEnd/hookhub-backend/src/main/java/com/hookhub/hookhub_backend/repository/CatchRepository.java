package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.Catch;
import java.util.Optional;

public interface CatchRepository extends JpaRepository<Catch, Long> {
    @SuppressWarnings("null")
    Optional<Catch> findById(Long id);
}
