package com.objis.demojpa.domaine;

/*
 * Une table par classe fille

    Une table pour chaque entit�, mais les propri�t�s communes sont regroup�es
    La cl� �trang�re r�f�rence la cl� primaire de la table dont elle h�rite
    L�id est h�rit� de la classe m�re

Avantage:

    Les contraintes not-null sont possibles
    Meilleurs performances que la strat�gie � table par classe concr�te �

Inconvenient:

    Performances moins bonnes que la strat�gie � table par hi�rarchie de classes �


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
