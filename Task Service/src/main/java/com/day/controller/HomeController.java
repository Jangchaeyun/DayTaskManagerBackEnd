package com.day.controller;

import com.day.model.Task;
import com.day.model.TaskStatus;
import com.day.model.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/tasks")
    public ResponseEntity<String> getAssignedUsersTask() {
        return new ResponseEntity<>("welcome to task service", HttpStatus.OK);
    }
}