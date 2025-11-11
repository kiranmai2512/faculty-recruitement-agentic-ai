package com.example.facultytalentmanagement.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "job_openings")
public class JobOpening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Department department;

    private String title;
    private Integer totalPositions;
    private LocalDate applicationDeadline;
    private String requirements;

    @Enumerated(EnumType.STRING)
    private JobStatus status;
}
