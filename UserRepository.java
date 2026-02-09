package com.example.nsbm_student_hub.repository;

import com.example.nsbm_student_hub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Used by CustomUserDetailsService for login
    Optional<User> findByUsername(String username);
}