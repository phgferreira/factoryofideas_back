package org.hst.factoryofideas.model;

public class Idea {

	private String name;
	
	private String suggestion;
	
	private String sector;

	public Idea(String name, String suggestion, String sector) {
		this.name = name;
		this.suggestion = suggestion;
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Idea [name=" + name + ", suggestion=" + suggestion + ", sector=" + sector + "]";
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
}
