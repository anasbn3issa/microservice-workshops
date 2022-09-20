package com.esprit.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidats")
public class CandidatRestAPI {
	@Autowired
	CandidatRepository candidatRepository;
	
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

}
