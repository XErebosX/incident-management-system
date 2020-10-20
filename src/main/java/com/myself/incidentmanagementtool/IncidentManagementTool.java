package com.myself.incidentmanagementtool;

import com.myself.incidentmanagementtool.util.TryAndError;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncidentManagementTool {

	public static void main(String[] args) {
		SpringApplication.run(IncidentManagementTool.class, args);
		new TryAndError().verwalteKlasse();
	}

}
