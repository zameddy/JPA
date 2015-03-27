package com.objis.demojpa.domaine;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="FORMATION_ID")
public class FormationIntra extends Formation{
	private String niveau;
	
	public FormationIntra() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getNiveauPersonnalisationSupports() {
		return niveau;
	}

	public void setNiveauPersonnalisationSupports(
			String niveauPersonnalisationSupports) {
		this.niveau = niveauPersonnalisationSupports;
	}
	
	public FormationIntra (String theme, String personnalisation)
	{
		super(theme);
		this.niveau = personnalisation;
	}
}
