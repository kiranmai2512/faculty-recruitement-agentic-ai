package com.example.facultytalentmanagement.controller;

import com.example.facultytalentmanagement.domain.Faculty;
import com.example.facultytalentmanagement.service.FacultyService;
import com.example.facultytalentmanagement.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/faculty")
public class FacultyController {

    private final FacultyService facultyService;
    private final DepartmentService departmentService;

    // ✅ GET /faculty - Show page with all faculty
    @GetMapping
    public String showFacultyPage(Model model) {
        model.addAttribute("facultyList", facultyService.list());
        model.addAttribute("departments", departmentService.list());
        model.addAttribute("faculty", new Faculty());
        return "faculty"; // matches templates/faculty.html
    }

    // ✅ POST /faculty - Add new faculty
    @PostMapping
    public String addFaculty(@ModelAttribute Faculty faculty) {
        facultyService.create(faculty);
        return "redirect:/faculty";
    }
}
