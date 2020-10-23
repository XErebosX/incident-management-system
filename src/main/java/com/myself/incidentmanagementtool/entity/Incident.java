package com.myself.incidentmanagementtool.entity;

import javax.persistence.*;

@Entity
public class Incident {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "incident_name")
    private String name;

    @Column(name = "error_reason")
    private String trigger;

    @Column(name = "how_to_fix")
    private String howToFix;

    @Column(name = "urgency")
    private String urgency;

    @Column(name = "contact_team")
    private String contactTeam;

    @Column(name = "effort")
    private String effort;

    @Column(name = "version")
    private String version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
