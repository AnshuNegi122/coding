package com.codeplateform.coding.repository;

import com.codeplateform.coding.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}

