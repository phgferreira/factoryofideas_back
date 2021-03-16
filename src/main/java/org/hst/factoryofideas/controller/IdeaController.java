package org.hst.factoryofideas.controller;

import java.util.List;

import org.hst.factoryofideas.model.Idea;
import org.hst.factoryofideas.repository.IdeaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/idea")
public class IdeaController {

	@RequestMapping("/sectors")
	private List<String> getSectors() {
		return IdeaRepository.getSectors();
	}
	
	@PostMapping(value = "/sendMail")
	private String sendMail(@RequestBody Idea idea) {
		System.out.println(idea.toString());
		return "Success";
	}
}
