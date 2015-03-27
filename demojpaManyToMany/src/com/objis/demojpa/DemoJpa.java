package com.objis.demojpa;


import com.objis.dao.EtudiantManager;
import com.objis.dao.FormationManager;
import com.objis.demojpa.domaine.Etudiant;

public class DemoJpa {

	public static void main(String[] args) {
		
		FormationManager fm = new FormationManager();
		EtudiantManager em = new EtudiantManager();
		Etudiant e = new Etudiant();
		e.setNom("toto");
		em.save(e);
	
	}
}
