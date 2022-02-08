package com.example.test.controller;

import com.example.test.demo.Test;
import com.example.test.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService){
        this.testService=testService;
    }

    @GetMapping
    public List<Test> getUser(){
        return testService.getUser();
    }

    @PostMapping("/user")
    public ResponseEntity<Test> saveUser(@RequestBody Test test){
        return new ResponseEntity<Test>(testService.saveUser(test), HttpStatus.CREATED);
    }

}
