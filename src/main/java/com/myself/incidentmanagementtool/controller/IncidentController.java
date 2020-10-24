package com.myself.incidentmanagementtool.controller;

import com.myself.incidentmanagementtool.entity.Incident;
import com.myself.incidentmanagementtool.service.impl.IncidentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class IncidentController {

    @Autowired
    private IncidentServiceImpl incidentService;

    @GetMapping("/activeincidents")
    public String incidentsstatistic (Model model) {
        model.addAttribute("incidents", incidentService.getAllActive());
        return "activeincidents";
    }

    @GetMapping(value = "/newincident")
    public String newIncidentGet(Model model) {
        Incident incident = new Incident();

        model.addAttribute("incident", incident);
        return "newincident";
    }

    @PostMapping(value = "/newincident", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String newIncidentPost(@Valid Incident validIncident, @ModelAttribute Incident requestIncident) {

        Incident incident = new Incident();

        incident.setContactTeam(requestIncident.getContactTeam());
        incident.setEffort(requestIncident.getEffort());
        incident.setHowToFix(requestIncident.getHowToFix());
        incident.setIncidentName(requestIncident.getIncidentName());
        incident.setErrorReason(requestIncident.getErrorReason());
        incident.setUrgency(requestIncident.getUrgency());
        incident.setStatus("ACTIVE");

        incidentService.createIncident(incident);

        return "redirect:/activeincidents";
    }
}
