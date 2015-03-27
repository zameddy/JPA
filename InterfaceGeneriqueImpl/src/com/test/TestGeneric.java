package com.test;

import com.dao.PersonneDaoImpl;
import com.dao.VoitureDaoImpl;
import com.metier.Personne;
import com.metier.Voiture;

public class TestGeneric {

	public static void main(String[] args) {
		
		PersonneDaoImpl personneDao = new PersonneDaoImpl();
		VoitureDaoImpl voitureDao = new VoitureDaoImpl();
		Personne p = new Personne("zam","eddy");
		
		personneDao.create(p);
		
		Voiture v = new Voiture("Touran");
		Personne p1 = personneDao.read(1L);
		v.setProprietaire(p1);
		voitureDao.create(v);
	}
}
