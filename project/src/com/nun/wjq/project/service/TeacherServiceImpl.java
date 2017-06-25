package com.nun.wjq.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nun.wjq.project.mapper.TeacherMapper;
import com.nun.wjq.project.model.Teacher;

public class TeacherServiceImpl implements TeacherService{
	@Autowired TeacherMapper teacherMapper;
	@Override
	public void updateTeacherInfoById(Teacher t) {
		teacherMapper.updateByPrimaryKeySelective(t);
	}

}
