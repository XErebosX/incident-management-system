package com.myself.incidentmanagementtool.service.impl;

import com.myself.incidentmanagementtool.dto.Incident;
import com.myself.incidentmanagementtool.service.IncidentService;
import com.myself.incidentmanagementtool.util.DatabaseConnectionIncident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IncidentServiceImpl implements IncidentService {
    @Autowired
    private DatabaseConnectionIncident databaseConnectionIncident;

    @Override
    public List<Incident> getIncidents() {
        return databaseConnectionIncident.getIncidents();
    }
}
