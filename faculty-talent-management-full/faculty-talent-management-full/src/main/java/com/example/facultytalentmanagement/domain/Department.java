package com.example.facultytalentmanagement.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity @Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                 // unique identifier

    @Column(nullable = false, unique = true, length = 100)
    private String name;             // e.g., "Computer Science"

    @Column(length = 255)
    private String description;      // brief info
}
