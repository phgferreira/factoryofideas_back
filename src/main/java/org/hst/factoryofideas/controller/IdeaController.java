package org.hst.factoryofideas.controller;

import org.hst.factoryofideas.model.Idea;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idea")
public class IdeaController {

	@PostMapping(value = "/sendMail")
	private String sendMail(@RequestBody Idea idea) {
		System.out.println("Resultado recebido com sucesso!\n" + idea.toString());
		return "Resultado recebido com sucesso!\n" + idea.toString();
	}
}
