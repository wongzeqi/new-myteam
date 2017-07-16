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
	//项目变更
	@Override
	public void setChangeReason(ProjectWithBLOBs pb) {
		//首先他提交申请
		pb.setIschange(1);
		projectMapper.updateByPrimaryKeySelective(pb);
	}
	//撤项
	@Override
	public void submitRemove(ProjectWithBLOBs pb) {
		pb.setIsremove(1);
		pb.setRemovestatus(0);
		projectMapper.updateByPrimaryKeySelective(pb);
	}
	
	//删除未提交的申请
	@Override
	public void deleteProjectById(int pid) {
		projectMapper.deleteByPrimaryKey(pid);
	}
	@Override
	public void updateProjectInfoById(ProjectWithBLOBs project) {
		// TODO Auto-generated method stub
		projectMapper.updateByPrimaryKeySelective(project);
	}
	@Override
	public void teacheragreeremove(ProjectWithBLOBs project) {
		project.setRemovestatus(1);
		projectMapper.updateByPrimaryKeySelective(project);
	}
	@Override
	public void teacherdisagreeremove(ProjectWithBLOBs project) {
		project.setRemovestatus(-1);
		project.setIsremove(0);
		projectMapper.updateByPrimaryKeySelective(project);
		
	}
	@Override
	public void teacheragreechange(ProjectWithBLOBs project) {
		project.setChangestatus(1);
		projectMapper.updateByPrimaryKeySelective(project);
		
	}
	@Override
	public void teacherdisagreechange(ProjectWithBLOBs project) {
		project.setChangestatus(-1);
		project.setIschange(0);
		projectMapper.updateByPrimaryKeySelective(project);
		
	}

	
}
