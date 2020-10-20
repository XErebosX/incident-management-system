package com.myself.incidentmanagementtool.util;

import com.myself.incidentmanagementtool.dto.Incident;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Component
public class DatabaseConnectionIncident {

    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "password";


    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public List<Incident> getIncidents(){
        connect();
        return generateIncidentList();
    }

    private List<Incident> generateIncidentList(){
        List<Incident> incidentList = new ArrayList<>();

        while(incidentList.size() != 5){
            Incident incident = new Incident();

            incident.setId(incidentList.size());
            incident.setContactTeam("Team7");
            incident.setEffort("M");
            incident.setHowToFix("Try to restart");
            incident.setName("Name");
            incident.setTrigger("Personal error");
            incident.setUrgency("1.2mio");
            incident.setVersion("1.0");

            incidentList.add(incident);
        }
        return incidentList;
    }
}
