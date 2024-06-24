package com.day.task_submission_service.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "SUBMISSION SERVICE", url = "http://localhost:8082/")
public class TaskService {

}
