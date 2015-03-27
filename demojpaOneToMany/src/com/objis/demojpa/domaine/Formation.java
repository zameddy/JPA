package com.objis.demojpa.domaine;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Clé primaire)
	
	private String theme; // Thème formation
	
	//@OneToMany(mappedBy="formation")
	@OneToMany
	private Collection<Formateur> formateurs ;
	
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
	
	public Collection<Formateur> getFormateurs() {
		return formateurs;
	}
	public void setFormateurs(Collection<Formateur> formateurs) {
		this.formateurs = formateurs;
	}
	public Formation(String theme, Collection<Formateur> formateurs) {
		super();
		this.theme = theme;
		this.formateurs = formateurs;
	}
	public Formation(String theme) {
		super();
		this.theme = theme;
		this.formateurs = new HashSet<Formateur>();
	}
	
}
