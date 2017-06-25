package com.nun.wjq.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nun.wjq.project.mapper.ProjectMapper;
import com.nun.wjq.project.model.ProjectWithBLOBs;

public class ProjectServiceImpl implements ProjectService{
	@Autowired ProjectMapper projectMapper;

	@Override
	public void insertProject(ProjectWithBLOBs projectWithBLOBs) {
		projectMapper.insert(projectWithBLOBs);
	}
}
