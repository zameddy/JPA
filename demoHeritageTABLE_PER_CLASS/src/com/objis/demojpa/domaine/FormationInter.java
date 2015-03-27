package com.objis.demojpa.domaine;

import javax.persistence.Entity;

@Entity
public class FormationInter extends Formation{

	private int nbEntreprises;
	
	public FormationInter()
	{
		super();
	}
	
	public FormationInter(String theme, int nbEntreprises)
	{
		super(theme);
		this.nbEntreprises =  nbEntreprises;
	}
	public FormationInter(int nbEntreprises ) {
		super();
		this.nbEntreprises = nbEntreprises;
		}
	public int getNbEntreprises() {
		return nbEntreprises;
	}
	public void setNbEntreprises(int nbEntreprises) {
		this.nbEntreprises = nbEntreprises;
	}

}
