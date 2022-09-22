package com.esprit.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/candidats")
public class CandidatRestAPI {
	@Autowired
	CandidatRepository candidatRepository;

	@Autowired
	CandidatService candidatService;
	
	private String title= "Hello, I'm the candidate MS";
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	
	@GetMapping("/searchbyname/{nom}")
	@ResponseBody
	public List<Candidat> getCandidatesByName(@PathVariable("nom") String nom)
	{
		return candidatRepository.candidatByNom(nom);		
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Candidat> create(@RequestBody Candidat candidat) {
		return new ResponseEntity<>(candidatService.saveCandidat(candidat), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Candidat> update(@PathVariable("id") int id, @RequestBody Candidat candidat) {
		return new ResponseEntity<>(candidatService.updateCandidat(id,candidat), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> delete(@PathVariable("id") int id) {
		return new ResponseEntity<>(candidatService.deleteCandidat(id), HttpStatus.OK);
	}
}
