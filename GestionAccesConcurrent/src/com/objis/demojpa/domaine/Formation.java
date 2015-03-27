package com.objis.demojpa.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Clé primaire)
	private String theme; // Thème formation
	@Version
	private int version; // gestion des accès concurrents
	
	
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
	
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
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
