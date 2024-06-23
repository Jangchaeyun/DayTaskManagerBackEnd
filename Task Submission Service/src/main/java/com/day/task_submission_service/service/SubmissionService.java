package com.day.task_submission_service.service;

import com.day.task_submission_service.modal.Submission;

import java.util.List;

public interface SubmissionService {
    Submission sumbitTask(Long taskId, String githubLink, Long userId) throws Exception;
    Submission getTaskSubmissionById(Long submissionId) throws Exception;
    List<Submission> getAllTaskSubmissions();
    List<Submission> getTaskSubmissionsByTaskId(Long taskId);
    Submission acceptDeclineSubmission(Long id, String status) throws Exception;
}
