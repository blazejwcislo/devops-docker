package com.blazej.devops_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsDockerApplication {

	public static void main(String[] args) {
		System.out.println("RUNNING");
		System.out.println("---------------------Starting Spring Boot application...");
		SpringApplication.run(DevopsDockerApplication.class, args);
	}

}
