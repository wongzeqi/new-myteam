package com.nun.wjq.project.model;

import com.nun.wjq.project.utils.Page;

public class ProjectAndPage {
	private Page page;
	private ProjectWithBLOBs project;
	private String academyname;//封装查询条件 按照学院查询
	
	public String getAcademyname() {
		return academyname;
	}
	public void setAcademyname(String academyname) {
		this.academyname = academyname;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public ProjectWithBLOBs getProject() {
		return project;
	}
	public void setProject(ProjectWithBLOBs project) {
		this.project = project;
	}
	
	
	
}
