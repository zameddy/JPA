package com.objis.demojpa.domaine;

/*
 * Une table par classe fille

    Une table pour chaque entité, mais les propriétés communes sont regroupées
    La clé étrangère référence la clé primaire de la table dont elle hérite
    L’id est hérité de la classe mère

Avantage:

    Les contraintes not-null sont possibles
    Meilleurs performances que la stratégie « table par classe concrète »

Inconvenient:

    Performances moins bonnes que la stratégie « table par hiérarchie de classes »


 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
