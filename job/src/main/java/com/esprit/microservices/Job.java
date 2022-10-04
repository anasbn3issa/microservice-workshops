package com.esprit.microservices;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job implements Serializable{

	private static final long serialVersionUID = 6;

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
