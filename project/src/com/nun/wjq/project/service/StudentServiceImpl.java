package com.nun.wjq.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nun.wjq.project.mapper.StudentMapper;
import com.nun.wjq.project.model.Student;

public class StudentServiceImpl implements StudentService{
	
	@Autowired StudentMapper studentMapper;
	@Override
	public void updateStudentInfoById(Student student) {
		studentMapper.updateByPrimaryKeySelective(student);
	}
}
