package com.louis.mango.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackupApplication.class, args);
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
