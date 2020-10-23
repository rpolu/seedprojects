package com.server.app.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan(basePackages = "com.server.app.*") })
@EnableMongoRepositories("com.server.app.*")
public class AppRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppRunner.class, args);
	}

}
