package org.hst.factoryofideas.model;

import java.io.Serializable;

public class Idea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8603051633890314515L;

	private String name;
	
	private String suggestion;
	
	private Sector sector;

	@Override
	public String toString() {
		return "Idea [name=" + name + ", suggestion=" + suggestion + ", sector=" + sector.toString() + "]";
	}
	
	public Idea() {
		
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
