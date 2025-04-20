package com.hookhub.hookhub_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    @SuppressWarnings("null")
    Optional<Post> findById(Long id);
}
