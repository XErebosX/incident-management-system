package com.myself.incidentmanagementtool.controller;

import com.myself.incidentmanagementtool.service.impl.IncidentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IncidentController {

    @Autowired
    private IncidentServiceImpl incidentService;

    @GetMapping("/activeincidents")
    public String incidentsstatistic (Model model) {
        model.addAttribute("incidents", incidentService.getAllActive());
        return "activeincidents";
    }
}
