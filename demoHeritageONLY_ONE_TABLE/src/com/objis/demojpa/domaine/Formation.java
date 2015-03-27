package com.objis.demojpa.domaine;

/*
 * 
    Toutes les propriétés de toutes les classes parentes et classes filles sont mappées 
    dans la même table
    Les instances sont différenciées par une colonne spéciale discriminante 
    (permet de distinguer les différents types de la hiérarchie d’héritage 
    côté relationnel)
    L’identifiant est héritée de la classe mère

    Avantage: Mise en œuvre très simple
Inconvénient : Contrainte nullable obligatoire pour les champs correspondant 
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
	private Long id; // Identifiant formation (Clé primaire)
	
	private String theme; // Thème formation
	
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
