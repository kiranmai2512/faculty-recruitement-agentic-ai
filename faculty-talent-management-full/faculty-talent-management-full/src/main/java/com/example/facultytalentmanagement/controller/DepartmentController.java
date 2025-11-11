package com.example.facultytalentmanagement.controller;

import com.example.facultytalentmanagement.domain.Department;
import com.example.facultytalentmanagement.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    // ✅ GET /departments → show page + list all departments
    @GetMapping
    public String listDepartments(Model model) {
        model.addAttribute("departments", departmentService.list());
        model.addAttribute("department", new Department()); // for the form
        return "departments"; // this must match departments.html
    }

    // ✅ POST /departments → add new department
    @PostMapping
    public String addDepartment(@ModelAttribute Department department) {
        departmentService.create(department);
        return "redirect:/departments";
    }
}
