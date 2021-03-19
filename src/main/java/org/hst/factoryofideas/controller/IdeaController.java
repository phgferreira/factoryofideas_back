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

@CrossOrigin(origins = {"http://10.7.0.15:50269", "http://localhost:50269", "http://localhost:43001"})
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
	
	@PostMapping("/sendEmail")
	private ResponseEntity<String> sendEmail(@RequestBody Idea idea) throws URISyntaxException {
		// Carega os outros valores do setor selecionado
		Sector sector = SectorRepository.getSector(idea.getSector().getId());
		idea.setSector(sector);
		
		// Envia a idea para o serviço de envio de e-mail
		ResponseEntity<String> result = EmailService.sendEmail(idea);
		
		return result;
	}
	
}
