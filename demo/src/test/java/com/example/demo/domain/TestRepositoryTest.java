package com.example.demo.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepositoryTest {
	
	@Autowired
	private TestRepository testRepository;
	
	@Test
	public void test(){
		com.example.demo.domain.Test test = new com.example.demo.domain.Test();
		test.setTest("hello");
		test.setBh("2");
		testRepository.save(test);
		
		Assert.assertEquals(1, testRepository.findAll().size());
	}
}
