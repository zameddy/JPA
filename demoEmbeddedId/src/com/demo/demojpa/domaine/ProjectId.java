package com.demo.demojpa.domaine;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProjectId implements Serializable{
	int departmentId;
	long projectId;
	public ProjectId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentId;
		result = prime * result + (int) (projectId ^ (projectId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectId other = (ProjectId) obj;
		if (departmentId != other.departmentId)
			return false;
		if (projectId != other.projectId)
			return false;
		return true;
	}
	
	
}
