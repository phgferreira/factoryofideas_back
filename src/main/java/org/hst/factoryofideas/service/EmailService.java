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
		
		builder.append("<head>");
			builder.append("<style>");
				builder.append("h3 {");
					builder.append("text-align: center;");
				builder.append("}");
				builder.append("header {");
					builder.append("margin-left: auto;");
					builder.append("margin-rightt: auto;");
					builder.append("width: 100%;");
					builder.append("max-width: 600px;");
					builder.append("border: solid;");
				builder.append("}");
			builder.append("</style>");
		builder.append("</head>");
		builder.append("<body>");
			builder.append("<header>");
				builder.append("<h3>Central de Ideias</h3>");
				builder.append("<p><strong>Nome:</strong> " + (idea.getName().equals("") ? "Anônimo" : idea.getName()) + "</p>");
				builder.append("<p><strong>Contato:</strong> " + (idea.getContact().equals("") ? "" : idea.getContact()) + "</p>");
				builder.append("<p><strong>Setor:</strong> " + idea.getSector().getName() + "</p>");
				builder.append("<p><strong>Sugestão:</strong><br/>" + idea.getSuggestion() + "</p>");
			builder.append("</header>");
		builder.append("</body>");
		
		return builder.toString();
	}
	
	public static void sendEmail(Idea idea) throws URISyntaxException {
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
		/*ResponseEntity<?> result =*/ restTemplate.postForEntity(uri, request, ResponseEntity.class);
		
		//return result;
 	}
}
