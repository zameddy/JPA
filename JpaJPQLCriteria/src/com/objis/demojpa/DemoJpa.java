package com.objis.demojpa;

import com.objis.dao.FormationManager;
public class DemoJpa {

	public static void main(String[] args) {
		
		FormationManager fm = new FormationManager();
		System.out.println("************************************JPQL*********************************");
		//faire une boucle sur la liste des formations
		System.out.println(fm.ListFormation());
		System.out.println("************************************CRITERIA*********************************");
		//faire une boucle sur la liste des formations
		System.out.println(fm.ListFormation2());
	}
}
