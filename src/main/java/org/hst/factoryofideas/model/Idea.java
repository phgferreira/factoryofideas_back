package org.hst.factoryofideas.model;

public class Idea {

	private String name;
	
	private String suggestion;
	
	private Sector sector;

	@Override
	public String toString() {
		return "Idea [name=" + name + ", suggestion=" + suggestion + ", sector=" + sector.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}
	
	
}
