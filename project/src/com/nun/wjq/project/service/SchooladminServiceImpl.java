package com.nun.wjq.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nun.wjq.project.mapper.SchooladminMapper;
import com.nun.wjq.project.model.Schooladmin;

public class SchooladminServiceImpl implements SchooladminService{
	
	
	@Autowired SchooladminMapper schooladminMapper;
	@Override
	public void updateSchooladminInfoById(Schooladmin s) {
		// TODO Auto-generated method stub
		schooladminMapper.updateByPrimaryKey(s);
	}

}
