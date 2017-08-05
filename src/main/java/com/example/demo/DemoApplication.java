package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping(value = "/", produces = "application/octet-stream")
    @PostMapping(value = "/", produces = "application/octet-stream")
    public byte[] cert() throws IOException {
        byte[] bytes = FileCopyUtils.copyToByteArray(DemoApplication.class.getClassLoader().getResourceAsStream("cert"));
        System.out.println(bytes.length);
        return bytes;
    }
}
