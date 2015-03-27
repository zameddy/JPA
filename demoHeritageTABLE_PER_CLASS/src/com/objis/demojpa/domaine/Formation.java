package com.objis.demojpa.domaine;

/*
 * Une table par classe concrète
    Une table pour chaque entité, et seulement les données de cette entité sont dans la table
    La moins bonne des solutions côté performances
    
    

 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
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
