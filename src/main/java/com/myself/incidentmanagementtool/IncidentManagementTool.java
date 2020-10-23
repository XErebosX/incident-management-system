package com.myself.incidentmanagementtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.myself.incidentmanagementtool.repository")
@SpringBootApplication
public class IncidentManagementTool {

	public static void main(String[] args) {
		SpringApplication.run(IncidentManagementTool.class, args);
	}

}
