package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.controller.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
