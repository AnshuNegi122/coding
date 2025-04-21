package com.codeplateform.coding.controller;

import com.codeplateform.coding.entity.Submission;
import com.codeplateform.coding.service.SubmissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {
    private final SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping
    public ResponseEntity<Submission> submitCode(@RequestBody Submission submission) {
        Submission savedSubmission = submissionService.saveSubmission(submission);
        return ResponseEntity.ok(savedSubmission);
    }
}
