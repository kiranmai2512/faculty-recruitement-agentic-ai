package com.example.facultytalentmanagement.repository;

import com.example.facultytalentmanagement.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {}
