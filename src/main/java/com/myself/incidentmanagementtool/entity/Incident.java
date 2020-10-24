package com.myself.incidentmanagementtool.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Incident {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "incident_name")
    private String incidentName;

    @NotNull
    @Column(name = "error_reason")
    private String errorReason;

    @NotNull
    @Column(name = "how_to_fix")
    private String howToFix;

    @NotNull
    @Column(name = "urgency")
    private String urgency;

    @NotNull
    @Column(name = "contact_team")
    private String contactTeam;

    @NotNull
    @Column(name = "effort")
    private String effort;

    @NotNull
    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncidentName() {
        return incidentName;
    }

    public void setIncidentName(String incidentName) {
        this.incidentName = incidentName;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public String getHowToFix() {
        return howToFix;
    }

    public void setHowToFix(String howToFix) {
        this.howToFix = howToFix;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getContactTeam() {
        return contactTeam;
    }

    public void setContactTeam(String contactTeam) {
        this.contactTeam = contactTeam;
    }

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
