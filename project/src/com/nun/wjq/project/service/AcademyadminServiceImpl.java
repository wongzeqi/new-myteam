package com.nun.wjq.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nun.wjq.project.mapper.AcademyadminMapper;
import com.nun.wjq.project.model.Academyadmin;

public class AcademyadminServiceImpl implements AcademyadminService{

	@Autowired AcademyadminMapper academyadminMapper; 
	@Override
	public void updateAcademyadminInfoById(Academyadmin s) {
		// TODO Auto-generated method stub
		academyadminMapper.updateByPrimaryKeySelective(s);
	}

}
