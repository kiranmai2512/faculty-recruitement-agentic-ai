package com.example.facultytalentmanagement.service;

import com.example.facultytalentmanagement.domain.Department;
import com.example.facultytalentmanagement.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository; // inject repository

    public Department create(Department d) { // create department
        return departmentRepository.save(d); // persist entity
    }

    public List<Department> list() { // list all
        return departmentRepository.findAll(); // fetch all
    }
}
