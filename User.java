package com.example.nsbm_student_hub.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password; // Encrypted
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
}