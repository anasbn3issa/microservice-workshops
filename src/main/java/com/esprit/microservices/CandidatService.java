package com.esprit.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    public Candidat saveCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    public String deleteCandidat(int id) {
        candidatRepository.deleteById(id);
        return "candidat removed !! " + id;
    }

    public Candidat updateCandidat(int id,Candidat candidat) {
        if(candidatRepository.findById(id).isPresent()) {
            Candidat existingCandidat = candidatRepository.findById(id).get();
            existingCandidat.setNom(candidat.getNom());
            existingCandidat.setPrenom(candidat.getPrenom());
            existingCandidat.setEmail(candidat.getEmail());
            return candidatRepository.save(existingCandidat);
        }
        else 
            return null;  
    }

}

