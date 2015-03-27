package com.objis.demojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.dao.FormationManager;
import com.objis.demojpa.domaine.Formation;

public class DemoJpa {

	public static void main(String[] args) {
		FormationManager fm = new FormationManager();
		//faire une boucle sur la liste des formations
		System.out.println(fm.ListFormation());
		System.out.println(fm.TrouveFormation("SPRING"));
	}
}