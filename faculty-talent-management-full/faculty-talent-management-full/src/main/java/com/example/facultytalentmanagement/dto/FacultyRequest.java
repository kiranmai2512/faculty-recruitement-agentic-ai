package com.example.facultytalentmanagement.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacultyRequest {
    @NotBlank
    private String fullName;

    @Email @NotBlank
    private String email;

    @NotBlank
    private String position;

    @NotNull
    private Long departmentId;
}
