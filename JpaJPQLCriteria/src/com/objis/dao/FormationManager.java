package com.objis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.objis.demojpa.domaine.Formation;

public class FormationManager {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
	
	public void save(Formation f)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		em.persist(f);
		tx.commit();
		em.close();
	}
	// utilisation de JPQL
	public List<Formation> ListFormation()
	{
		List<Formation> resultat;
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		Query query = em.createQuery("from Formation");
		resultat = query.getResultList();
		tx.commit();
		em.close();
		return resultat;
	}
	// utilisation de Criteria
	public List<Formation> ListFormation2()
	{
		List<Formation> resultat;
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Formation> q = cb.createQuery(Formation.class);
		Root<Formation> f=q.from(Formation.class);
		TypedQuery<Formation> query = em.createQuery(q);
		resultat = query.getResultList();
		tx.commit();
		em.close();
		return resultat;
	}
}
