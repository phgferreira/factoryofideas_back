package org.hst.factoryofideas.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.hst.factoryofideas.model.Idea;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EmailService {

	private static String format(Idea idea) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("<body>");
			builder.append("<h3>Central de Ideias</h3>");
			builder.append("<p>Nome: " + (idea.getName() != null ? idea.getName() : "Anônimo") + "</p>");
			builder.append("<p>" + idea.getSuggestion() + "</p>");
		builder.append("</body>");
		
		return builder.toString();
	}
	
	public static ResponseEntity<?> sendEmail(Idea idea) throws URISyntaxException {
		// Formata a ideia para uma página HTML em String
		String content = format(idea);

		// Endereço do microserviço
		URI uri = new URI("http://localhost:43003/email/send");
		
		// Configura o cabeçalho
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		//JSONObject json = new JSONObject();
		//json.put("enderecos", "paulo.ferreira@hst.org.br");
		//json.put("title", "Central de Ideias");
		//json.put("body", body);
		
		Map<String, String> body = new HashMap<String, String>();
		body.put("recipient", "paulo.ferreira@hst.org.br");
		body.put("title", "Central de Ideias");
		body.put("content", content);
		
		// Cria a requisição
		//HttpEntity<String> request = new HttpEntity<String>(json.toString(), headers);

		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(body, headers);
		
		// Dispara a requisição e recebe o resultado
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> result = restTemplate.postForEntity(uri, request, ResponseEntity.class);
		
		return result;
 	}
}
