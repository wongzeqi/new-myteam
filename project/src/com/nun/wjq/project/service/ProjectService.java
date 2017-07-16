package com.nun.wjq.project.service;

import com.nun.wjq.project.model.ProjectWithBLOBs;

public interface ProjectService {

	void insertProject(ProjectWithBLOBs projectWithBLOBs);
	
	void setChangeReason(ProjectWithBLOBs pb);

	void submitRemove(ProjectWithBLOBs pb);

	void deleteProjectById(int pid);

	void updateProjectInfoById(ProjectWithBLOBs project);

	void teacheragreeremove(ProjectWithBLOBs project);

	void teacherdisagreeremove(ProjectWithBLOBs project);

	void teacheragreechange(ProjectWithBLOBs project);

	void teacherdisagreechange(ProjectWithBLOBs project);

}
