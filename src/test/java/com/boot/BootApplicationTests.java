package com.boot;

import com.boot.pojo.Grade;
import com.boot.mapper.GradeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootApplicationTests {

	@Autowired
	private GradeMapper gradeMapper;

	@Test
	void contextLoads() {
		List<Grade> list = gradeMapper.selectList(null);
		list.forEach(System.out::println);

	}

}
