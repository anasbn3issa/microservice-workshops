package com.esprit.microservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    @Query("UPDATE Job j SET j.etat = ?1 WHERE j.id = ?2")
    public void updateEtat(Boolean etat, int id);
}
