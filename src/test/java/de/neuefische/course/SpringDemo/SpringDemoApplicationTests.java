package de.neuefische.course.SpringDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringDemoApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(true,"Context was not loaded.");
	}

}
