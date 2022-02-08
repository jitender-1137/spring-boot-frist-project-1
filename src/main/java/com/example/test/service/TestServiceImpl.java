package com.example.test.service;

import com.example.test.demo.Test;
import com.example.test.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

	private final TestRepository testRepository;

	public TestServiceImpl(TestRepository testRepository) {
		this.testRepository = testRepository;
	}

	@Override
	public List<Test> getUser() {
		return testRepository.findAll();
	}

	public Test saveUser(Test test) {
		return testRepository.save(test);
	}

	@Override
	public void deleteUser(Long id) {
			testRepository.deleteById(id);

	}
}
