package com.example.facultytalentmanagement.service;

import com.example.facultytalentmanagement.domain.Department;
import com.example.facultytalentmanagement.domain.Faculty;
import com.example.facultytalentmanagement.repository.DepartmentRepository;
import com.example.facultytalentmanagement.repository.FacultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FacultyService {

    private final FacultyRepository facultyRepository;
    private final DepartmentRepository departmentRepository;

    public List<Faculty> list() {
        return facultyRepository.findAll();
    }

    public Faculty create(Faculty faculty) {
        // find department reference
        if (faculty.getDepartment() != null && faculty.getDepartment().getId() != null) {
            Department dept = departmentRepository.findById(faculty.getDepartment().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Invalid Department"));
            faculty.setDepartment(dept);
        }
        return facultyRepository.save(faculty);
    }
}
