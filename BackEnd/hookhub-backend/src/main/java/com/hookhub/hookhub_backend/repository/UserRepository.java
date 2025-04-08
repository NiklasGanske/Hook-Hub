package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
