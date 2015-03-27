package com.objis.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
	
	public void delete(Formation f)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		em.remove(f);
		tx.commit();
		em.close();
	}
	
	public Formation getById(long fid)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		Formation f=null;
		tx.begin();
		f=em.find(Formation.class, fid);
		tx.commit();
		em.close();
		return f;
	}
	
	public Formation updateFormation(long fid)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		Formation f=null;
		tx.begin();
		f=em.find(Formation.class, fid);
		f.setTheme("SPRING");
		tx.commit();
		em.close();
		return f;
	}
	
	public Formation updateFormation2(long fid)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		Formation f=null;
		tx.begin();
		f=em.getReference(Formation.class, fid);
		f.setTheme("STRUTS2");
		tx.commit();
		em.close();
		return f;
	}
	
	public Formation deleteFormation(long fid)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx =  em.getTransaction();
		Formation f=null;
		tx.begin();
		f=em.getReference(Formation.class, fid);
		em.remove(f);
		tx.commit();
		em.close();
		return f;
	}
	
}
