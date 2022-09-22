package com.esprit.microservices;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/jobs")
public class JobRestAPI implements Serializable {
    @Autowired
    private JobRepository jobRepository;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @GetMapping("/{id]")
    public Job getJobById(@PathVariable("id") int id) {
        return jobRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public void updateJob(@PathVariable("etat") Boolean etat,@PathVariable("id") int id) {
        jobRepository.updateEtat(etat, id);
    }
    
}
