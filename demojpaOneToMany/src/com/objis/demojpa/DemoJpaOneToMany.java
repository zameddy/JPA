package com.objis.demojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.demojpa.domaine.Formateur;
import com.objis.demojpa.domaine.Formation;

public class DemoJpaOneToMany {

	public static void main(String[] args) {
		
		// 1 : Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet métier
		Formation formation = new Formation("Hibernate");
		Formateur formateur1 = new Formateur("Fontan", "Yannick", 8);
		Formateur formateur2 = new Formateur("Mbiandou", "Douglas", 12);
		
		formation.getFormateurs().add(formateur1);
		formation.getFormateurs().add(formateur2);
		
		// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
		em.persist(formateur1);
		em.persist(formateur2);
		em.persist(formation);
		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unité de travail JPA 
		em.close();
		emf.close();	
	}
}
