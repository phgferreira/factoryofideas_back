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
		List<Sector> sectors = new ArrayList<Sector>();
		
		// Preenche com os devidos valores
		responsible = new ArrayList<String>();
		responsible.add("andrea.passos@hst.org.br");
		sectors.add(new Sector(1, "Agendamento Cirúrgico", responsible));
		sectors.add(new Sector(2, "Ambulatório Centro", responsible));
		sectors.add(new Sector(3, "Ambulatório SUS", responsible));
		sectors.add(new Sector(4, "Centro Cirúrgico", responsible));
		sectors.add(new Sector(5, "CME", responsible));
		sectors.add(new Sector(6, "Coordenação de Enfermagem", responsible));
		sectors.add(new Sector(7, "Fisioterapia", responsible));
		sectors.add(new Sector(8, "Fonoaudiologia", responsible));
		sectors.add(new Sector(9, "Gestão de Prontuários", responsible));
		sectors.add(new Sector(10, "Hemodiálise", responsible));
		sectors.add(new Sector(11, "Hemodinâmica", responsible));
		sectors.add(new Sector(12, "NIR (Gestão de Leitos)", responsible));
		sectors.add(new Sector(13, "Plantão Médico", responsible));
		sectors.add(new Sector(14, "Centro Médico (Posto de Enfermagem)", responsible));
		sectors.add(new Sector(15, "Psicologia", responsible));
		sectors.add(new Sector(16, "Serviço Social", responsible));
		sectors.add(new Sector(17, "Supervisão de Enfermagem", responsible));
		sectors.add(new Sector(18, "U.I. Irmã Gregória", responsible));
		sectors.add(new Sector(19, "U.I. Nossa Senhora de Fática", responsible));
		sectors.add(new Sector(20, "U.I. Nossa Senhora da Piedade", responsible));
		sectors.add(new Sector(21, "U.I. Pediatria", responsible));
		sectors.add(new Sector(22, "U.I. Sagrado Coração de Jesus", responsible));
		sectors.add(new Sector(23, "U.I. Santa Catarina", responsible));
		sectors.add(new Sector(24, "U.I. Santa Catarina A", responsible));
		sectors.add(new Sector(25, "U.I. Santa Isabel", responsible));
		sectors.add(new Sector(26, "U.I. Madre Regina (Unid. Mulher)", responsible));
		sectors.add(new Sector(27, "UTI Cardiológica", responsible));
		sectors.add(new Sector(28, "UTI Neonatal", responsible));
		sectors.add(new Sector(29, "UTI São Francisco", responsible));
		sectors.add(new Sector(30, "UTI São José", responsible));
		sectors.add(new Sector(31, "UTI São Judas Tadeu", responsible));

		responsible = new ArrayList<String>();
		responsible.add("michele.oliveira@hst.org.br");
		sectors.add(new Sector(32, "Controladoria", responsible));
		sectors.add(new Sector(99, "Contas a Pagar", responsible));
		sectors.add(new Sector(33, "Contas a Receber", responsible));
		sectors.add(new Sector(34, "Tesouraria", responsible));
		sectors.add(new Sector(35, "Repasse Médico", responsible));
		sectors.add(new Sector(36, "Fiscal", responsible));
		sectors.add(new Sector(37, "Patrimônio", responsible));

		responsible = new ArrayList<String>();
		responsible.add("ana.meireles@hst.org.br");
		sectors.add(new Sector(38, "Segurança do Paciente", responsible));

		responsible = new ArrayList<String>();
		responsible.add("ana.stutzel@hst.org.br");
		sectors.add(new Sector(39, "Gestão da Qualidade", responsible));
		
		responsible = new ArrayList<String>();
		responsible.add("anyelle.souza@hst.org.br");
		sectors.add(new Sector(40, "Gestão de Contratos", responsible));

		responsible = new ArrayList<String>();
		responsible.add("ursula.medeiros@hst.org.br");
		sectors.add(new Sector(41, "Comercial", responsible));

		responsible = new ArrayList<String>();
		responsible.add("max.grotz@hst.org.br");
		sectors.add(new Sector(42, "Tecnologia da Informação", responsible));

		responsible = new ArrayList<String>();
		responsible.add("daniela.smoreira@hst.org.br");
		sectors.add(new Sector(43, "Comunicação", responsible));

		responsible = new ArrayList<String>();
		responsible.add("jose.pereira@acsc.org.br");
		sectors.add(new Sector(44, "Caldeira", responsible));
		sectors.add(new Sector(45, "Engenharia Clínica", responsible));
		sectors.add(new Sector(46, "Infraestrutura", responsible));
		sectors.add(new Sector(47, "Oficina de Mecânica", responsible));
		sectors.add(new Sector(48, "Oficina de Obras", responsible));
		sectors.add(new Sector(49, "Oficina de Pintura", responsible));
		sectors.add(new Sector(50, "Oficina de Refrigeração", responsible));
		sectors.add(new Sector(51, "Oficina de Serralheria", responsible));
		sectors.add(new Sector(52, "Oficina Elétrica", responsible));
		sectors.add(new Sector(53, "Oficina Hidráulica", responsible));

		responsible = new ArrayList<String>();
		responsible.add("sabrina.oliveira@hst.org.br");
		sectors.add(new Sector(54, "Faturamento Convênios", responsible));

		responsible = new ArrayList<String>();
		responsible.add("luzinete.damasceno@hst.org.br");
		sectors.add(new Sector(55, "Faturamento SUS", responsible));

		responsible = new ArrayList<String>();
		responsible.add("leonardo.menezes@hst.org.br");
		sectors.add(new Sector(56, "Diretoria Executiva", responsible));
		sectors.add(new Sector(57, "Secretaria da Administração", responsible));
		sectors.add(new Sector(58, "Transporte", responsible));

		responsible = new ArrayList<String>();
		responsible.add("marcioveiga@hst.org.br");
		sectors.add(new Sector(59, "Corpo Clínico", responsible));
		sectors.add(new Sector(60, "Diretoria Técnica", responsible));
		sectors.add(new Sector(61, "Relacionamento Médico", responsible));
		sectors.add(new Sector(62, "SCIH", responsible));

		responsible = new ArrayList<String>();
		responsible.add("pastoral@hst.org.br");
		sectors.add(new Sector(63, "Pastoral da Saúde", responsible));

		responsible = new ArrayList<String>();
		responsible.add("luciana.nicodemos@hst.org.br");
		sectors.add(new Sector(64, "Medicina do Trabalho", responsible));
		
		responsible = new ArrayList<String>();
		responsible.add("osmir.tavares@hst.org.br");
		sectors.add(new Sector(65, "Segurança do Trabalho", responsible));
		sectors.add(new Sector(66, "Separação de Resíduos", responsible));

		responsible = new ArrayList<String>();
		responsible.add("rodrigo.pinto@hst.org.br");
		sectors.add(new Sector(67, "Administração de Pessoal", responsible));
		sectors.add(new Sector(68, "Educação Permanente", responsible));
		sectors.add(new Sector(69, "Gestão de Pessoas", responsible));
		sectors.add(new Sector(70, "Recrutamento e Seleção", responsible));
		
		responsible = new ArrayList<String>();
		responsible.add("sofia.sucar@hst.org.br");
		sectors.add(new Sector(71, "Cafeteria", responsible));
		sectors.add(new Sector(72, "Centro Médico", responsible));
		sectors.add(new Sector(73, "Copiadora", responsible));
		sectors.add(new Sector(74, "CRC", responsible));
		sectors.add(new Sector(75, "Estacionamento", responsible));
		sectors.add(new Sector(76, "Higienização", responsible));
		sectors.add(new Sector(77, "Hotelaria", responsible));
		sectors.add(new Sector(78, "Internação Convênios", responsible));
		sectors.add(new Sector(79, "Internação SUS", responsible));
		sectors.add(new Sector(80, "Jardinagem", responsible));
		sectors.add(new Sector(81, "Recepção Ambulatório SUS", responsible));
		sectors.add(new Sector(82, "Recepção Hemodiálise", responsible));
		sectors.add(new Sector(83, "Recepção Plantão Médico", responsible));
		sectors.add(new Sector(84, "Rouparia", responsible));
		sectors.add(new Sector(85, "Segurança Patrimonial", responsible));
		sectors.add(new Sector(86, "SND", responsible));
		sectors.add(new Sector(87, "SPP", responsible));
		sectors.add(new Sector(88, "Telefonia", responsible));
		sectors.add(new Sector(89, "Trailer", responsible));
		sectors.add(new Sector(90, "Vigilância", responsible));

		responsible = new ArrayList<String>();
		responsible.add("livia.alves@acsc.org.br");
		sectors.add(new Sector(91, "Almoxarifado", responsible));
		sectors.add(new Sector(92, "Almoxarifado de Consignados", responsible));
		sectors.add(new Sector(93, "Central de Abastecimento Farmacêutico", responsible));
		sectors.add(new Sector(94, "Compras", responsible));
		sectors.add(new Sector(95, "Farmácia Central", responsible));
		sectors.add(new Sector(96, "Farmácia Satélite Centro Cirúrgico", responsible));
		sectors.add(new Sector(97, "Farmácia Satélite PA 24h", responsible));
		sectors.add(new Sector(98, "Suprimentos", responsible));
		
		// Insere todos esses dados no repositório
		SectorRepository.setSectors(sectors);
		
	}
	
}
