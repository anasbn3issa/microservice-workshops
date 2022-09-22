package com.esprit.microservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private int id;
    private String service;
    private Boolean etat;

    public Job() {
    }

    public Job(String service, Boolean etat) {
        this.service = service;
        this.etat = etat;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    
}
