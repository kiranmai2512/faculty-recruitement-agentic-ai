package com.example.facultytalentmanagement.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class DepartmentRequest {
    @NotBlank
    private String name;

    @Size(max = 255)
    private String description;
}
