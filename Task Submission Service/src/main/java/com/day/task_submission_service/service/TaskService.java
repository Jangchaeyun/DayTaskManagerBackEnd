package com.day.task_submission_service.service;

import com.day.task_submission_service.modal.TaskDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "SUBMISSION SERVICE", url = "http://localhost:8082/")
public interface TaskService {

    @GetMapping("/api/tasks/{id}")
    public ResponseEntity<TaskDto> getTaskById(
            @PathVariable Long id,
            @RequestHeader("Authorization") String jwt) throws Exception;

    @PutMapping("api/tasks/{id}/complete")
    public ResponseEntity<Task> completeTask(
            @PathVariable Long id
    ) throws Exception;
}
