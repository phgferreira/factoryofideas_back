package org.hst.factoryofideas;

import java.util.ArrayList;
import java.util.List;

import org.hst.factoryofideas.repository.IdeaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryofideasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FactoryofideasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<String> sectors = new ArrayList<String>();
		sectors.add("Tecnologia da Informação");
		sectors.add("Controle de Infecção");
		sectors.add("Nutrição");
		sectors.add("Gestão da Qualidade");
		sectors.add("Internação de Convênios");
		sectors.add("Internação do SUS");
		
		IdeaRepository.setSectors(sectors);
	}

}
