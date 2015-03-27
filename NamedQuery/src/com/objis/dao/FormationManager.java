package com.objis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.objis.demojpa.domaine.Formation;

public class FormationManager {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
	
	public List<Formation> ListFormation()
	{
		List<Formation> resultat;
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		Query query = em.createNamedQuery("Formation.findAll");
		resultat=query.getResultList();
		tx.commit();
		em.close();
		return resultat;
	}
	
	public List<Formation> TrouveFormation(String theme)
	{
		List<Formation> resultat;
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		Query query = em.createNamedQuery("Formation.findByTheme").setParameter(1, theme);
		resultat=query.getResultList();
		tx.commit();
		em.close();
		return resultat;
	}
}
