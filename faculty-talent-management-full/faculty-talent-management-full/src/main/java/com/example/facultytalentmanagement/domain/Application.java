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
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private JobOpening job;

    private String applicantName;
    private String applicantEmail;
    private String resumeLink;
    private LocalDate appliedOn;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;
}
