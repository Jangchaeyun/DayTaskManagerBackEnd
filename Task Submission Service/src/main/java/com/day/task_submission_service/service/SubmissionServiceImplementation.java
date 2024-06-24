package com.day.task_submission_service.service;

import com.day.task_submission_service.modal.Submission;
import com.day.task_submission_service.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionServiceImplementation implements SubmissionService {
    @Autowired
    private SubmissionRepository submissionRepository;
    
    @Override
    public Submission sumbitTask(Long taskId, String githubLink, Long userId) throws Exception {
        return null;
    }

    @Override
    public Submission getTaskSubmissionById(Long submissionId) throws Exception {
        return null;
    }

    @Override
    public List<Submission> getAllTaskSubmissions() {
        return List.of();
    }

    @Override
    public List<Submission> getTaskSubmissionsByTaskId(Long taskId) {
        return List.of();
    }

    @Override
    public Submission acceptDeclineSubmission(Long id, String status) throws Exception {
        return null;
    }
}
