package com.demo.demojpa;

import com.demo.dao.ProjectManager;
import com.demo.demojpa.domaine.Project;
import com.demo.demojpa.domaine.ProjectId;

public class DemoJpa {

	public static void main(String[] args) {
		
		ProjectManager pm = new ProjectManager();
		ProjectId pjId = new ProjectId();
		pjId.setDepartmentId(1);
		pjId.setProjectId(1L);
		
		Project p = new Project();
		p.setId(pjId);
		p.setNom("projet 1");
		pm.create(p);
	}

}
