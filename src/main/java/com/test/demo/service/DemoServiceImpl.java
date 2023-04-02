package com.test.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getTestData() {
        return "Testing CI/CD with Jenkins";
    }
}
