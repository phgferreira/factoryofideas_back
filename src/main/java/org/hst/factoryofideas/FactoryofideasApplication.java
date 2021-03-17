package org.hst.factoryofideas;

import java.util.ArrayList;
import java.util.List;

import org.hst.factoryofideas.model.Sector;
import org.hst.factoryofideas.repository.SectorRepository;
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
		
		// Inicia as variávies
		List<String> responsible = new ArrayList<String>();
		Sector sector = null;
		List<Sector> sectors = new ArrayList<Sector>();
		
		// Preenche com os devidos valores
		responsible = new ArrayList<String>();
		responsible.add("max.grotz@hst.org.br");
		sector = new Sector(1, "Tecnologia da Informação", responsible);
		sectors.add(sector);

		responsible = new ArrayList<String>();
		responsible.add("max.grotz@hst.org.br");
		sector = new Sector(2, "Controle de Infecção", responsible);
		sectors.add(sector);
		
		responsible = new ArrayList<String>();
		responsible.add("max.grotz@hst.org.br");
		sector = new Sector(3, "Nutrição", responsible);
		sectors.add(sector);

		responsible = new ArrayList<String>();
		responsible.add("max.grotz@hst.org.br");
		sector = new Sector(4, "Gestão da Qualidade", responsible);
		sectors.add(sector);

		responsible = new ArrayList<String>();
		responsible.add("max.grotz@hst.org.br");
		sector = new Sector(5, "Contas a Receber", responsible);
		sectors.add(sector);
		
		// Insere todos esses dados no repositório
		SectorRepository.setSectors(sectors);
	}

}
