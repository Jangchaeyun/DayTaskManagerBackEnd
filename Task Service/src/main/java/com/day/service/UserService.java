package com.day.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "USER_SERVICE", url = "")
public interface UserService {
}
