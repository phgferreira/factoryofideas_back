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
		String htmlContent = ""
		+ "<head>"
		+ "<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>"
		+ "<style>"
		+ "	.App {"
		+ "  	text-align: center;"
		+ "	}"
		+ ""
		+ "	.App-header {"
		+ "  	min-height: 100vh;"
		+ "  	display: flex;"
		+ "  	flex-direction: column;"
		+ "  	align-items: center;"
		+ "  	justify-content: center;"
		+ "  	background-color: grey;"
		+ "	}"
		+ ""
		+ "	.Frame {"
		+ " 	margin-top: 20px;"
		+ "  	margin-bottom: 20px;"
		+ "  	width: 600px;"
		+ "  	background-color: rgb(0, 68, 131);"
		+ "  	color: white;"
		+ "  	border-radius: 20px;"
		+ "  	display: flex;"
		+ "  	flex-direction: column;"
		+ "  	align-items: center;"
		+ "  	justify-content: center;"
		+ "	}"
		+ ""
		+ "	.Logo {"
		+ "  	width: 180px;"
		+ " 	margin-top: 5px;"
		+ "	}"
		+ "</style>"
		+ "</head>"
		+ "<body>"
		+ "	<header class='App-Header'>"
		+ "	<div class='Frame'>"
		+ "		<img src='http://localhost:43001/img/favicon.jpg' class='Logo' alt=''/>"
		+ ""
		+ "		<h3>Central de Ideias</h3>"
		+ ""
		+ "		<p><strong>Nome:</strong> " + (idea.getName().equals("") ? "Anônimo" : idea.getName()) + "</p>"
		+ "		<p><strong>Contato:</strong> " + (idea.getContact().equals("") ? "" : idea.getContact()) + "</p>"
		+ "		<p><strong>Setor:</strong> " + idea.getSector().getName() + "</p>"
		+ "		<p><strong>Sugestão:</strong><br/>" + idea.getSuggestion() + "</p>"
		+ "	</div>"
		+ "	</header>"
		+ "</body>";
		
		return htmlContent;
	}
	
	public static ResponseEntity<String> sendEmail(Idea idea) throws URISyntaxException {
		// Formata a ideia para uma página HTML em String
		String content = format(idea);

		// Endereço do microserviço
		URI uri = new URI("http://localhost:43003/email/send");
		
		// Configura o cabeçalho
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// Cria o corpo da requisição
		Map<String, String> body = new HashMap<String, String>();
		body.put("recipient", "paulo.ferreira@hst.org.br");
		body.put("title", "Central de Ideias");
		body.put("content", content);
		
		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(body, headers);
		
		// Dispara a requisição e recebe o resultado
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
		
		return result;
 	}
}
