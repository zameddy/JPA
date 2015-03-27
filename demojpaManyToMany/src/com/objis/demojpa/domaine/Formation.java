package com.objis.demojpa.domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Clé primaire)
	
	private String theme; // Thème formation
	@ManyToMany(mappedBy="formations")
	private Collection<Etudiant> etudiants;
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	
	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	// Constructeur
	public Formation(String theme) {
		super();
		this.theme = theme;
	}
	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + "]";
	}	
	
	
}
