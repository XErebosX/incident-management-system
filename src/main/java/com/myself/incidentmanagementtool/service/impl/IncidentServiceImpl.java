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
        return incidentRepository.findAll();
    }

    @Override
    public Incident getIncidentById(Integer id) throws Exception {
        return incidentRepository.findById(id.toString()).orElseThrow(() -> new Exception("Student not found - " + id));
    }

    @Override
    public void createIncident(Incident incident) {
        try{
            incidentRepository.saveAndFlush(incident);
            System.out.println(incident.getId()+"<-----------------------------------------------");
        }catch (Exception e){
            System.out.println(e);
            System.out.println(incident.getId()+"<-----------------------------------------------");
        }
    }
}
