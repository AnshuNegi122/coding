package com.codeplateform.coding.service;

import com.codeplateform.coding.entity.Submission;
import com.codeplateform.coding.repository.SubmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {
    private final SubmissionRepository submissionRepository;

    public SubmissionService(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }

    public Submission saveSubmission(Submission submission) {
        return submissionRepository.save(submission);
    }
}

