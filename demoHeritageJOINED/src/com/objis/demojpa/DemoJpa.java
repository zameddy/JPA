package com.objis.demojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.demojpa.domaine.Formation;
import com.objis.demojpa.domaine.FormationInter;
import com.objis.demojpa.domaine.FormationIntra;

public class DemoJpa {

	public static void main(String[] args) {
		
		// 1 : Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet métier
		Formation formationIntra = new FormationIntra("Hibernate","niveau Personnalisation 2");
		Formation formationInter = new FormationInter("JSF",8);
		Formation formation = new Formation("JAVASE");

		// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
		 em.persist(formationIntra);
		 em.persist(formationInter);
		 em.persist(formation);

		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unité de travail JPA 
		em.close();
		emf.close();	
	}
}
