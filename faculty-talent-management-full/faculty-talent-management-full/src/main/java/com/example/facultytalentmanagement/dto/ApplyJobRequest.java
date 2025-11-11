package com.example.facultytalentmanagement.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ApplyJobRequest {
    @NotNull
    private Long jobId;

    @NotBlank
    private String applicantName; // e.g., "Piyush"

    @Email @NotBlank
    private String applicantEmail;

    @Size(max = 2000)
    private String resumeLink;
}
