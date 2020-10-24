package com.myself.incidentmanagementtool.service;

import com.myself.incidentmanagementtool.entity.Incident;

import java.util.List;

public interface IncidentService {
    public List<Incident> getAllActive();

    public Incident getIncidentById(Integer id) throws Exception;

    public void createIncident(Incident incident);
}
