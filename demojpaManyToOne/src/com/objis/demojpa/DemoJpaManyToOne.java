package com.objis.demojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.demojpa.domaine.Formation;
import com.objis.demojpa.domaine.Lieu;

public class DemoJpaManyToOne {

	public static void main(String[] args) {
		
		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objets m�tiers + assoctiations
		Formation formation1 = new Formation("Hibernate");
		Formation formation2 = new Formation("Spring");
		Lieu lieu = new Lieu("ObjisParis","72 rue Faubourg St HONORE, Paris 75008");
		
		formation1.setLieu(lieu);
		formation2.setLieu(lieu);
		
		// 4 : Persistance Objet/Relationnel : cr�ation enregistrements en base
		em.persist(lieu); 
		em.persist(formation1);
		em.persist(formation2);
		
		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unit� de travail JPA 
		em.close();
		emf.close();	
	}
}
