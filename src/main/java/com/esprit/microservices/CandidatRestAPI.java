package com.esprit.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CandidatRestAPI {
	
	private String title= "Hello, I'm the candidate MS";
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}

}
