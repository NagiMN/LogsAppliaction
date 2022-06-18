package com.example.logsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogsProjectApplication.class, args);
    }

}
