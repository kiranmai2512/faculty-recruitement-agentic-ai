package com.example.facultytalentmanagement.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CreateJobRequest {
    @NotNull
    private Long departmentId;

    @NotBlank
    private String title;

    @NotNull @Min(1)
    private Integer totalPositions;

    private LocalDate applicationDeadline;

    @Size(max = 1000)
    private String requirements;
}
