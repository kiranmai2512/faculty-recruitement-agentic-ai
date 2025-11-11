package com.example.facultytalentmanagement.service;

import com.example.facultytalentmanagement.domain.Application;
import com.example.facultytalentmanagement.domain.ApplicationStatus;
import com.example.facultytalentmanagement.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public List<Application> listAll() {
        return applicationRepository.findAll();
    }

    public Application save(Application application) {
        application.setAppliedOn(LocalDate.now());
        application.setStatus(ApplicationStatus.APPLIED);
        return applicationRepository.save(application);
    }
}
