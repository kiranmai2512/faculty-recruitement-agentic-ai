package com.example.facultytalentmanagement.controller;

import com.example.facultytalentmanagement.domain.Application;
import com.example.facultytalentmanagement.service.ApplicationService;
import com.example.facultytalentmanagement.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;
    private final JobService jobService;

    // ✅ GET /applications — show the page and list existing applications
    @GetMapping
    public String showApplications(Model model) {
        model.addAttribute("applications", applicationService.listAll());
        model.addAttribute("jobs", jobService.listAll());
        model.addAttribute("application", new Application());
        return "applications"; // must match templates/applications.html
    }

    // ✅ POST /applications — handle form submission
    @PostMapping
    public String addApplication(@ModelAttribute Application application) {
        applicationService.save(application);
        return "redirect:/applications";
    }
}
