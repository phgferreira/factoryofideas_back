package org.hst.factoryofideas.model;

public class Idea {

	private String name;
	
	private String sujestion;
	
	private String sector;

	public Idea(String name, String sujestion, String sector) {
		this.name = name;
		this.sujestion = sujestion;
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Idea [name=" + name + ", sujestion=" + sujestion + ", sector=" + sector + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSujestion() {
		return sujestion;
	}

	public void setSujestion(String sujestion) {
		this.sujestion = sujestion;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
}
