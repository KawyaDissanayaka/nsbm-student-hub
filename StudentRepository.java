package com.example.nsbm_student_hub.repository;

import com.example.nsbm_student_hub.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository already includes methods for pagination and sorting
}