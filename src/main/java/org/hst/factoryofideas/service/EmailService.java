package org.hst.factoryofideas.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.hst.factoryofideas.model.Idea;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EmailService {

	private static String formatContent(String content) {
		return content;
	}
	
	public static void sendEmail(Idea idea) throws URISyntaxException {
		String content = formatContent(idea.getSuggestion());
	
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		headers.set("Content-Type", "application/json");
		
		HttpEntity<String> request = new HttpEntity<>(content, headers);
		
		URI uri = new URI("http://localhost:43003/email/send");
		ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
 	}
}
