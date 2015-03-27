package com.demo.demojpa.domaine;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Project {

	@EmbeddedId 
	private ProjectId id;
	private String nom;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectId getId() {
		return id;
	}
	public void setId(ProjectId id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
