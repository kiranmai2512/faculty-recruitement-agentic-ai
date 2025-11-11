package com.example.facultytalentmanagement.service;

import com.example.facultytalentmanagement.domain.JobOpening;
import com.example.facultytalentmanagement.domain.JobStatus;
import com.example.facultytalentmanagement.repository.JobOpeningRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobOpeningRepository jobRepo;

    public List<JobOpening> listAll() {
        return jobRepo.findAll();
    }

    public JobOpening save(JobOpening job) {
        job.setStatus(JobStatus.OPEN);
        return jobRepo.save(job);
    }
}
