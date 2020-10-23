package com.myself.incidentmanagementtool.service.impl;

import com.myself.incidentmanagementtool.entity.Incident;
import com.myself.incidentmanagementtool.repository.IncidentRepository;
import com.myself.incidentmanagementtool.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IncidentServiceImpl implements IncidentService {
    @Autowired
    private IncidentRepository incidentRepository;

    @Override
    public List<Incident> getAllActive() {
        //return incidentMapper.getIncidents();
        return incidentRepository.findAll();
    }
}
