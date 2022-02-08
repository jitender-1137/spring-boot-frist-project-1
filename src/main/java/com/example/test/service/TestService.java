package com.example.test.service;

import com.example.test.demo.Test;

import java.util.List;

public interface TestService {

    List<Test> getUser();
    Test saveUser(Test test);
    void deleteUser(Long id);
}
