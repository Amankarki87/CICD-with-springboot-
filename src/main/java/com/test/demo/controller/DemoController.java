package com.test.demo.controller;

import com.test.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public ResponseEntity<Object> getTestData() {
        String testData = demoService.getTestData();
        return new ResponseEntity<>(testData, HttpStatus.OK);
    }

}
