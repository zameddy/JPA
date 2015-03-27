package com.objis.demojpa.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Cl� primaire)
	
	private String nom;
	private String prenom;
	private int anneeExperience;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAnneeExperience() {
		return anneeExperience;
	}
	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}
	public Formateur(String nom, String prenom, int anneeExperience) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.anneeExperience = anneeExperience;
	}
	public Formateur() {
		super();
	}
	
	
	
	
}
