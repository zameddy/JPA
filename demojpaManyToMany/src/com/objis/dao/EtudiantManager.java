package com.objis.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.demojpa.domaine.Etudiant;

public class EtudiantManager {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
	
	public void save(Etudiant f)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		em.persist(f);
		tx.commit();
		em.close();
	}
}