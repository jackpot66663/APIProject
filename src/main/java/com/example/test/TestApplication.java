package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collections;

@SpringBootApplication
@EntityScan("com.example.test.pojo.entity")
@EnableJpaRepositories("com.example.test.dao")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TestApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8083"));
		app.run(args);
	}
}
