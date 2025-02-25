package com.spring_jenkins.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Running the unit tests");
        assertTrue(true);
	}

}
