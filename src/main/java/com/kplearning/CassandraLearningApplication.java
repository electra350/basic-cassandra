package com.kplearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.kplearning" })
public class CassandraLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraLearningApplication.class, args);
	}

}
