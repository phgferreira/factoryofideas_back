package org.hst.factoryofideas.model;

import java.io.Serializable;
import java.util.List;

public class Sector implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2757895643165404311L;

	private Integer id;
	
	private String name;
	
	private List<String> responsible;
	
	public Sector(Integer id, String name, List<String> responsible) {
		super();
		this.id = id;
		this.name = name;
		this.responsible = responsible;
	}

	@Override
	public String toString() {
		return "Sector [id=" + id + ", name=" + name + ", responsible=" + responsible + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getResponsible() {
		return responsible;
	}

	public void setResponsible(List<String> responsible) {
		this.responsible = responsible;
	}	
	
	
}
