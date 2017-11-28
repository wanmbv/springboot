package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, String>{
	Test findByTest(String test);
}
