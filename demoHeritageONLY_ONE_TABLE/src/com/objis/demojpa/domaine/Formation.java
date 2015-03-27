package com.objis.demojpa.domaine;

/*
 * 
    Toutes les propri�t�s de toutes les classes parentes et classes filles sont mapp�es 
    dans la m�me table
    Les instances sont diff�renci�es par une colonne sp�ciale discriminante 
    (permet de distinguer les diff�rents types de la hi�rarchie d�h�ritage 
    c�t� relationnel)
    L�identifiant est h�rit�e de la classe m�re

    Avantage: Mise en �uvre tr�s simple
Inconv�nient : Contrainte nullable obligatoire pour les champs correspondant 
aux classes filles
 */
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlSeeAlso;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_FORMATION")
@DiscriminatorValue("MERE")
//@XmlSeeAlso(value = { FormationInter.class,FormationIntra.class })
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Cl� primaire)
	
	private String theme; // Th�me formation
	
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
	
	// Constructeurs
	public Formation(String theme) {
		super();
		this.theme = theme;
	}
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}
