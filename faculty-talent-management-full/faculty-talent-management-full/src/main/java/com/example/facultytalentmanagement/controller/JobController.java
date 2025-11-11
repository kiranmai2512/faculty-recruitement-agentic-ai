package com.example.facultytalentmanagement.controller;

import com.example.facultytalentmanagement.domain.JobOpening;
import com.example.facultytalentmanagement.service.JobService;
import com.example.facultytalentmanagement.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;
    private final DepartmentService departmentService;

    // ✅ GET /jobs - display all jobs + form
    @GetMapping
    public String showJobs(Model model) {
        model.addAttribute("jobs", jobService.listAll());
        model.addAttribute("departments", departmentService.list());
        model.addAttribute("job", new JobOpening());
        return "jobs"; // must match jobs.html
    }

    // ✅ POST /jobs - add new job
    @PostMapping
    public String addJob(@ModelAttribute JobOpening job) {
        jobService.save(job);
        return "redirect:/jobs";
    }
}
