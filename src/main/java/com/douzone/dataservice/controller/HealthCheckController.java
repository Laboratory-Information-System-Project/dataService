package com.douzone.dataservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data-service")
public class HealthCheckController {
    private final Environment env;

    @GetMapping("/healthcheck")
    public String healthCheck(){
        return String.format("this server port is : %s", env.getProperty("local.server.port"));
    }
}
