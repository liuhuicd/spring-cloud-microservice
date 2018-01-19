package com.lxzj.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-service")
public interface TestService {

    @GetMapping("/ribbon/name")
    String getBlogName();
}
