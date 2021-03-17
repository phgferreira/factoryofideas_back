package org.hst.factoryofideas.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.hst.factoryofideas.model.Idea;
import org.hst.factoryofideas.model.Sector;
import org.hst.factoryofideas.repository.SectorRepository;
import org.hst.factoryofideas.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:43001")
@RestController
@RequestMapping("/idea")
public class IdeaController {

	@RequestMapping("/sectors")
	private List<Sector> getSectors() {
		// Envia uma cópia sem os responsáveis
		List<Sector> sectorsWithoutResponsible = new ArrayList<Sector>();
		for (Sector sector : SectorRepository.getSectors())
			sectorsWithoutResponsible.add( new Sector(sector.getId(), sector.getName(), null));

		return sectorsWithoutResponsible;
	}
	
	@PostMapping("/sendMail")
	private ResponseEntity<?> sendMail(@RequestBody Idea idea) throws URISyntaxException {
		
		idea.setSector(SectorRepository.getSector(idea.getSector().getId()));
		EmailService.sendEmail(idea);
		
		return ResponseEntity.ok(idea);
	}
	
}
